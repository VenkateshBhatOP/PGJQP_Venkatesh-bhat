<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
This is About us page

<%String name=(String)request.getAttribute("name"); 
Integer id=(Integer)request.getAttribute("Id");
%>
<!--  
<h3>My name is<%=name %></h3>
<h3>My id is <%=id %></h3>-->
<br>
<a href="index.jsp">Back</a>

</body>
</html>