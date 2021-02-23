package com.wlxdw.demo.filter;

import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//@Configuration
public class FilterCfg {

    //FilterRegistrationBean中配置的过滤器低于@WebFilter注解的过滤器
    //@Bean
    public FilterRegistrationBean registrFilter(){
        FilterRegistrationBean registration = new FilterRegistrationBean();
        registration.setFilter(new RequestFilter());
        registration.addUrlPatterns("/*");
        registration.setName("RequestFilter");
        registration.setOrder(2);
        return registration;
    }
}
