package com.yun.beans.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import javax.persistence.Column;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class ResumeDeliveryRecordVo {
    @Column(name = "company_admin_id")
    private Integer companyAdminId;

    @Column(name = "resume_delivery_record_id")
    private Integer resumeDeliveryRecordId;

    @Column(name = "cust_id")
    private Integer custId;

    @Column(name = "resume_id")
    private Integer resumeId;

    @Column(name = "job_id")
    private Integer jobId;

    @Column(name = "delivery_time")
    private Date deliveryTime;

    @Column(name = "delivery_status")
    private Integer deliveryStatus;

    private String other1;

    private String other2;
    /**
     * 用户名
     */
    @Column(name = "cust_name")
    private String custName;

    /**
     * 用户手机
     */
    @Column(name = "cust_telno")
    private Long custTelno;

    /**
     * 用户邮箱
     */
    @Column(name = "cust_email")
    private String custEmail;

    /**
     * 注册时间
     */
    @Column(name = "cust_regist_time")
    private String custRegistTime;

    /**
     * 简历中头像
     */
    @Column(name = "resume_profile")
    private String resumeProfile;

    /**
     * 简历中用户出生日期
     */
    @Column(name = "resume_birth")
    private String resumeBirth;

    /**
     * 简历中用户手机
     */
    @Column(name = "resume_telno")
    private String resumeTelno;

    /**
     * 简历中用户邮箱
     */
    @Column(name = "resume_email")
    private String resumeEmail;

    /**
     * 简历中用户性别
     */
    @Column(name = "resume_gender")
    private String resumeGender;

    /**
     * 简历中用户在职或离职情况
     */
    @Column(name = "resume_leaving__working")
    private String resumeLeavingWorking;

    /**
     * 简历中用户居住地
     */
    @Column(name = "resume_live_city")
    private String resumeLiveCity;

    /**
     * 简历中用户身份证
     */
    @Column(name = "resume_personid")
    private String resumePersonid;

    /**
     * 简历中用户期望年收入
     */
    @Column(name = "resume_income")
    private String resumeIncome;

    /**
     * 简历中用户兼职或全职
     */
    @Column(name = "resume_full_part_time")
    private String resumeFullPartTime;

    /**
     * 职位名称
     */
    @Column(name = "job_name")
    private String jobName;
}