package com.example.strust2demo;

import com.example.bean.Teacher;
import com.example.bean.User;
import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.ServletActionContext;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.List;

public class UserConfirmAction extends ActionSupport {
    private User user;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public String execute() throws Exception {
//        HttpServletRequest request = ServletActionContext.getRequest();
//        HttpSession session = request.getSession();
//        User user = (User) session.getAttribute("user");
//        String userId = (String) session.getAttribute("userId");
//        String rUserId = (String) request.getAttribute("userId");
        System.out.println(user.getUserId());
        for (Teacher teacher : user.getTeacherList()) {
            System.out.println(teacher.getTeacherId());
            System.out.println(teacher.getTeacherName());
            System.out.println(teacher.getSex());
            System.out.println(teacher.getAge());
        }

        return super.execute();
    }
}
