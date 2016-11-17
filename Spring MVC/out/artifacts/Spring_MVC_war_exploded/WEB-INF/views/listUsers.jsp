<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<%--
  Created by IntelliJ IDEA.
  User: isirbu
  Date: 11/15/2016
  Time: 4:46 PM
  To change this template use File | Settings | File Templates.
--%>

<html>
<body>

<h1 align="center">
    Users List
</h1>

<table width="700" align="center">
    <tr>
        <td>UserName</td>
        <td>FirstName</td>
        <td>LastName</td>
        <td>Age</td>
    </tr>
    <c:forEach items="${userList}" var="user">
        <tr>
            <td>${user.userName}</td>
            <td>${user.firstName}</td>
            <td>${user.lastName}</td>
            <td>${user.age}</td>
        </tr>
    </c:forEach>
</table>
</body>
</html>