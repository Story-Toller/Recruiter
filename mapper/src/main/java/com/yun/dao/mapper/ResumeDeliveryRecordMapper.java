package com.yun.dao.mapper;

import com.yun.beans.entity.ResumeDeliveryRecord;
import com.yun.beans.vo.ResumeDeliveryRecordVo;
import com.yun.dao.tk.FamilyMapper;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ResumeDeliveryRecordMapper extends FamilyMapper<ResumeDeliveryRecord> {
    //    根据投递记录显示投递人信息并按照处理结果分类
    List<ResumeDeliveryRecord> showCustomerByjobId(Integer jobId);

    //    查询未审理投递记录
    List<ResumeDeliveryRecordVo> showNotDealJob(Integer companyAdminId);

    //    查询通过的投递记录
    List<ResumeDeliveryRecordVo> showPassjob(Integer companyAdminId);

    //    查询淘汰的投递记录
    List<ResumeDeliveryRecordVo> showNotPassJob(Integer companyAdminId);

    //    更改投递状态为通过
    int updateDeliveryToYes(Integer resumeDeliveryRecordId);

    //    更改投递状态没有通过
    int updateDeliveryToNo(Integer resumeDeliveryRecordId);

    int selectJobId(Integer resumeDeliveryRecordId);
    int selectCustId(Integer resumeDeliveryRecordId);

}