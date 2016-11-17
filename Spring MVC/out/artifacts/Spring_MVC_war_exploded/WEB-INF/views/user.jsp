<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: isirbu
  Date: 11/14/2016
  Time: 6:21 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<body>

<h1 align="center">
    HOME
</h1>

<form:form method="POST" action="" commandName="user">
    <table>
        <tr>
            <td><form:label path="userName">User Name</form:label></td>
            <td><form:input path="userName" /></td>
        </tr>
        <tr>
            <td><form:label path="firstName">First Name</form:label></td>
            <td><form:input path="firstName" /></td>
        </tr>
        <tr>
            <td><form:label path="lastName">Last Name</form:label></td>
            <td><form:input path="lastName" /></td>
        </tr>
        <tr>
            <td><form:label path="age">Age</form:label></td>
            <td><form:input path="age" /></td>
        </tr>
        <tr>
            <td>
                <input type="submit" value="Add" onclick="form.action='/user/addUser'"/>

            </td>
        </tr>

        <tr>
            <td>
                <input type="submit" value="Delete" onclick="form.action='/user/deleteUser'"/>
            </td>
        </tr>

        <tr>
            <td>
                <input type="submit" value="Update" onclick="form.action='/user/updateUser'"/>
            </td>
        </tr>
    </table>
</form:form>
</body>
</html>