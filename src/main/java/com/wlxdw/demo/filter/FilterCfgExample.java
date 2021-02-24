package com.wlxdw.demo.filter;

import org.springframework.boot.web.servlet.FilterRegistrationBean;

//@Configuration
public class FilterCfgExample {

    //FilterRegistrationBean中配置的过滤器低于@WebFilter注解的过滤器
    //@Bean
    public FilterRegistrationBean registrFilter(){
        FilterRegistrationBean registration = new FilterRegistrationBean();
        registration.setFilter(new RequestFilterExample());
        registration.addUrlPatterns("/*");
        registration.setName("RequestFilter");
        registration.setOrder(2);
        return registration;
    }
}
