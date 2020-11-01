<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 11/1/2020
  Time: 8:56 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>controller.Edit student</h1>
<div style="width: 800px; margin: 0 auto;">
    <c:forEach items="${customerList}" var="customer">
        <form name="editForm" method="post" action="/edit">
            <input type="hidden" name="id" value="${customer.ID}" style="width: 150px"><br>
            ID<br>
            <input type="text" name="name" value="${customer.name}" style="width: 150px"><br>
            Name<br>
            <input type="text" name="age" value="${customer.age}" style="width: 150px"><br>
            Age<br>
            <input type="submit" value="Save">
        </form>
    </c:forEach>
</div>
</body>
</html>
