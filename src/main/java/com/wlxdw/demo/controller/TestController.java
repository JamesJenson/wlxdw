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
import org.apache.tomcat.util.codec.binary.Base64;
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

    @GetMapping("/test")
    @ApiOperation(value = "测试接口",notes = "测试接口")
    public String test(@RequestParam(name = "url") String url){
        //String url = "https://cloud.tk.cn/tkpage/S20210026/#/?sourceType=19&utm_source=gzhmbxx5&idType=openId";
        //String url = "https://cloud.tk.cn/tkpage/gift-common/#/?activityType=10";
        url = Base64.encodeBase64URLSafeString(url.getBytes());
        String oathUrl = "https://open.weixin.qq.com/connect/oauth2/authorize?appid=wxa05747abe666b3b2&redirect_uri=http://wxpt.taikang.com/tkmap/wechat/oauth2/safeRedirect/wxa05747abe666b3b2?other=###&response_type=code&scope=snsapi_base&state=tkonline#wechat_redirect";
        oathUrl = oathUrl.replace("###", url);
        System.out.println(oathUrl);
        System.out.println(oathUrl.length());

        /*String oathUrl = WesureUtils.requestBodyDecrypt("1835C43E9A260A18666FAA5B8EF14A02");
        System.out.println(str);*/

        //System.out.println(Pattern.matches("^1\\d{10}$",""));

        return oathUrl;
    }
}
