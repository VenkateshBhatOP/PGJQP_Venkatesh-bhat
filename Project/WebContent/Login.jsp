<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<style>
body{
background-color:#F6F7F9;
}
</style>
<meta charset="ISO-8859-1">
<title>Login</title>
<link rel="preconnect" href="https://fonts.gstatic.com">
<link rel="preconnect" href="https://fonts.gstatic.com">
<link href="https://fonts.googleapis.com/css2?family=Poppins:wght@600&family=Source+Sans+Pro:wght@600&display=swap" rel="stylesheet">
<link href="css/style.css" rel="stylesheet" type="text/css" />
</head>
<body>
<body>
	<div class="container">
		<div class="box">
			
			<h1>Login</h1>
			<form action="LoginController" method="post">
				<p>Email</p>
				<input type="text" placeholder="Email" name="email" required>
				<p>Password</p>
				<input type="password" placeholder="Password" name="password"
					required> 
					
					
				<input type="submit" value="Login"> <a class="home" style="color:grey"
					href="index.jsp">Home</a><br> <a style="color:grey"class="home" href="RegisterServlet">Create
					New Account</a>
			</form>
		</div>
	</div>

	
</body>


</html>