package com.yun.service.impl;

import com.yun.beans.entity.Company;
import com.yun.beans.entity.CompanyAdmin;
import com.yun.beans.vo.CompanyVo;
import com.yun.dao.mapper.CompanyAdminMapper;
import com.yun.dao.mapper.CompanyMapper;
import com.yun.service.business.CompanyDesService;
import com.yun.sysytem.vo.ResStatus;
import com.yun.sysytem.vo.ResultVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.entity.Example;

import java.util.List;

@Service
public class CompanyDesServiceImpl implements CompanyDesService {
    @Autowired
    CompanyMapper companyMapper;
    @Autowired
    CompanyAdminMapper companyAdminMapper;
    @Override
    public ResultVo showCompanyDes(Integer companyAdminId) {

        String s = companyAdminMapper.companyIdIsEmpty(companyAdminId);
        int a = Integer.parseInt(s);
        Example example = new Example(Company.class);
        Example.Criteria criteria = example.createCriteria();
        criteria.andEqualTo("companyId", a);
        List<Company> companies = companyMapper.selectByExample(example);
        ResultVo resultVo = new ResultVo(ResStatus.OK, "success", companies);
        return resultVo;
    }

    @Override
    public ResultVo showCompanyAdmin(Integer companyAdminId) {
        String s = companyAdminMapper.companyIdIsEmpty(companyAdminId);
        int a = Integer.parseInt(s);
        Example example1 = new Example(CompanyAdmin.class);
        Example.Criteria criteria1 = example1.createCriteria();
        criteria1.andEqualTo("companyId",a);
        List<CompanyAdmin> companyAdmins = companyAdminMapper.selectByExample(example1);
        ResultVo resultVo = new ResultVo(ResStatus.OK, "success", companyAdmins);
        return resultVo;
    }
}
