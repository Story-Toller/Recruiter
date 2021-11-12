package com.yun.controller;

import com.yun.beans.entity.Job;
import com.yun.service.business.PostJobService;
import com.yun.sysytem.vo.ResultVo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/postJob")
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


    @ApiOperation("添加职位")
    @ApiImplicitParams({
            @ApiImplicitParam(dataType = "Integer", name = "companyAdminId", value = "hrId", required = true),
            @ApiImplicitParam(dataType = "String", name = "jobName", value = "职位名称", required = true),
            @ApiImplicitParam(dataType = "String", name = "jobCity", value = "职位所在城市", required = true),
            @ApiImplicitParam(dataType = "String", name = "jobYear", value = "工作经验要求", required = true),
            @ApiImplicitParam(dataType = "String", name = "token", value = "token", required = true)
    })
    @PostMapping("/insert")
    public ResultVo InsertJob(@RequestBody Job job, @RequestHeader("token") String token) {
        ResultVo resultVo = postJobService.InserJob(job.getCompanyAdminId(), job.getJobName(), job.getJobCity(), job.getJobYear(),
                job.getJobDegree(), job.getJobNeedNumber(), job.getJobWelfare(), job.getJobDuty(),
                job.getJobDemand(), job.getJobAddrDetail(), job.getJobMinSalary(), job.getJobMaxSalary(),
                job.getJobOther1(), job.getJobOther2());
        return resultVo;
    }
}
