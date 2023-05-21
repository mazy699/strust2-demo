package com.example.strust2demo;

import com.example.bean.LoginUser;
import com.opensymphony.xwork2.Action;

public class LoginShowAction implements Action {
    private LoginUser loginUser;

    public LoginUser getLoginUser() {
        return loginUser;
    }

    public void setLoginUser(LoginUser loginUser) {
        this.loginUser = loginUser;
    }

    @Override
    public String execute() {
        System.out.println(loginUser.getUsername() + ":" + loginUser.getPassword());
        if (loginUser.getUsername().equals("mazy") && loginUser.getPassword().equals("123456")) {
            return SUCCESS;
        } else {
            loginUser.setErrors("用户名或密码错误");
            return ERROR;
        }
    }
}
