package com.wlxdw.demo.entity.builder;

import com.wlxdw.demo.entity.enums.RspValueEnum;
import com.wlxdw.demo.utils.DateUtil;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import java.io.Serializable;
import java.util.Date;

/**
 * @auther: yuzx
 * @date: 2021/2/24 13:52
 * @description: 出参封装
 */
@Data
@ApiModel(description = "出参封装")
public class Rsp<T> implements Serializable {

    @ApiModelProperty(value = "请求流水")
    private String requestId;

    @ApiModelProperty(value = "响应时间")
    private String responseTime;

    @ApiModelProperty(value = "响应编码")
    private String responseCode;

    @ApiModelProperty(value = "响应结果")
    private String responseMsg;

    @ApiModelProperty(value = "响应体")
    private T responseData;

    public Rsp(){

    }

    public Rsp(String requestId, String responseTime, String responseCode, String responseMsg, T responseData){
        this.requestId = requestId;
        this.responseTime = responseTime;
        this.responseCode = responseCode;
        this.responseMsg = responseMsg;
        this.responseData = responseData;
    }

    public static <T> Rsp<T> success(String requestId){
        return new Rsp<>(requestId, DateUtil.format(new Date()), RspValueEnum.SUCCESS.getCode(), RspValueEnum.SUCCESS.getMsg(), null);
    }

    public static <T> Rsp<T> error(String requestId){
        return new Rsp<>(requestId, DateUtil.format(new Date()), RspValueEnum.FAIL.getCode(), RspValueEnum.FAIL.getMsg(), null);
    }

    public static <T> Rsp<T> error(String requestId, RspValueEnum rspValueEnum){
        return new Rsp<>(requestId, DateUtil.format(new Date()), rspValueEnum.getCode(), rspValueEnum.getMsg(), null);
    }

}
