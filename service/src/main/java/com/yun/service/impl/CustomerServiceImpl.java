package com.yun.service.impl;

import com.yun.beans.entity.Customer;
import com.yun.dao.mapper.CustomerMapper;
import com.yun.service.business.CustomerService;
import com.yun.sysytem.vo.ResStatus;
import com.yun.sysytem.vo.ResultVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    CustomerMapper customerMapper;
    @Override
    public ResultVo showAllVisibleCustomer() {
        List<Customer> customers = customerMapper.showAllCustomer();
        ResultVo resultVo = new ResultVo(ResStatus.OK, "success", customers);
        return resultVo;
    }
}
