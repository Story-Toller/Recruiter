package com.yun.controller;

import com.yun.service.business.CompanyDesService;
import com.yun.sysytem.vo.ResultVo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/com_show")
@Api(value = "展示公司详情页", tags = "公司管理")
@CrossOrigin
public class CompanyDesController {

    @Autowired
    CompanyDesService companyDesService;

    @GetMapping("/show_all_com")
    @ApiOperation("展示公司所有信息")
    public ResultVo showAll(Integer companyAdminId, @RequestHeader("token") String token) {
        ResultVo resultVo = companyDesService.showCompanyDes(companyAdminId);
        return resultVo;
    }

    @GetMapping("/show_all_adm")
    @ApiOperation("展示公司所有人")
    public ResultVo showAllAdmin(Integer companyAdminId, @RequestHeader("token") String token) {
        ResultVo resultVo = companyDesService.showCompanyAdmin(companyAdminId);
        return resultVo;
    }
}
