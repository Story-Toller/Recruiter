package com.yun.service.impl;

import com.yun.beans.entity.ResumeDeliveryRecord;
import com.yun.dao.mapper.ResumeDeliveryRecordMapper;
import com.yun.service.business.ShowCustomerResumeService;
import com.yun.sysytem.vo.ResStatus;
import com.yun.sysytem.vo.ResultVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.entity.Example;

import java.util.List;

@Service
public class ShowCustomerResumeServiceImpl implements ShowCustomerResumeService {

    @Autowired
    ResumeDeliveryRecordMapper resumeDeliveryRecordMapper;

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
            return new ResultVo(ResStatus.OK, "更改成功", i);
        } else {

            return new ResultVo(ResStatus.NO, "操作失败", i);
        }
    }
}
