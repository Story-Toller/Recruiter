package com.yun.beans.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Id;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SkillVo {
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

    @Column(name = "skill_id")
    private Integer skillId;

    /**
     * 简历id
     */
    @Column(name = "resume_id")
    private Integer resumeId;

    /**
     * 专业技能名称
     */
    @Column(name = "skill_name")
    private String skillName;

    /**
     * 专业技能描述
     */
    @Column(name = "skill_desc")
    private String skillDesc;
}
