<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 11/1/2020
  Time: 11:01 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form name="addForm" method="get" action="/add">
    Name<br>
    <input type="text" name="name" placeholder="..." style="width: 150px"><br>
    Last Name<br>
    <input type="text" name="age" placeholder="..." style="width: 150px"><br>
    Age<br>
    <input type="submit" value="Save">
</form>
</body>
</html>
