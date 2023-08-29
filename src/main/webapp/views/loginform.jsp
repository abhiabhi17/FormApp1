<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
    <%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ page session="false"%>
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

  <div style="text-align: right;padding:5px;margin:5px 0px;background:#ccc;">
       <a href="${pageContext.request.contextPath}/loginform?lang=en">Login (English)</a>
       &nbsp;|&nbsp;
       <a href="${pageContext.request.contextPath}/loginform?lang=fr">Login (French)</a>
       &nbsp;|&nbsp;
       <a href="${pageContext.request.contextPath}/loginform?lang=vi">Login (Vietnamese)</a>
    </div>
 
    
    
<h2 style="color:red">Student Login form</h2>

<form:form action ="loginForm" modelAttribute="login" method="POST" align="center">
 
<table>
<tr>
     <td>
                 <strong>
                <spring:message    code="label.userName" />
                </strong>
                </td>
<td>UserName :</td>
<td><form:input path="uname"/></td>

</tr>

<tr>
 <td>
                 <strong>
                <spring:message    code="label.password" />
                </strong>
                </td>
<td>Password:</td>
<td><form:input path="pwd"/></td>
</tr>



<tr>
<td colspan="2">
                <spring:message code="label.submit" var="labelSubmit"></spring:message>
<td><input type="submit" value="${labelSubmit}"></td>
</tr>
</table>
<a href='/basic/login'>Click here to logout</a>  
</form:form>

 
</body>
</html>