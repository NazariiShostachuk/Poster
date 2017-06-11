
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %><%--
  Created by IntelliJ IDEA.
  User: MackGeeker
  Date: 10.06.2017
  Time: 23:30
  To change this template use File | Settings | File Templates.
--%>
<html>
<head>
    <title>Registration</title>
</head>
<body>
    Registration

    <form:form modelAttribute="" action="registration" method="post" id="regForm">
        <div class="row">
            <div class="input-field col s12">
                <input id="firstnameRegistration" path="firstName"  name="firstName" type="text" required>
                <label for="firstnameRegistration">FirstName</label>
            </div>
        </div>
        <div class="row">
            <div class="input-field col s12">
                <input id="lastnameRegistration" path="lastName"  name="lastName" type="text" required>
                <label for="lastnameRegistration">LastName</label>
            </div>
        </div>
        <div class="row">
            <div class="input-field col s12">
                <input id="usernameRegistration" path="username"  name="username" type="text" required>
                <label for="usernameRegistration">UserName</label>
            </div>
        </div>
        <div class="row">
            <div class="input-field col s12">
                <input id="emailUp" path="email"  name="email" type="email" required>
                <label for="emailUp">Email</label>
            </div>
        </div>
        <div class="row">
            <div class="input-field col s12">
                <input id="phoneNumberRegistration" path="phoneNumber"  name="phoneNumber" type="number" required>
                <label for="phoneNumberRegistration">Phone Number</label>
            </div>
        </div>
        <div class="row">
            <div class="input-field col s12">
                <input id="passwordRegistration" path="password"  name="password" type="password" required>
                <label for="passwordRegistration">Password</label>
            </div>
        </div>
        <button class="btn waves-effect waves-light" type="submit" name="user" form="regForm" >Sign UP
        </button>
    </form:form>
</body>
</html>
