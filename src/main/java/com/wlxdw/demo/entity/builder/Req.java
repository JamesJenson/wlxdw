package com.wlxdw.demo.entity.builder;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import java.io.Serializable;
/**
 * @auther: yuzx
 * @date: 2021/2/24 13:51
 * @description: 入参封装
 */
@Data
@ApiModel(description = "入参封装")
public class Req<T> implements Serializable {

    @ApiModelProperty(value = "请求流水")
    private String requestId;

    @ApiModelProperty(value = "请求时间")
    private String requestTime;

    @ApiModelProperty(value = "鉴权信息")
    private Authentication authentication;

    @ApiModelProperty(value = "请求体")
    private T requestData;

    public Req(){

    }

    public Req(String requestId, String requestTime, Authentication authentication, T requestData){
        this.requestId = requestId;
        this.requestTime = requestTime;
        this.authentication = authentication;
        this.requestData = requestData;
    }



}
