package com.example.strust2demo;

import com.opensymphony.xwork2.ActionSupport;

public class HelloStrust extends ActionSupport {
    public String hello() {
        System.out.println("用户登录");
        return SUCCESS;
    }
}
