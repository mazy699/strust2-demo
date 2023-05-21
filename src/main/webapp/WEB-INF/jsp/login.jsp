<%--
  Created by IntelliJ IDEA.
  User: mzy
  Date: 2023/5/3
  Time: 12:23
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
  <meta charset="UTF-8">
  <title>Title</title>
</head>
<body>
<form action="loginShow.action" method="post">
  <div>
    <span style="color:red">${errors}</span><br>
    <span style="display:inline-block;text-align:right;width:65px;">
      用户名：
    </span>
    <input type="text" name="username" value="${username}"/><br>
    <span style="display:inline-block;text-align:right;width:65px;">
      密码：
    </span>
    <input type="password" name="password" />
  </div>
  <div style="margin-top: 10px;width: 250px;text-align: right;">
    <input  type="submit"  value="提交" />
  </div>
</form>
</body>
</html>

