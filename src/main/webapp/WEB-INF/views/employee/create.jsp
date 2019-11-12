<%--
  Created by IntelliJ IDEA.
  User: An Viet Hung
  Date: 11/12/2019
  Time: 5:04 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Create a new Employee</title>
</head>
<body>
<h3>Welcome, Enter the employee details</h3>
<form:form method="post" action="/addEmployee" modelAttribute="employee">
    <table>
        <tr>
            <td>Employee ID:</td>
            <td><form:input path="id"/></td>
        </tr>
        <tr>
            <td>Employee's name:</td>
            <td><form:input path="name"/></td>
        </tr>
        <tr>
            <td>Contact's number:</td>
            <td><form:input path="contactNumber"/></td>
        </tr>
        <tr>
            <td><input type="submit" value="Submit"></td>
        </tr>
    </table>
</form:form>
</body>
</html>
