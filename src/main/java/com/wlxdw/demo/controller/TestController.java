package com.wlxdw.demo.controller;

import com.wlxdw.demo.service.TestService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
/**
 * @auther: yuzx
 * @date: 2021/2/24 10:30
 * @description:
 */
@RestController
@Slf4j
@RequestMapping("/wlxdw/test")
@Api(value = "测试模板接口", tags = {"测试接口"})
public class TestController {

    @Autowired
    private TestService testService;

    @GetMapping("/test")
    @ApiOperation(value = "测试接口",notes = "测试接口")
    public String test(){
        System.out.println("BBB");
        testService.test("AAA");
        return "AAAAAA";
    }
}
