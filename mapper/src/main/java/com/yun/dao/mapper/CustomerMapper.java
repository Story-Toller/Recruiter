package com.yun.dao.mapper;

import com.yun.beans.entity.Customer;
import com.yun.dao.tk.FamilyMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface CustomerMapper extends FamilyMapper<Customer> {
    //    展示所有应聘者
    List<Customer> showAllCustomer();

}