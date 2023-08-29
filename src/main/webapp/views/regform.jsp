<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<style>
.error {
 color: red;
 font-weight: bolder;
}
 
.commonerrorblock {
 color: #000;
 background-color: #ffEEEE;
 border: 3px solid #ff0000;
 
}
</style>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<h1>${msg}</h1>
<body>
<h2 style="color:red">Student Registration form</h2>
<form:form action ="formSubmit" modelAttribute="student" method="POST" align="center">
 <form:errors path="*" element="div" cssClass="commonerrorblock"/>
<table>
<tr>
<td>Student Id</td>
<td><form:input path="id"/></td>

</tr>

<tr>
<td>Student Name</td>
<td><form:input path="name"/></td>
 <td>
 <form:errors path="name" cssClass="error"/>
 </td>

<td>
 <form:errors path="name" cssClass="error"/>
 </td>
</tr>
<tr>
<td>Phone Number</td>
<td><form:input path="phno"/></td>
</tr>

<tr>

<td><form:label path = "gender">Gender</form:label></td>
               <td>
                  <form:radiobutton path = "gender" value = "M" label = "Male" />
                  <form:radiobutton path = "gender" value = "F" label = "Female" />
               </td>
</tr>


<tr>
<td>Qualification</td>
<td><form:select path="qualification" items="${qualifications}"/></td>
</tr>

<tr>
<td>Courses</td>
<td><form:select path="courses" items="${courses}"/></td>
</tr>

<tr>
<td><input type="submit" value="reset"></td>
<td><input type="submit" value="submit"></td>
</tr>
</table>
</form:form>

<!-- -------------------------------------------------- After submitting----------------------------------- -->

<h2 style="color:green">Student Submission form</h2>
      <table>
         <tr>
            <td>StudentID</td>
            <td>${student.id}</td>
         </tr>
         
         <tr>
            <td>Name</td>
            <td>${name}</td>
         </tr>    
         
         <tr>
            <td>PhonoNum</td>
            <td>${phno}</td>
         </tr>  
         
        <tr>
            <td>Gender</td>
            <td>${(gender=="M"? "Male" : "Female")}</td>
         </tr>    
         
         <tr>
            <td>Qualification</td>
            <td>${qualifications}</td>
         </tr>    
         
         <tr>
            <td>Courses</td>
            <td>${courses}</td>
         </tr>  
        
          	  
      </table>  
      <a href='/basic/login'>">Click here to logout</a>  
</body>
</html>