package com.yun.service.business;

import com.yun.sysytem.vo.ResultVo;

public interface ShowIndexCustomerResumeService {

    ResultVo showAllowCustomerResume(Integer custId);
    ResultVo showHonor(Integer custId);
    ResultVo showSkill(Integer custId);
    ResultVo showWorkExpri(Integer custId);
    ResultVo showProject(Integer custId);
    ResultVo showEducation(Integer custId);
}
