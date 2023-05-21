<%--
  Created by IntelliJ IDEA.
  User: mzy
  Date: 2023/4/27
  Time: 22:25
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<html>
<head>
    <title>user-display</title>
</head>
<body>
    <form action="userConfirm.action" method="post">
        <div>
            <input type="text" name="user.userId" value=${user.userId} >
        </div>
        <br>
        <hr>
        <br>
        <div>
            <table border="1">
                <c:forEach items="${user.teacherList}" var="teacher" varStatus="status">
                    <tr>
                        <td>
                            <input type="text" name="teacherList[${status.index}].teacherId" value=${teacher.teacherId}>
                        </td>
                        <td>
                            <input type="text" name="user.teacherList[${status.index}].teacherName" value=${teacher.teacherName}>
                        </td>
                        <td>
                            <input type="text" name="teacherList[${status.index}].sex" value=${teacher.sex} >
                        </td>
                        <td>
                            <input type="text" name="teacher.age" value=${teacher.age} />
                        </td>>
                    </tr>
                </c:forEach>
            </table>
        </div>
        <button type="submit">submit</button>
    </form>
</body>
</html>
