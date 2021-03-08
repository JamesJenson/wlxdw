package com.wlxdw.demo.Interceptor;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * @auther: yuzx
 * @date: 2021/2/24 11:04
 * @description: 拦截器配置注册
 */
//@Configuration
public class InterceptorConfigExample extends WebMvcConfigurerAdapter {

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new RequestInterceptorExample()).addPathPatterns("/**");
        super.addInterceptors(registry);
    }
}
