package com.yun.dao.mapper;

import com.yun.beans.entity.Skill;
import com.yun.beans.vo.SkillVo;
import com.yun.dao.tk.FamilyMapper;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface SkillMapper extends FamilyMapper<Skill> {
    List<SkillVo> showAllSkill(Integer custId);
}