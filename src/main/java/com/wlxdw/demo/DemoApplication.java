package com.wlxdw.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@ServletComponentScan("com.wlxdw.demo.filter")
@EnableSwagger2
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(new Class[]{DemoApplication.class}, args);
    }


}
