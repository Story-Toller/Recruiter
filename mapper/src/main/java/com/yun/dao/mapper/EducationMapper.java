package com.yun.dao.mapper;

import com.yun.beans.entity.Education;
import com.yun.beans.vo.EducationVo;
import com.yun.dao.tk.FamilyMapper;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface EducationMapper extends FamilyMapper<Education> {
    List<EducationVo> showAllEducation(Integer custId);
}