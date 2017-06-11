<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%--
  Created by IntelliJ IDEA.
  User: MackGeeker
  Date: 10.06.2017
  Time: 23:30
  To change this template use File | Settings | File Templates.
--%>
<html>
<head>
    <title>Login</title>
</head>
<body>
    Login

    <form:form action="loginprocesing" method="post" id="formLoginModal">
        <div class="row">
            <div class="input-field col s12">
                <input id="usernameLogIn" path="userName"  name="username" type="text" required>
                <label for="usernameLogIn">UserName</label>
            </div>
        </div>
        <div class="row">
            <div class="input-field col s12">
                <input id="password" type="password" path="password" name="password" required>
                <label for="password">Password</label>
            </div>
        </div>
            <button class="btn waves-effect waves-light" type="submit" name="loginprocesing" form="formLoginModal" >Sign IN!
            </button>
    </form:form>
</body>
</html>
