package com.yun.dao.mapper;

import com.yun.beans.entity.ProjectExperience;
import com.yun.beans.vo.ProjectExperienceVo;
import com.yun.dao.tk.FamilyMapper;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ProjectExperienceMapper extends FamilyMapper<ProjectExperience> {
    List<ProjectExperienceVo> showAllProject(Integer custId);
}