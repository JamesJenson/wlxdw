package com.wlxdw.demo.entity.enums;
/**
 * @auther: yuzx
 * @date: 2021/2/24 15:26
 * @description: 响应值枚举
 */
public enum RspValueEnum {

    SUCCESS("0000","请求成功"),
    FAIL("1000","请求失败");


    private String code;
    private String msg;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    RspValueEnum(String code, String msg){
        this.code = code;
        this.msg = msg;
    }
}
