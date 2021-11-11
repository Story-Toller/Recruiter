package com.yun.controller;

import com.yun.service.business.ShowCustomerEducationAndOthersService;
import com.yun.sysytem.vo.ResultVo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/showResume")
@Api(value = "展示应聘者简历内各种信息", tags = "简历展示管理")
@CrossOrigin
public class ShowCustomerResumeController {

    @Autowired
    ShowCustomerEducationAndOthersService showcustomer;

    @GetMapping("/education/{custId}")
    @ApiOperation("展示应聘者学历信息")
    public ResultVo showAll(@PathVariable("custId") Integer custId) {
        ResultVo resultVo = showcustomer.showEducation(custId);
        return resultVo;
    }
}
