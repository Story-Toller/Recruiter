package com.yun.controller;


import com.yun.beans.entity.CompanyAdmin;
import com.yun.service.business.CompanyAdminService;
import com.yun.sysytem.vo.ResultVo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/admin")
@Api(value = "提供招聘者的登录和注册接口", tags = "招聘者管理")
@CrossOrigin
public class CompanyAdminController {

    @Autowired
    CompanyAdminService companyAdminService;


    @ApiOperation("招聘者登录接口")
    @ApiImplicitParams({
            @ApiImplicitParam(dataType = "String", name = "adminEmail", value = "招聘者登录邮箱", required = true),
            @ApiImplicitParam(dataType = "String", name = "adminPassword", value = "招聘者登录密码", required = true)
    })
    @GetMapping("/com_login")
    public ResultVo login(@RequestParam("adminEmail") String adminEmail,
                          @RequestParam(value = "adminPassword") String adminPassword) {
        ResultVo resultVo = companyAdminService.adminLogin(adminEmail, adminPassword);
        return resultVo;
    }


    @ApiOperation("招聘者注册接口")
    @ApiImplicitParams({
            @ApiImplicitParam(dataType = "String", name = "adminEmail", value = "招聘者注册邮箱", required = true),
            @ApiImplicitParam(dataType = "String", name = "adminPassword", value = "招聘者注册密码", required = true),
            @ApiImplicitParam(dataType = "String", name = "adminName", value = "招聘者注册用户名", required = true)
    })
    @PostMapping("/com_regiest")
    public ResultVo regiest(@RequestBody CompanyAdmin companyAdmin) {
        ResultVo resultVo = companyAdminService.adminRegister(companyAdmin.getCompanyAdminName(), companyAdmin.getCompanyAdminEmail(), companyAdmin.getCompanyAdminPassword());
        return resultVo;
    }
}
