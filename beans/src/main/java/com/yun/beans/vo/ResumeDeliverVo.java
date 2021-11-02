package com.yun.beans.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Id;
import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ResumeDeliverVo {

    /**
     * 简历投递记录id
     */
    @Id
    @Column(name = "resume_delivery_record_id")
    private Integer resumeDeliveryRecordId;

    @Column(name = "cust_id")
    private Integer custId;

    /**
     * 简历id
     */
    @Column(name = "resume_id")
    private Integer resumeId;

    /**
     * 职位id
     */
    @Column(name = "job_id")
    private Integer jobId;

    /**
     * 投递时间
     */
    @Column(name = "delivery_time")
    private Date deliveryTime;

    @Column(name = "delivery_status")
    private Integer deliveryStatus;

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
     * 更改为用户头像
     *
     */
    private String other1;

    /**
     * 更改为用户性别
     *
     */
    private String other2;

}
