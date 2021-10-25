package com.yun;

import com.yun.beans.entity.CompanyAdmin;
import com.yun.beans.entity.JobVo;
import com.yun.dao.mapper.CompanyAdminMapper;
import com.yun.service.business.CompanyAdminService;
import com.yun.sysytem.utils.MD5Utils;
import com.yun.sysytem.vo.ResultVo;
import org.junit.jupiter.api.Test;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
@MapperScan("com.yun.dao.mapper")
class ApiApplicationTests {

    @Autowired
    CompanyAdminMapper companyAdminMapper;
    @Autowired
    CompanyAdminService companyAdminService;

    @Test
    void contextLoads() {
        CompanyAdmin companyAdmin = new CompanyAdmin();
        String pass = "123";
        String md5pwd = MD5Utils.md5(pass);
        companyAdmin.setCompanyAdminName("赵刚");
        companyAdmin.setCompanyAdminEmail("13788978@qq.com");
        companyAdmin.setCompanyAdminPassword(md5pwd);


        int insert = companyAdminMapper.insert(companyAdmin);
        System.out.println(insert);
    }

    @Test
    void contextLoads2() {
        String name = "和尚";
        String pass = "123";
        String email = "heshang@qq.com";

        ResultVo resultVo = companyAdminService.adminRegister(name, email, pass);
        System.out.println(resultVo);

    }
}


