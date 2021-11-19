package com.yun.config;

import com.yun.validator.TokenInterceptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class TokenConfig implements WebMvcConfigurer {

    @Autowired
    TokenInterceptor tokenInterceptor;

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(tokenInterceptor)
                .addPathPatterns("/postJob/**")
                .addPathPatterns("/insCom/**")
                .addPathPatterns("/admin/showAllInfor")
                .excludePathPatterns("/customer/**");
    }
}
