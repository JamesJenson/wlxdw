package com.wlxdw.demo.entity.builder;

/**
 * @auther: yuzx
 * @date: 2021/2/24 11:04
 * @description: 入参建造者
 */
public class ReqBuilder<T> {

    private Req req;

    private ReqBuilder(){
        this.req = new Req();
    }

    public static ReqBuilder builder(){
        return new ReqBuilder();
    }

    public ReqBuilder setRequsetId(String requestId){
        this.req.setRequestId(requestId);
        return this;
    }

    public ReqBuilder setRequestTime(String requestTime){
        this.req.setRequestTime(requestTime);
        return this;
    }

    public ReqBuilder setAuth(Authentication authentication){
        this.req.setAuthentication(authentication);
        return this;
    }

    public ReqBuilder setRequestData(T requestData){
        this.req.setRequestData(requestData);
        return this;
    }

    public Req build(){
        return this.req;
    }
}
