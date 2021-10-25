package com.yun.dao.mapper;

import com.yun.beans.entity.Customer;
import com.yun.dao.tk.FamilyMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface CustomerMapper extends FamilyMapper<Customer> {
}