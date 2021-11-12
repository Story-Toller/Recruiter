package com.yun.service.impl;

import com.yun.beans.entity.Company;
import com.yun.dao.mapper.CompanyAdminMapper;
import com.yun.dao.mapper.CompanyMapper;
import com.yun.service.business.InsertCompanyInfService;
import com.yun.sysytem.vo.ResStatus;
import com.yun.sysytem.vo.ResultVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class InsertCompanyInfServiceImpl implements InsertCompanyInfService {

    @Autowired
    CompanyMapper companyMapper;
    @Autowired
    CompanyAdminMapper companyAdminMapper;

    @Override
    public ResultVo addComapnyInformation(Integer companyAdminId,String companyName, String companyStage, String companyEmpCount,
                                          String companyIndustury, String companyDesc, String companyWebsite,
                                          String companyAddrProvince, String companyAddrCity, String companyAdrrDetail,
                                          String other1, String other2, String companyLegalPerson,
                                          String companyRegisteredCapital, String companySetData) {
        String s = companyMapper.selectComanyNameIsEmply(companyName);
        if (companyName == null || companyName == "") {
            ResultVo resultVos = new ResultVo(ResStatus.REQUIRED_VACANCY, "信息未添加完整", null);
            return resultVos;
        } else {
            if (companyDesc == null || companyDesc == "") {
                ResultVo resultVos = new ResultVo(ResStatus.REQUIRED_VACANCY, "信息未添加完整", null);
                return resultVos;
            } else {
                if (s == null || s == "") {
                    Company company = new Company();
                    company.setCompanyName(companyName);
                    company.setCompanyStage(companyStage);
                    company.setCompanyEmpCount(companyEmpCount);
                    company.setCompanyIndustury(companyIndustury);
                    company.setCompanyDesc(companyDesc);
                    company.setCompanyWebsite(companyWebsite);
                    company.setCompanyAddrProvince(companyAddrProvince);
                    company.setCompanyAddrCity(companyAddrCity);
                    company.setCompanyAdrrDetail(companyAdrrDetail);
                    company.setOther1(other1);
                    company.setOther2(other2);
                    company.setCompanyLegalPerson(companyLegalPerson);
                    company.setCompanyRegisteredCapital(companyRegisteredCapital);
                    company.setCompanySetData(companySetData);
                    int insert = companyMapper.insert(company);
                    int i = companyMapper.selectIdByCompanyName(companyName);
                    int i1 = companyAdminMapper.updateCompanyId(i, companyAdminId);
                    ResultVo resultVo = new ResultVo(ResStatus.OK, "添加成功", insert);
                    return resultVo;
                } else {
                    ResultVo resultVos = new ResultVo(ResStatus.HASCOMPANYINF, "公司信息已存在，请联系管理员添加进公司", null);
                    return resultVos;
                }
            }

        }

    }
}
