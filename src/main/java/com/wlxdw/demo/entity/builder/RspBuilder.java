package com.wlxdw.demo.entity.builder;

public class RspBuilder<T> {

    private Rsp rsp;

    private RspBuilder(){
        this.rsp = new Rsp();
    }

    public static RspBuilder builder(){
        return new RspBuilder();
    }

    public RspBuilder setRequsetId(String requestId){
        this.rsp.setRequestId(requestId);
        return this;
    }

    public RspBuilder setRequestTime(String responseTime){
        this.rsp.setResponseTime(responseTime);
        return this;
    }

    public RspBuilder setResponseCode(String responseCode){
        this.rsp.setResponseCode(responseCode);
        return this;
    }

    public RspBuilder setResponseMsg(String responseMsg){
        this.rsp.setResponseMsg(responseMsg);
        return this;
    }

    public RspBuilder setResponseData(T responseData){
        this.rsp.setResponseData(responseData);
        return this;
    }

    public Rsp build(){
        return this.rsp;
    }
}
