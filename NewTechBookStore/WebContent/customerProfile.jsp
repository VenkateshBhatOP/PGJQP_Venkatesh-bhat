<%@ page import="com.newtechbookstore.model.Customer" %>
<%@ include file="header.jsp" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"  isELIgnored="false"%>
 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Success</title>
</head>
<body>
<center><u><h1>Login Successfull!!! Welcome :: ${customer.firstname}</h1></u></center>
<a href="index.jsp">Logout</a>
<br>
<a href="view">Book Details</a>
<center><u><h2>Customer Profile Form</h2></u>
<table style="border:1px red solid">
<tbody>
<tr><td>First Name:</td><td>${customer.firstname }</td></tr>
<tr><td>Last Name:</td><td> ${customer.lastname }</td></tr>
<tr><td>Gender:</td><td> ${customer.gender}</td></tr>
<tr><td>Date of Birth:</td><td> ${customer.dob }</td></tr>
<tr><td>Address:</td><td> ${customer.customerAddress}</td></tr> 
<tr><td>Email ID:</td><td> ${customer.email }</td></tr>
<tr><td>Phone No:</td><td> ${customer.phone }</td></tr>
</tbody>
</table>
</center>
</body>
</html>