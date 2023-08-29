<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<style>

</style>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<h1>${msg}</h1>
<body>
<h2 style="color:red">Student Login form</h2>

<form:form action ="loginForm" modelAttribute="login" method="POST" align="center">
 
<table>
<tr>
<td>UserName :</td>
<td><form:input path="uname"/></td>

</tr>

<tr>
<td>Password:</td>
<td><form:input path="pwd"/></td>
</tr>



<tr>

<td><input type="submit" value="submit"></td>
</tr>
</table>
<div style="color: red">${error}</div>
</form:form>
<a href="<c:url value='/logout' />">Click here to logout</a>  
 
</body>
</html>