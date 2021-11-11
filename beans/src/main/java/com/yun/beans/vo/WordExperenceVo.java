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
public class WordExperenceVo {
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
     * 工作经验id
     */

    @Column(name = "work_experi_id")
    private Integer workExperiId;

    /**
     * 简历id
     */
    @Column(name = "resume_id")
    private Integer resumeId;

    /**
     * 工作经验开始时间
     */
    @Column(name = "work_start_time")
    private Date workStartTime;

    /**
     * 工作经验结束时间
     */
    @Column(name = "work_end_time")
    private Date workEndTime;

    /**
     * 工作经验所在公司名称
     */
    @Column(name = "work_company_name")
    private String workCompanyName;

    /**
     * 工作经验工作职位
     */
    @Column(name = "work_position")
    private String workPosition;

    /**
     * 工作经验所在部门名称
     */
    @Column(name = "work_department")
    private String workDepartment;

    /**
     * 工作经验公司规模
     */
    @Column(name = "work_company_scaler")
    private String workCompanyScaler;

    /**
     * 工作经验公司性质（外企国企私营等）
     */
    @Column(name = "work_company_property")
    private String workCompanyProperty;

    /**
     * 工作经验工作描述
     */
    @Column(name = "work_desc")
    private String workDesc;

    /**
     * 工作经验类型
     */
    @Column(name = "work_type")
    private String workType;
}
