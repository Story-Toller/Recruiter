package com.yun.controller;


import com.yun.service.business.ShowIndexCustomerResumeService;
import com.yun.sysytem.vo.ResultVo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/index_cus_res")
@Api(value = "查看首页用户简历", tags = "简历管理")
@CrossOrigin
public class ShowIndexCustomerResumeController {

    @Autowired
    ShowIndexCustomerResumeService showIndexCustomerResumeService;

    @GetMapping("/bash/{custId}")
    @ApiOperation("查询基本信息的接口")
    public ResultVo Information(@PathVariable("custId")Integer custId) {
        ResultVo resultVo = showIndexCustomerResumeService.showAllowCustomerResume(custId);
        return resultVo;
    }

    @GetMapping("/honor/{custId}")
    @ApiOperation("查询荣誉信息的接口")
    public ResultVo honor(@PathVariable("custId")Integer custId) {
        ResultVo resultVo = showIndexCustomerResumeService.showHonor(custId);
        return resultVo;
    }

    @GetMapping("/skill/{custId}")
    @ApiOperation("查询技能信息的接口")
    public ResultVo showSkill(@PathVariable("custId")Integer custId) {
        ResultVo resultVo = showIndexCustomerResumeService.showSkill(custId);
        return resultVo;
    }

    @GetMapping("/workexp/{custId}")
    @ApiOperation("查询工作经验信息的接口")
    public ResultVo showWorkExpri(@PathVariable("custId")Integer custId) {
        ResultVo resultVo = showIndexCustomerResumeService.showWorkExpri(custId);
        return resultVo;
    }

    @GetMapping("/project/{custId}")
    @ApiOperation("查询项目经验信息的接口")
    public ResultVo showProject(@PathVariable("custId")Integer custId) {
        ResultVo resultVo = showIndexCustomerResumeService.showProject(custId);
        return resultVo;
    }

    @GetMapping("/education/{custId}")
    @ApiOperation("查询学历信息的接口")
    public ResultVo showEducation(@PathVariable("custId")Integer custId) {
        ResultVo resultVo = showIndexCustomerResumeService.showEducation(custId);
        return resultVo;
    }
}
