package com.yun.service.business;

import com.yun.sysytem.vo.ResultVo;


public interface ShowCustomerResumeService {
    ResultVo showcustomer(Integer jobId);
//    更改审核状态
    ResultVo changeTypeToYes(Integer resumeDeliveryRecordId);
    ResultVo changeTypeToNo(Integer resumeDeliveryRecordId);
}
