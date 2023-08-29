<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>  
	<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<style>
.error {
	color: #FF0000
}
</style>

<script src="https://code.jquery.com/jquery-1.12.4.js"></script>
<script
	src="https://cdn.jsdelivr.net/jquery.validation/1.16.0/jquery.validate.min.js"></script>
<script>
function confirmDelete() {
	var status = confirm("Are you sure, you want to delete?");
	if (status) {
		return true;
	} else {
		return false;
	}
}
</script>
</head>
<body>
	<table border=1>
	
	<thead>
	<tr>
	<th>S.no</th>
		<th>UserName</th>
		<th>Email</th>
		<th>PhonoNumber</th>
		<th>Country</th>
		<th>Action</th>
		
		</tr>
	
	</thead>
	
	<tbody>
	<c:forEach items="${userList}" var="user" varStatus="index">
	<tr>
	    <td>${index.count}</td>
	    <td>${user.username }</td>
	       
	    <td>${user.email }</td>
	       <td>${user.phno }</td>
	          <td>${user.country }</td>
	          <td><a href="deleteUser?userId=${user.userId}" onclick="return confirmDelete()">Delete</a>
	                  <a href="editUser?userId=${user.userId}">Edit</a></td>
		</tr>
	</c:forEach>
	
   </tbody>
	</table>
</body>
</html>