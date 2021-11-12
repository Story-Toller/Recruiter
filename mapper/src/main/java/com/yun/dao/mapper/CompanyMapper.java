package com.yun.dao.mapper;

import com.yun.beans.entity.Company;
import com.yun.dao.tk.FamilyMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface CompanyMapper extends FamilyMapper<Company> {
    String selectComanyNameIsEmply(String companyName);

    int selectIdByCompanyName(String companyName);
}