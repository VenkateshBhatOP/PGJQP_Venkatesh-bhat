<%@ include file="header.jsp"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Book Details</title>
</head>
<body>

	<div allign="center">
		
			<br />
			<br />
			<br />
			<br />
			<br />
			<br /><a href="index.jsp">Logout</a><center>
			<form action="view" method="post">
				Select a Book Name:&nbsp; <select name="bookname">
					<c:forEach items="${allBooks}" var="book">
						<option value="${book.bookName}">
							${book.bookName}</option>
					</c:forEach>
				</select> <input type="submit" value="View" />
			</form>
			<br />
			<br />
			<table style="border: 3px red solid;">
				<tr>
					<td>Book Name</td>
					<td>:</td>
					<td>${book.bookName }</td>
				</tr>
				<tr>
					<td>Book Category</td>
					<td>:</td>
					<td>${book.category } </td>
				</tr>
				<tr>
					<td>Book Author</td>
					<td>:</td>
					<td>${book.author }</td>
				</tr>
				<tr>
					<td>Price</td>
					<td>:</td>
					<td>Rs. ${book.price} /-</td>
				</tr>
			</table>
		</center>
	</div>
</body>
</html>