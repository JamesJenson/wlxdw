package com.wlxdw.demo.application;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.web.context.WebServerInitializedEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * @auther: yuzx
 * @date: 2021/2/24 11:04
 * @description: 初始化项目打印swagger地址
 */
@Slf4j
@Component
public class SwaggerUrlPrint implements ApplicationRunner, ApplicationListener<WebServerInitializedEvent> {

    private int serverPort;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        log.info("swagger:{}/swagger-ui.html",getUrl());
    }

    @Override
    public void onApplicationEvent(WebServerInitializedEvent webServerInitializedEvent) {
        this.serverPort = webServerInitializedEvent.getWebServer().getPort();
    }

    private String getUrl(){
        InetAddress address = null;
        try {
            address = InetAddress.getLocalHost();
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }
        return "http://" + address.getHostAddress() + ":" + this.serverPort;
    }
}
