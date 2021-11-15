package com.yun.service.impl;

import com.yun.beans.entity.*;
import com.yun.dao.mapper.*;
import com.yun.service.business.ShowIndexCustomerResumeService;
import com.yun.sysytem.vo.ResStatus;
import com.yun.sysytem.vo.ResultVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.entity.Example;

import java.util.List;

@Service
public class ShowIndexCustomerResumeServiceImpl implements ShowIndexCustomerResumeService {

    @Autowired
    ResumeMapper resumeMapper;
    @Autowired
    EducationMapper educationMapper;
    @Autowired
    HonorMapper honorMapper;
    @Autowired
    ProjectExperienceMapper projectExperienceMapper;
    @Autowired
    SkillMapper skillMapper;
    @Autowired
    WorkExperienceMapper workExperienceMapper;

    @Override
    public ResultVo showAllowCustomerResume(Integer custId) {
        List<Resume> resumes = resumeMapper.showAllowedResume(custId);
        int i = resumeMapper.selectResumeIdByCustomerId(custId);
        if (custId==0){
            ResultVo resultVo = new ResultVo(ResStatus.NO, "查询失败，请重启项目", null);
            return resultVo;
        }
        else {
            ResultVo resultVo = new ResultVo(ResStatus.OK, "查询成功", resumes);
            return resultVo;
        }
    }

    @Override
    public ResultVo showHonor(Integer custId) {

        int i = resumeMapper.selectResumeIdByCustomerId(custId);
        Example example = new Example(Honor.class);
        Example.Criteria criteria = example.createCriteria();
        criteria.andEqualTo("resumeId",i);
        List<Honor> honors = honorMapper.selectByExample(example);
        ResultVo resultVo = new ResultVo(ResStatus.OK, "查询成功", honors);
        return resultVo;
    }

    @Override
    public ResultVo showSkill(Integer custId) {
        int i = resumeMapper.selectResumeIdByCustomerId(custId);
        Example example = new Example(Skill.class);
        Example.Criteria criteria = example.createCriteria();
        criteria.andEqualTo("resumeId",i);
        List<Skill> skills = skillMapper.selectByExample(example);
        ResultVo resultVo = new ResultVo(ResStatus.OK, "查询成功", skills);
        return resultVo;
    }

    @Override
    public ResultVo showWorkExpri(Integer custId) {
        int i = resumeMapper.selectResumeIdByCustomerId(custId);
        Example example = new Example(WorkExperience.class);
        Example.Criteria criteria = example.createCriteria();
        criteria.andEqualTo("resumeId",i);
        List<WorkExperience> workExperiences = workExperienceMapper.selectByExample(example);
        ResultVo resultVo = new ResultVo(ResStatus.OK, "查询成功", workExperiences);
        return resultVo;
    }

    @Override
    public ResultVo showProject(Integer custId) {
        int i = resumeMapper.selectResumeIdByCustomerId(custId);
        Example example = new Example(ProjectExperience.class);
        Example.Criteria criteria = example.createCriteria();
        criteria.andEqualTo("resumeId",i);
        List<ProjectExperience> projectExperiences = projectExperienceMapper.selectByExample(example);
        ResultVo resultVo = new ResultVo(ResStatus.OK, "查询成功", projectExperiences);
        return resultVo;

    }

    @Override
    public ResultVo showEducation(Integer custId) {
        int i = resumeMapper.selectResumeIdByCustomerId(custId);
        Example example = new Example(Education.class);
        Example.Criteria criteria = example.createCriteria();
        criteria.andEqualTo("resumeId",i);
        List<Education> educations = educationMapper.selectByExample(example);
        ResultVo resultVo = new ResultVo(ResStatus.OK, "查询成功", educations);
        return resultVo;
    }


}
