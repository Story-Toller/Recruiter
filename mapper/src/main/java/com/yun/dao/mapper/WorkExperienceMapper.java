package com.yun.dao.mapper;

import com.yun.beans.entity.WorkExperience;
import com.yun.beans.vo.WordExperenceVo;
import com.yun.dao.tk.FamilyMapper;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface WorkExperienceMapper extends FamilyMapper<WorkExperience> {
    List<WordExperenceVo> showAllWordExper(Integer custId);
}