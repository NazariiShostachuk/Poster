<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <meta http-equiv="x-ua-compatible" content="ie=edge">
    <title>Hello</title>

</head>
<body>

Hello

<a href="/admin">Admin</a>
<a href="/registration">Registration</a>
<a href="/login">Login</a>
<a href="/${usrname.originUsername}">profile</a>
<br>

<c:forEach var="user" items="${allUsers}">
      <a href="${user.originUsername}">${user.originUsername}</a>
    <br>
</c:forEach>
</body>
</html>