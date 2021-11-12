package com.yun.service.business;

import com.yun.sysytem.vo.ResultVo;

import java.math.BigDecimal;

public interface PostJobService {
    ResultVo PostAJob(Integer companyAdminId);

    ResultVo InserJob(Integer companyAdminId,
                      String jobName,String jobCity,String jobYear,
                      String jobDegree,Integer jobNeedNumber,String jobWelfare,
                      String jobDuty,String jobDemand,String jobAddrDetail,
                      BigDecimal jobMinSalary,BigDecimal jobMaxSalary,String jobOther1,
                      String jobOther2);
}
