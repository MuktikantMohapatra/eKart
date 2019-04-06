<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h3>eKart Shopping Site</h3>
	<form:form action="${pageContext.request.contextPath}/authenticateTheUser" method="POST" >
        User :<input type="text" name="username" >
        Password :<input type="password" name="password" >
        <button type="submit">Sign in</button>
	</form:form>
</body>
</html> 