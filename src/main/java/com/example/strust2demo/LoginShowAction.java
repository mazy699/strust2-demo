package com.example.strust2demo;

import com.example.bean.LoginUser;
import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ModelDriven;

public class LoginShowAction implements Action, ModelDriven<LoginUser> {
    private LoginUser loginUser;

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

    @Override
    public LoginUser getModel() {
        if (this.loginUser == null)
            loginUser = new LoginUser();
        return loginUser;
    }
}
