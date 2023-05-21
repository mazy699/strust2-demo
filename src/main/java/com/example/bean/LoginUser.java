package com.example.bean;

public class LoginUser {
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
}
