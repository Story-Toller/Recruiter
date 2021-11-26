package com.yun.controller;

import com.yun.service.business.CustomerService;
import com.yun.service.business.SearchCustomerService;
import com.yun.sysytem.vo.ResultVo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
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
    @Autowired
    SearchCustomerService s;

    @GetMapping("/show_all")
    @ApiOperation("展示所有应聘人员")
    public ResultVo showAll() {
        ResultVo resultVo = customerService.showAllVisibleCustomer();
        return resultVo;
    }

    @ApiOperation("根据关键字搜素职位")
    @ApiImplicitParams({
            @ApiImplicitParam(dataType = "String", name = "keyword", value = "关键字", required = true),
            @ApiImplicitParam(dataType = "String", name = "pageNum", value = "页码", required = true),
            @ApiImplicitParam(dataType = "String", name = "limit", value = "每页数量", required = true)
    })
    @GetMapping("/searchCus")
    public ResultVo search(String keyword, int pageNum, int limit) {
        ResultVo resultVo = s.searchCustomer(keyword, pageNum, limit);
        return resultVo;
    }
}
