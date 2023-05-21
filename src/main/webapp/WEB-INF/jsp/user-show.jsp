<%--
  Created by IntelliJ IDEA.
  User: mzy
  Date: 2023/5/3
  Time: 12:23
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
  <meta charset="UTF-8">
  <title>Title</title>
</head>
<body>
<div>
  <c:out value="${user.userId}"></c:out>
</div>
<div>
  <table border="1">
    <c:forEach items="${user.teacherList}" var="teacher" varStatus="status">
      <tr>
        <td>
          <c:out value="${teacher.teacherId}"></c:out>
        </td>
        <td>
          <c:out value="${teacher.teacherName}"></c:out>
        </td>
        <td>
          <c:out value="${teacher.sex}"></c:out>
        </td>
        <td>
          <c:out value="${teacher.age}"></c:out>
        </td>>
      </tr>
    </c:forEach>
  </table>
</div>
</body>
</html>

