package com.wlxdw.demo.filter;


import org.springframework.core.annotation.Order;

import javax.servlet.*;
import javax.servlet.FilterConfig;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;
/**
 * @auther: yuzx
 * @date: 2021/2/24 11:04
 * @description: 过滤器注解生成
 */

//@WebFilter(urlPatterns = "/*", filterName = "RequestFilter")
public class RequestFilterExample implements Filter {


    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        long start = System.currentTimeMillis();
        System.out.println("Request cost="+(System.currentTimeMillis()-start));
        filterChain.doFilter(servletRequest,servletResponse);
    }

    @Override
    public void destroy() {

    }
}
