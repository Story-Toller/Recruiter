package com.yun.controller;

import com.yun.service.business.CustomerService;
import com.yun.sysytem.vo.ResultVo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/customer")
@Api(value = "首页展示所有应聘人员信息", tags = "应聘者管理")
@CrossOrigin
public class CustomerController {
    @Autowired
    CustomerService customerService;

    @GetMapping("/show_all")
    @ApiOperation("展示所有应聘人员")
    public ResultVo showAll(){
        ResultVo resultVo = customerService.showAllVisibleCustomer();
        return resultVo;
    }
}
