package com.wlxdw.demo.controller;

import com.alibaba.fastjson.JSONObject;
import com.wlxdw.demo.entity.Hahah;
import com.wlxdw.demo.entity.builder.Req;
import com.wlxdw.demo.entity.builder.Rsp;
import com.wlxdw.demo.entity.builder.RspBuilder;
import com.wlxdw.demo.service.TestService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @auther: yuzx
 * @date: 2021/2/24 10:30
 * @description: 测试接口
 */
@RestController
@Slf4j
@RequestMapping("/wlxdw/test")
@Api(value = "测试模板接口", tags = {"测试接口"})
public class TestController {

    @Autowired
    private TestService testService;

    @PostMapping("/test")
    @ApiOperation(value = "测试接口",notes = "测试接口")
    public Rsp test(@RequestBody Req<Hahah> req){
        System.out.println(JSONObject.toJSONString(req));
        //testService.test("AAA");
        return RspBuilder.builder().setRequsetId(req.getRequestId()).setRequestTime("20210224").build();
    }
}
