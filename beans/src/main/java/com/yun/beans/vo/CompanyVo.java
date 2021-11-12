package com.yun.beans.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.Column;


@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class CompanyVo {
    /**
     * 公司id
     */
    @Column(name = "company_admin_id")
    private Integer companyAdminId;

    @Column(name = "company_id")
    private Integer companyId;

    /**
     * 公司名
     */
    @Column(name = "company_name")
    private String companyName;

    /**
     * 公司logo
     */
    @Column(name = "company_logo")
    private String companyLogo;

    /**
     * 公司阶段
     */
    @Column(name = "company_stage")
    private String companyStage;

    /**
     * 公司员工规模
     */
    @Column(name = "company_emp_count")
    private String companyEmpCount;

    /**
     * 公司所属行业
     */
    @Column(name = "company_industury")
    private String companyIndustury;

    /**
     * 公司简介
     */
    @Column(name = "company_desc")
    private String companyDesc;

    /**
     * 公司网址
     */
    @Column(name = "company_website")
    private String companyWebsite;

    /**
     * 公司地址省份
     */
    @Column(name = "company_addr_province")
    private String companyAddrProvince;

    /**
     * 公司地址城市
     */
    @Column(name = "company_addr_city")
    private String companyAddrCity;

    /**
     * 公司地址区域
     */
    @Column(name = "company_addr_area")
    private String companyAddrArea;

    /**
     * 公司详细地址
     */
    @Column(name = "company_adrr_detail")
    private String companyAdrrDetail;

    private Integer status;

    private String other1;

    private String other2;

    /**
     * 公司法人
     */
    @Column(name = "company_legal_person")
    private String companyLegalPerson;

    /**
     * 公司注册资本
     */
    @Column(name = "company_registered_capital")
    private String companyRegisteredCapital;

    /**
     * 公司注册时间
     */
    @Column(name = "company_set_data")
    private String companySetData;
}
