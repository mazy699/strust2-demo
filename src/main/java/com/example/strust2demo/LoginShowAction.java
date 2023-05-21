package com.example.strust2demo;

import com.example.bean.LoginUser;
import com.opensymphony.xwork2.Action;

import java.util.List;

public class LoginShowAction implements Action {
    private List<LoginUser> loginUserlist;

    public List<LoginUser> getLoginUserlist() {
        return loginUserlist;
    }

    public void setLoginUserlist(List<LoginUser> loginUserlist) {
        this.loginUserlist = loginUserlist;
    }

    @Override
    public String execute() {
        for (LoginUser loginUser : loginUserlist) {
            System.out.println(loginUser.getUsername() + ":" + loginUser.getPassword());
            if (loginUser.getUsername().equals("mazy") && loginUser.getPassword().equals("123456")) {
                return SUCCESS;
            } else {
                loginUser.setErrors("用户名或密码错误");
                return ERROR;
            }
        }
        return SUCCESS;
    }
}
