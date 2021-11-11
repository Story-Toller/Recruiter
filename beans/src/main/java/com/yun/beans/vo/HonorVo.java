package com.yun.beans.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Id;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class HonorVo {
    /**
     * 获奖id
     */
    @Column(name = "honor_id")
    private Integer honorId;

    /**
     * 简历id
     */
    @Column(name = "resume_id")
    private Integer resumeId;

    /**
     * 获奖时间
     */
    @Column(name = "honor_create_time")
    private Date honorCreateTime;

    /**
     * 奖项名称
     */
    @Column(name = "honor_name")
    private String honorName;

    /**
     * 获奖等级
     */
    @Column(name = "honor_grade")
    private String honorGrade;

    /**
     * 用户id
     */
    @Column(name = "cust_id")
    private Integer custId;

    /**
     * 简历名称
     */
    @Column(name = "resume_name")
    private String resumeName;
}
