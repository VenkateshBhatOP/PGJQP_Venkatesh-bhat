<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@page isELIgnored="false" %>
         <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<h1>Welcome to homepage</h1>

<%
String name=(String)request.getAttribute("name");
%>

<h2>My name is  ${name}  </h2>


<hr>
<!--  
<h4>My Friends are: </h4>
<c:forEach var="item" items="${friends }">
<h3>${item}</h3>
</c:forEach>-->

<a href="index.jsp">Back</a>
</body>
</html>