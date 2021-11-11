package com.yun.service.impl;

import com.yun.beans.vo.EducationVo;
import com.yun.dao.mapper.EducationMapper;
import com.yun.service.business.ShowCustomerEducationAndOthersService;
import com.yun.sysytem.vo.ResStatus;
import com.yun.sysytem.vo.ResultVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ShowCustomerEducationServiceImpl implements ShowCustomerEducationAndOthersService {

    @Autowired
    EducationMapper educationMapper;

    @Override
    public ResultVo showEducation(Integer custId) {
        if (custId == null) {
            ResultVo resultVo = new ResultVo(ResStatus.LOGIN_TIMEOUT, "failed", null);
            return resultVo;
        } else {
            List<EducationVo> educationVos = educationMapper.showAllEducation(custId);
            ResultVo resultVo = new ResultVo(ResStatus.OK, "success", educationVos);
            return resultVo;
        }
    }

    @Override
    public ResultVo showHonor(Integer custId) {
        return null;
    }

    @Override
    public ResultVo showSkill(Integer custId) {
        return null;
    }

    @Override
    public ResultVo showWorkExper(Integer custId) {
        return null;
    }

    @Override
    public ResultVo showProject(Integer custId) {
        return null;
    }
}
