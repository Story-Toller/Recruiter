package com.yun.controller;

import com.yun.service.business.ResumeDeliveryRecordService;
import com.yun.sysytem.vo.ResultVo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/deel_with")
@Api(value = "展示各个审批状态的投递信息", tags = "审批管理")
@CrossOrigin
public class ResumeDeliveryRecordController {

    @Autowired
    ResumeDeliveryRecordService resumeDeliveryRecordService;

    @GetMapping("/no_deal")
    @ApiOperation("查询未处理的接口")
    public ResultVo Information(Integer companyAdminId, @RequestHeader("token") String token) {
        ResultVo resultVo = resumeDeliveryRecordService.notCareDeliver(companyAdminId);
        return resultVo;
    }

    @GetMapping("/pass")
    @ApiOperation("查询淘汰的接口")
    public ResultVo Informations(Integer companyAdminId, @RequestHeader("token") String token) {
        ResultVo resultVo = resumeDeliveryRecordService.eliminateDeliver(companyAdminId);
        return resultVo;
    }

    @GetMapping("/not_pass")
    @ApiOperation("查询通过的接口")
    public ResultVo Informationsss(Integer companyAdminId, @RequestHeader("token") String token) {
        ResultVo resultVo = resumeDeliveryRecordService.yesDelivre(companyAdminId);
        return resultVo;
    }


}
