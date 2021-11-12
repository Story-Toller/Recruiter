package com.yun.service.business;

import com.yun.sysytem.vo.ResultVo;

public interface InsertCompanyInfService {
    ResultVo addComapnyInformation(Integer companyAdminId,String companyName,String companyStage,String companyEmpCount,
                                   String companyIndustury,String companyDesc,String companyWebsite,
                                   String companyAddrProvince,String companyAddrCity,String companyAdrrDetail,
                                   String other1,String other2,String companyLegalPerson,
                                   String companyRegisteredCapital,String companySetData);
}
