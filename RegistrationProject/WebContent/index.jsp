<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login</title>
<link href="css/style.css" rel="stylesheet" type="text/css" />
</head>
<body>
<body>
	<div class="container">
		<div class="box">
			<img class="avatar" src="img/login.png">
			<h1>Login Account</h1>
			<form action="LoginServlet" method="post">
				<p>EmailId</p>
				<input type="text" placeholder="Email" name="email" required>
				<p>Password</p>
				<input type="password" placeholder="Password" name="password"
					required> <input type="submit" value="Login"> <a
					href="HomePage.jsp">Home</a><br> <a href="Register.jsp">Create
					New Account</a>
			</form>
		</div>
	</div>

	<!--  <a href="Register.jsp">Go for register</a>-->
</body>


</html>