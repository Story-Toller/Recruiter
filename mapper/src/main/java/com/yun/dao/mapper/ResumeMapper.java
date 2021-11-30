package com.yun.dao.mapper;

import com.yun.beans.entity.Resume;
import com.yun.dao.tk.FamilyMapper;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ResumeMapper extends FamilyMapper<Resume> {
}