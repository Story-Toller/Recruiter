package com.yun.dao.mapper;

import com.yun.beans.entity.Honor;
import com.yun.beans.vo.EducationVo;
import com.yun.beans.vo.HonorVo;
import com.yun.dao.tk.FamilyMapper;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface HonorMapper extends FamilyMapper<Honor> {
    List<HonorVo> showAllHonor(Integer custId);
}