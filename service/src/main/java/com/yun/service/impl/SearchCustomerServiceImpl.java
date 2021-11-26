package com.yun.service.impl;

import com.yun.beans.entity.Customer;
import com.yun.dao.mapper.CustomerMapper;
import com.yun.service.business.SearchCustomerService;
import com.yun.sysytem.utils.PageHelper;
import com.yun.sysytem.vo.ResStatus;
import com.yun.sysytem.vo.ResultVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.entity.Example;

import java.util.List;

@Service
public class SearchCustomerServiceImpl implements SearchCustomerService {

    @Autowired
    CustomerMapper customerMapper;

    @Override
    public ResultVo searchCustomer(String keyword, int pageNum, int limit) {
        String kw = "%" + keyword + "%";
        int start = (pageNum - 1) * limit;
        List<Customer> customers = customerMapper.selectCustomerByName(kw, start, limit);
        Example example = new Example(Customer.class);
        Example.Criteria criteria = example.createCriteria();
        criteria.andEqualTo("custName", keyword);
        int cus = customerMapper.selectCountByExample(example);
        int pageCount = cus % limit == 0 ? cus / limit : cus / limit + 1;
        PageHelper<Customer> jobVoPageHelper = new PageHelper<>(cus, pageCount, customers);
        ResultVo resultVo = new ResultVo(ResStatus.OK, "success", jobVoPageHelper);
        return resultVo;
    }
}
