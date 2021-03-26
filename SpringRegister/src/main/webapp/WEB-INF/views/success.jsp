<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Registration </title>
</head>
<body>
<h1>Welcome , ${student.userName} ,You have been Registered Successfully. </h1>
<h3>Your email id is , ${student.email}</h3>
<br>
<a href="index.jsp">Logout</a>

</body>
</html>