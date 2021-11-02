package com.yun.service.business;

import com.yun.sysytem.vo.ResultVo;

import javax.persistence.criteria.CriteriaBuilder;

public interface CompanyAdminService {
    //    公司管理员登录
    ResultVo adminLogin(String adminEmail, String adminPassword);

    //    公司管理员注册
    ResultVo adminRegister(String adminName, String adminEmail, String adminPassword);

    //    更改邮箱
    ResultVo chengeEmail(String companyAdminEmail, Integer companyAdminId);

    //    更改手机号
    ResultVo chengePhones(String companyAdminTelno, Integer companyAdminId);

    //    更改密码
    ResultVo chengePassword(String companyAdminPassword, Integer companyAdminId);
}
