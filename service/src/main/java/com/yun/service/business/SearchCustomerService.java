package com.yun.service.business;

import com.yun.sysytem.vo.ResultVo;

public interface SearchCustomerService {
    ResultVo searchCustomer(String keyword, int pageNum, int limit);
}
