package com.yun.dao.mapper;

import com.yun.beans.entity.CompanyAdmin;
import com.yun.dao.tk.FamilyMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import javax.persistence.criteria.CriteriaBuilder;
import java.util.List;

@Mapper
public interface CompanyAdminMapper extends FamilyMapper<CompanyAdmin> {
}