package com.yun.controller;


import com.yun.service.business.ShowCustomerResumeService;
import com.yun.sysytem.vo.ResultVo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.apache.ibatis.annotations.Update;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/toCustomer")
@Api(value = "展示某职位投递人员", tags = "应聘者管理")
@CrossOrigin
public class ShowCustomer {

    @Autowired
    ShowCustomerResumeService showCustomerResumeService;

    @GetMapping("/allIn")
    @ApiOperation("按照处理方式展示该职位所有应聘人员")
    public ResultVo showAll(Integer jobId){
        ResultVo showcustomer = showCustomerResumeService.showcustomer(jobId);
        return showcustomer;
    }

    @PutMapping("/decisionToYes/{resumeDeliveryRecordId}")
    @ApiOperation("更改投递状态为通过")
    public  ResultVo updateTheCustomer(@PathVariable("resumeDeliveryRecordId") Integer resumeDeliveryRecordId, @RequestHeader("token") String token){

        ResultVo resultVo = showCustomerResumeService.changeTypeToYes(resumeDeliveryRecordId);
        return resultVo;
    }
    @PutMapping("/decisionToNo/{resumeDeliveryRecordId}")
    @ApiOperation("更改投递状态为没有通过")
    public  ResultVo updateTheCustomers(@PathVariable("resumeDeliveryRecordId") Integer resumeDeliveryRecordId, @RequestHeader("token") String token){

        ResultVo resultVo = showCustomerResumeService.changeTypeToNo(resumeDeliveryRecordId);
        return resultVo;
    }
}
