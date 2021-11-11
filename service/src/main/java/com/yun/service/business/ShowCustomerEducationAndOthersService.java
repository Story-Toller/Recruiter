package com.yun.service.business;

import com.yun.sysytem.vo.ResultVo;

public interface ShowCustomerEducationAndOthersService {
    //    展示可见学历
    ResultVo showEducation(Integer custId);

    //    显示可见荣誉
    ResultVo showHonor(Integer custId);

    //    显示可见技能
    ResultVo showSkill(Integer custId);

    //    显示可见工作经验
    ResultVo showWorkExper(Integer custId);

    //    显示可见项目经验
    ResultVo showProject(Integer custId);
}
