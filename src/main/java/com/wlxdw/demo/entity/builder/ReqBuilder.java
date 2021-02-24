package com.wlxdw.demo.entity.builder;

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
