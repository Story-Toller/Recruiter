package com.yun.service.business;

import com.yun.sysytem.vo.ResultVo;

public interface CompanyAdminService {
//    公司管理员登录
    ResultVo adminLogin(String adminEmail,String adminPassword);

    //    公司管理员注册
    ResultVo adminRegister(String adminName,String adminEmail,String adminPassword);
}
