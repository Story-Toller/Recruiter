package com.yun.beans.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Id;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class EducationVo {
    @Id
    @Column(name = "edu_id")
    private Integer eduId;

    @Column(name = "resume_id")
    private Integer resumeId;

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

    /**
     * 学历等级
     */
    @Column(name = "edu_level")
    private String eduLevel;

    /**
     * 学历学校名称
     */
    @Column(name = "edu_name")
    private String eduName;

    /**
     * 入学日期
     */
    @Column(name = "edu_start")
    private String eduStart;

    /**
     * 毕业日期
     */
    @Column(name = "edu_stop")
    private String eduStop;

    /**
     * 专业
     */
    @Column(name = "edu_pro")
    private String eduPro;
}
