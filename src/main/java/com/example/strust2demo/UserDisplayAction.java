package com.example.strust2demo;

import com.example.bean.Teacher;
import com.example.bean.User;
import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.ServletActionContext;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.List;

public class UserDisplayAction extends ActionSupport {
    User user = new User();
    @Override
    public String execute() throws Exception {
        HttpServletRequest request = ServletActionContext.getRequest();
        HttpSession session = request.getSession();
        String fromindex = request.getParameter("fromindex");
        if (!fromindex.isBlank()){
            user.setUserId("2222");
            user.setUserName("张三");
            List<Teacher> teacherList = new ArrayList<>();
            for (int i = 0; i < 10; i++) {
                Teacher teacher = new Teacher();
                teacher.setTeacherId(i+"");
                teacherList.add(new Teacher());
            }
            user.setTeacherList(teacherList);
            session.setAttribute("user",user);
        }
        return super.execute();
    }
}
