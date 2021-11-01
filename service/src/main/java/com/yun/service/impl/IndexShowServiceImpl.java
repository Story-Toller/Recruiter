package com.yun.service.impl;

import com.yun.beans.entity.Customer;
import com.yun.dao.mapper.CustomerMapper;
import com.yun.service.business.IndexShowService;
import com.yun.sysytem.vo.ResStatus;
import com.yun.sysytem.vo.ResultVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class IndexShowServiceImpl implements IndexShowService {

    @Autowired
    CustomerMapper customerMapper;

    @Override
    public ResultVo showCustomer() {

        List<Customer> customers = customerMapper.selectAll();
        ResultVo resultVo = new ResultVo(ResStatus.OK,"success",customers);
        return resultVo;
    }
}
