package com.yun.dao.mapper;

import com.yun.beans.entity.CompanyAdmin;
import com.yun.dao.tk.FamilyMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import javax.persistence.criteria.CriteriaBuilder;
import java.util.List;

@Mapper
public interface CompanyAdminMapper extends FamilyMapper<CompanyAdmin> {
    int chengeEmail(String companyAdminEmail, Integer companyAdminId);

    int chengePhone(String companyAdminTelno, Integer companyAdminId);

    int chengePsaaword(String companyAdminPassword, Integer companyAdminId);

    String companyIdIsEmpty(Integer CompanyAdminId);

    int updateCompanyId(@Param("companyId")Integer companyId, @Param("companyAdminId") Integer companyAdminId);
}