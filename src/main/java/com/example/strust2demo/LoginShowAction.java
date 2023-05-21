package com.example.strust2demo;

import com.opensymphony.xwork2.Action;

public class LoginShowAction implements Action {
    // 与前端页面input中的name保持一致，并提供get和set方法，可以接收参数
    private String username;
    private String password;
    private String errors;


    public String getErrors() {
        return errors;
    }

    public void setErrors(String errors) {
        this.errors = errors;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String execute(){
        System.out.println(this.username+":"+this.password);
        if(username.equals("mazy")&&password.equals("123456")){
            return SUCCESS;
        }else
        {
            this.errors="用户名或密码错误";
            return ERROR;
        }
    }
}
