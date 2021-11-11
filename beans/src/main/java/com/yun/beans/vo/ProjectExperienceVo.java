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
public class ProjectExperienceVo {
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
     * 项目经验id
     */
    @Column(name = "project_experi_id")
    private Integer projectExperiId;

    /**
     * 简历id
     */
    @Column(name = "resume_id")
    private Integer resumeId;

    /**
     * 项目所在公司名
     */
    @Column(name = "project_company_name")
    private String projectCompanyName;

    /**
     * 项目经验开始时间
     */
    @Column(name = "project_start_time")
    private Date projectStartTime;

    /**
     * 项目经验结束时间
     */
    @Column(name = "project_end_time")
    private Date projectEndTime;

    /**
     * 项目经验名称
     */
    @Column(name = "project_name")
    private String projectName;

    /**
     * 项目内容描述
     */
    @Column(name = "project_content_desc")
    private String projectContentDesc;

    /**
     * 项目职责描述
     */
    @Column(name = "project_duty_desc")
    private String projectDutyDesc;
}
