<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
     <%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>User Successsfully Entered</h1>
<form:form action="login" method="post" >

<label>UserName</label>
<form:input path="userName"/>
<form:errors path="userName"></form:errors>
<label>Password</label>
<form:input path="password"/>

<input type="submit" value="Submit">
</form:form>
</body>
</html>