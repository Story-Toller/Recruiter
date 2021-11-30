package com.yun;

import com.yun.beans.entity.*;
import com.yun.dao.mapper.*;
import com.yun.sysytem.utils.MD5Utils;
import com.yun.sysytem.vo.ResultVo;
import org.junit.jupiter.api.Test;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;
import java.util.List;

@SpringBootTest
@MapperScan("com.yun.dao.mapper")
class ApiApplicationTests {

    @Autowired
    CompanyAdminMapper companyAdminMapper;
    @Autowired
    JavaMailSender javaMailSender;

    @Test
    void mailSender() throws MessagingException {

        String mail = "480644915@qq.com";
        String to = "1269355513@qq.com";
        MimeMessage mimeMessage = javaMailSender.createMimeMessage();
        MimeMessageHelper helper = new MimeMessageHelper(mimeMessage);
        helper.setFrom(mail);
        helper.setTo(to);
        helper.setSubject("新投递信息");
        helper.setText("邮件模板");
        helper.setText("<h1>老李，您好</h1><br/><p>关于您投递的<b>腾讯科技</b>公司的<b>Java开发工程师</b>职位，<br>" +
                "招聘负责人对您的简历十分满意，<br>招聘负责人将在三个工作日内通过邮件联系您并告知您相关的面试事宜。<br>请注意查收邮件</p>", true);
        javaMailSender.send(helper.getMimeMessage());
    }
}


