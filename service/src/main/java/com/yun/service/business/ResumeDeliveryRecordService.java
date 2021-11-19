package com.yun.service.business;

import com.yun.sysytem.vo.ResultVo;

public interface ResumeDeliveryRecordService {
    //    展示未处理的投递记录
    ResultVo notCareDeliver(Integer companyAdminId);

    //    展示通过的投递
    ResultVo yesDelivre(Integer companyAdminId);

    //    展示淘汰的投递
    ResultVo eliminateDeliver(Integer companyAdminId);
}
