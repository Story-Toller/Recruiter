package com.yun.service.impl;

import com.yun.beans.entity.ResumeDeliveryRecord;
import com.yun.dao.mapper.CompanyAdminMapper;
import com.yun.dao.mapper.CustomerMapper;
import com.yun.dao.mapper.JobMapper;
import com.yun.dao.mapper.ResumeDeliveryRecordMapper;
import com.yun.service.business.ShowCustomerResumeService;
import com.yun.sysytem.vo.ResStatus;
import com.yun.sysytem.vo.ResultVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.entity.Example;

import java.util.List;

@Service
public class ShowCustomerResumeServiceImpl implements ShowCustomerResumeService {

    @Autowired
    ResumeDeliveryRecordMapper resumeDeliveryRecordMapper;
    @Autowired(required = false)
    JavaMailSender javaMailSender;
    @Autowired
    CustomerMapper customerMapper;
    @Autowired
    CompanyAdminMapper companyAdminMapper;
    @Autowired
    JobMapper jobMapper;


    @Override
    public ResultVo showcustomer(Integer jobId) {
        List<ResumeDeliveryRecord> resumeDeliveryRecords = resumeDeliveryRecordMapper.showCustomerByjobId(jobId);
        ResultVo resultVo = new ResultVo(ResStatus.OK, "success", resumeDeliveryRecords);
        return resultVo;

    }

    @Override
    public ResultVo changeTypeToNo(Integer resumeDeliveryRecordId) {
        int i = resumeDeliveryRecordMapper.updateDeliveryToNo(resumeDeliveryRecordId);
        if (i!=0){
            return new ResultVo(ResStatus.OK, "更改成功", i);
        } else {

            return new ResultVo(ResStatus.NO, "操作失败", i);
        }
    }

    @Override
    public ResultVo changeTypeToYes(Integer resumeDeliveryRecordId) {
        int i = resumeDeliveryRecordMapper.updateDeliveryToYes(resumeDeliveryRecordId);
        if (i != 0) {
            int jobId = resumeDeliveryRecordMapper.selectJobId(resumeDeliveryRecordId);
            int custId = resumeDeliveryRecordMapper.selectCustId(resumeDeliveryRecordId);
//                    发送通知邮件
            String mail="480644915@qq.com";
            SimpleMailMessage mailMessage = new SimpleMailMessage();
            String email2 = jobMapper.selectAdminEmail(jobId);
            mailMessage.setFrom(mail);//发起者
//                    职位名称
            String jobname = jobMapper.selectJobName(jobId);
            String name1 = jobMapper.selectAdminName(jobId);
//                    发送成功提示
            mailMessage.setSubject("新投递信息");
//                    投递人昵称
            String name = customerMapper.selectName(custId);
//                    投递人邮箱
            String email = customerMapper.selectEmail(custId);
            mailMessage.setTo(email);//接受者
            mailMessage.setText("用户 " + name + " 您好，关于您投递的 " + jobname + " 职位，招聘人"+name1+"对您的简历十分认可" +
                    "希望您可以通过他的邮箱  " + email2+"  取得进一步的联系，同时预祝您前程似锦");
            try {
                javaMailSender.send(mailMessage);
                System.out.println("发送简单邮件");
            } catch (Exception e) {
                System.out.println("发送简单邮件失败");
            }
            return new ResultVo(ResStatus.OK, "更改成功", i);
        } else {

            return new ResultVo(ResStatus.NO, "操作失败", i);
        }
    }
}
