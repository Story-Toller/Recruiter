package com.yun.controller;

import com.yun.beans.entity.Company;
import com.yun.beans.entity.CompanyAdmin;
import com.yun.beans.entity.Job;
import com.yun.beans.vo.CompanyVo;
import com.yun.service.business.InsertCompanyInfService;
import com.yun.sysytem.vo.ResultVo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/insCom")
@Api(value = "添加公司信息", tags = "公司管理")
@CrossOrigin
public class InsertCompanyController {
    @Autowired
    InsertCompanyInfService insertCompanyInfService;

    @ApiOperation("添加公司信息")
    @ApiImplicitParams({
            @ApiImplicitParam(dataType = "String", name = "companyName", value = "公司名称", required = true),
            @ApiImplicitParam(dataType = "String", name = "companyStage", value = "公司阶段", required = true),
            @ApiImplicitParam(dataType = "String", name = "companyEmpCount", value = "员工数量", required = true),
            @ApiImplicitParam(dataType = "String", name = "companyIndustury", value = "行业", required = true),
            @ApiImplicitParam(dataType = "String", name = "token", value = "token", required = true)
    })
    @PostMapping("/comInfor")
    public ResultVo InsertJob(@RequestBody CompanyVo company, @RequestHeader("token") String token) {
        ResultVo resultVo = insertCompanyInfService.addComapnyInformation(company.getCompanyAdminId(),company.getCompanyName(), company.getCompanyStage(),
                company.getCompanyEmpCount(), company.getCompanyIndustury(), company.getCompanyDesc(),
                company.getCompanyWebsite(), company.getCompanyAddrProvince(), company.getCompanyAddrCity(),
                company.getCompanyAdrrDetail(), company.getOther1(), company.getOther2(),
                company.getCompanyLegalPerson(), company.getCompanyRegisteredCapital(),
                company.getCompanySetData());
        return resultVo;
    }
}
