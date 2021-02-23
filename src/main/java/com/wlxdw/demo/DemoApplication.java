package com.wlxdw.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@SpringBootApplication
@ServletComponentScan("com.wlxdw.demo.filter")
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(new Class[]{DemoApplication.class}, args);
    }


}
