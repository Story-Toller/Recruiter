package com.yun.service.impl;

import com.yun.beans.entity.CompanyAdmin;
import com.yun.beans.entity.Job;
import com.yun.dao.mapper.CompanyAdminMapper;
import com.yun.dao.mapper.CompanyMapper;
import com.yun.dao.mapper.JobMapper;
import com.yun.service.business.PostJobService;
import com.yun.sysytem.vo.ResStatus;
import com.yun.sysytem.vo.ResultVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.entity.Example;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Date;


@Service
public class PostJobServiceImpl implements PostJobService {

    @Autowired
    JobMapper jobMapper;
    @Autowired
    CompanyAdminMapper companyAdminMapper;
    @Autowired
    CompanyMapper companyMapper;
    SimpleDateFormat s = new SimpleDateFormat("yyyy-MM-dd");

    @Override
    public ResultVo PostAJob(Integer companyAdminId) {
        String s = companyAdminMapper.companyIdIsEmpty(companyAdminId);
        if (companyAdminId == null) {
            ResultVo resultVo = new ResultVo(ResStatus.NOT_LOGIN, "亲先登录", null);
            return resultVo;
        } else {
            if (s == null) {
                ResultVo resultVo = new ResultVo(ResStatus.NOCOMPANY, "账号未绑定公司信息,请先添加公司信息", null);
                return resultVo;
            } else {
                ResultVo resultVo = new ResultVo(ResStatus.OK, "已经绑定公司信息，开始添加", null);
                return resultVo;

            }
        }
    }

    @Override
    public ResultVo InserJob(Integer companyAdminId, String jobName, String jobCity, String jobYear,
                             String jobDegree,Integer jobNeedNumber,String jobWelfare,
                             String jobDuty,String jobDemand,String jobAddrDetail,
                             BigDecimal jobMinSalary,BigDecimal jobMaxSalary,String jobOther1,
                             String jobOther2) {
        String companyId = companyAdminMapper.companyIdIsEmpty(companyAdminId);
        int a = Integer.parseInt(companyId);
        Job job = new Job();
        job.setCompanyAdminId(companyAdminId);
        job.setJobName(jobName);
        job.setJobCity(jobCity);
        job.setCompanyId(a);
        job.setJobYear(jobYear);
        job.setJobPublishTime(s.format(new Date()));
        job.setJobDegree(jobDegree);
        job.setJobNeedNumber(jobNeedNumber);
        job.setJobWelfare(jobWelfare);
        job.setJobDuty(jobDuty);
        job.setJobDemand(jobDemand);
        job.setJobAddrDetail(jobAddrDetail);
        job.setJobMinSalary(jobMinSalary);
        job.setJobMaxSalary(jobMaxSalary);
        job.setJobOther1(jobOther1);
        job.setJobOther2(jobOther2);
        int insert = jobMapper.insert(job);
        if (insert!=0){
            ResultVo resultVo = new ResultVo(ResStatus.OK, "添加成功", insert);
            return resultVo;
        }else {
            ResultVo resultVo = new ResultVo(ResStatus.NO, "添加失败", null);
            return resultVo;
        }

    }


}
