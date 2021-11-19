package com.yun.service.impl;

import com.yun.beans.vo.ResumeDeliveryRecordVo;
import com.yun.dao.mapper.ResumeDeliveryRecordMapper;
import com.yun.service.business.ResumeDeliveryRecordService;
import com.yun.sysytem.vo.ResStatus;
import com.yun.sysytem.vo.ResultVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ResumeDeliveryRecordServiceImpl implements ResumeDeliveryRecordService {

    @Autowired
    ResumeDeliveryRecordMapper resumeDeliveryRecordMapper;

    @Override
    public ResultVo notCareDeliver(Integer companyAdminId) {
        List<ResumeDeliveryRecordVo> resumeDeliveryRecordVos = resumeDeliveryRecordMapper.showNotDealJob(companyAdminId);
        ResultVo resultVo = new ResultVo(ResStatus.OK, "success", resumeDeliveryRecordVos);
        return resultVo;
    }

    @Override
    public ResultVo yesDelivre(Integer companyAdminId) {
        List<ResumeDeliveryRecordVo> resumeDeliveryRecordVos = resumeDeliveryRecordMapper.showPassjob(companyAdminId);
        ResultVo resultVo = new ResultVo(ResStatus.OK, "success", resumeDeliveryRecordVos);
        return resultVo;
    }

    @Override
    public ResultVo eliminateDeliver(Integer companyAdminId) {
        List<ResumeDeliveryRecordVo> resumeDeliveryRecordVos = resumeDeliveryRecordMapper.showNotPassJob(companyAdminId);
        ResultVo resultVo = new ResultVo(ResStatus.OK, "success", resumeDeliveryRecordVos);
        return resultVo;
    }
}
