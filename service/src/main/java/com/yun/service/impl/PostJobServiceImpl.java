package com.yun.service.impl;

import com.yun.beans.entity.CompanyAdmin;
import com.yun.dao.mapper.CompanyAdminMapper;
import com.yun.dao.mapper.CompanyMapper;
import com.yun.dao.mapper.JobMapper;
import com.yun.service.business.PostJobService;
import com.yun.sysytem.vo.ResStatus;
import com.yun.sysytem.vo.ResultVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.entity.Example;

import java.util.List;

@Service
public class PostJobServiceImpl implements PostJobService {

    @Autowired
    JobMapper jobMapper;
    @Autowired
    CompanyAdminMapper companyAdminMapper;
    @Autowired
    CompanyMapper companyMapper;

    @Override
    public ResultVo PostAJob(Integer companyAdminId) {
        String s = companyAdminMapper.companyIdIsEmpty(companyAdminId);
        if (companyAdminId == null) {
            ResultVo resultVo = new ResultVo(ResStatus.NOT_LOGIN, "亲先登录", null);
            return resultVo;
        } else {
            if (s == null) {
                ResultVo resultVo = new ResultVo(ResStatus.NOCOMPANY, "账号未绑定公司信息,请先添加公司信息", null);
                return resultVo;
            } else {
                ResultVo resultVo = new ResultVo(ResStatus.OK, "已经绑定公司信息，开始添加", null);
                return resultVo;

            }
        }
    }
}
