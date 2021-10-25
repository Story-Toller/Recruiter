package com.yun.service.impl;

import com.yun.beans.entity.CompanyAdmin;
import com.yun.beans.entity.Customer;
import com.yun.dao.mapper.CompanyAdminMapper;
import com.yun.service.business.CompanyAdminService;
import com.yun.sysytem.utils.MD5Utils;
import com.yun.sysytem.vo.ResStatus;
import com.yun.sysytem.vo.ResultVo;
import io.jsonwebtoken.JwtBuilder;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import tk.mybatis.mapper.entity.Example;

import java.util.Date;
import java.util.HashMap;
import java.util.List;

@Service
public class CompanyAdminServiceImpl implements CompanyAdminService {

    @Autowired
    CompanyAdminMapper companyAdminMapper;

    @Override
    public ResultVo adminLogin(String adminEmail, String adminPassword) {
        //        根据用户邮箱查询，这个用户是否被注册
        Example example = new Example(CompanyAdmin.class);
        Example.Criteria criteria = example.createCriteria();
        criteria.andEqualTo("companyAdminEmail", adminEmail);
        List<CompanyAdmin> companyAdmins = companyAdminMapper.selectByExample(example);
        if (companyAdmins.size() == 0) {
            return new ResultVo(ResStatus.NO, "登陆失败,用户名不存在", null);
        } else {
            String s = MD5Utils.md5(adminPassword);
            if (s.equals(companyAdmins.get(0).getCompanyAdminPassword())) {
                JwtBuilder builder = Jwts.builder();
                HashMap<String, Object> objectObjectHashMap = new HashMap<>();
                objectObjectHashMap.put("key1", "value1");
                objectObjectHashMap.put("key2", "value2");
                objectObjectHashMap.put("key3", "value3");

                String token = builder.setSubject(companyAdmins.get(0).getCompanyAdminName())           //设置token中携带的数据
                        .setIssuedAt(new Date())                            //设置token生成时间
                        .setId(companyAdmins.get(0).getCompanyAdminId() + "")            //设置用户id
                        .setClaims(objectObjectHashMap)
                        .setExpiration(new Date(System.currentTimeMillis() + 24 * 60 * 60 * 1000))//设置token过期时间
                        .signWith(SignatureAlgorithm.HS512, "syx12138asdf")     //设置token解密密码
                        .compact();
                return new ResultVo(ResStatus.OK, token, companyAdmins.get(0));
            } else {
                return new ResultVo(ResStatus.NO, "登陆失败,密码错误", null);
            }
        }

    }

    @Transactional
    public ResultVo adminRegister(String adminName, String adminEmail, String adminPassword) {
        synchronized (this) {
//        根据用户邮箱查询，这个用户是否被注册
            Example example = new Example(CompanyAdmin.class);
            Example.Criteria criteria = example.createCriteria();
            criteria.andEqualTo("companyAdminEmail",adminEmail);
            List<CompanyAdmin> companyAdmins = companyAdminMapper.selectByExample(example);

            if (companyAdmins.size() == 0) {
                String md5pwd = MD5Utils.md5(adminPassword);
                CompanyAdmin companyAdmin = new CompanyAdmin();
                companyAdmin.setCompanyAdminName(adminName);
                companyAdmin.setCompanyAdminEmail(adminEmail);
                companyAdmin.setCompanyAdminPassword(md5pwd);
                companyAdmin.setCompanyAdminCreateTime(new Date());

                int i = companyAdminMapper.insert(companyAdmin);
                if (i > 0) {
                    return new ResultVo(ResStatus.OK, "注册成功", null);
                } else {
                    return new ResultVo(ResStatus.NO, "注册失败", null);
                }
            } else {
                return new ResultVo(ResStatus.NO, "邮箱已被占用", null);
            }

        }

    }
}
