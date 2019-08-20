<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
    <%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Register Here</title>
</head>
<body>
<form:form action="addUser" method="post">

<label>UserName</label>
<form:input path="userName"/>
<label>Password</label>
<form:input path="password"/>
<label>Email</label>
<form:input path="email"/>
<input type="submit" value="Add">

</form:form>
</body>
</html>
