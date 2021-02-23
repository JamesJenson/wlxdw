package com.wlxdw.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping("/test")
    public String test(){
        System.out.println("BBB");
        return "AAAAAA";
    }
}
