package com.wang.service;

public class WangDemoService {
    private String appName;

    public WangDemoService(String appName) {
        this.appName = appName;
    }

    public String say() {
        return this.appName + " is begin";
    }
}
