package com.wlxdw.demo.filter;


import org.springframework.core.annotation.Order;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

/**
 * @auther: yuzx
 * @date: 2021/2/24 11:04
 * @description: 过滤器注解生成
 */
// 该注解的优先级按照过滤器名称排序，且都高于FilterRegistrationBean中配置的过滤器
// 须在启动类上添加扫描注解
// @Order注解并不能解决过滤器排序问题
//@WebFilter(urlPatterns = "/*", filterName = "LogCostFilter")
public class LogCostFilterExample implements Filter {


    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        long start = System.currentTimeMillis();
        System.out.println("LogFilter Execute cost=" + (System.currentTimeMillis() - start));
        filterChain.doFilter(servletRequest, servletResponse);
    }

    @Override
    public void destroy() {

    }
}
