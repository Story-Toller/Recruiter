package com.yun.controller;

import com.yun.service.business.PostJobService;
import com.yun.sysytem.vo.ResultVo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/post")
@Api(value = "判断是否可添加职位即添加职位的接口", tags = "添加职位")
@CrossOrigin
public class PostJobController {

    @Autowired
    PostJobService postJobService;

    @GetMapping("/comIsEmp")
    @ApiOperation("判断是否可添加职位")
    public ResultVo showAll(Integer companyAdminId, @RequestHeader("token") String token) {
        ResultVo resultVo = postJobService.PostAJob(companyAdminId);
        return resultVo;
    }
}
