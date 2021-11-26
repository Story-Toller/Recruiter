package com.yun.dao.mapper;

import com.yun.beans.entity.Customer;
import com.yun.beans.entity.JobVo;
import com.yun.dao.tk.FamilyMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface CustomerMapper extends FamilyMapper<Customer> {
    //    展示所有应聘者
    List<Customer> showAllCustomer();

    String selectName(Integer custId);

    String selectEmail(Integer custId);

    //    职位搜索
    List<Customer> selectCustomerByName(@Param("keyword") String keyword,
                                @Param("start") int start,
                                @Param("limit") int limit);
}