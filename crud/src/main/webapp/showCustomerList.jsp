
<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 11/1/2020
  Time: 8:56 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<div style="width: 800px;margin: 0 auto">
    <a href="addCustomer.jsp">Add new customer</a>
    <table cellpadding="10" border="1">
        <tr>
            <th>ID</th>
            <th>Name</th>
            <th>Age</th>
        </tr>
        <c:forEach items="${customerList}" var="customer">
            <tr>
                <td>${customer.ID}</td>
                <td>${customer.name}</td>
                <td>${customer.age}</td>
                <td>
                    <a href="edit?id=${customer.ID}">Edit</a>
                    <a href="delete?id=${customer.ID}">Delete</a>
                </td>
            </tr>
        </c:forEach>
    </table>
</div>
</body>
</html>
