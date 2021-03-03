<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<style type="text/css">
body{
background-color:#F6F7F9;
}
</style>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Register Account</title>
<link rel="preconnect" href="https://fonts.gstatic.com">
<link rel="preconnect" href="https://fonts.gstatic.com">
<link href="https://fonts.googleapis.com/css2?family=Poppins:wght@600&family=Source+Sans+Pro:wght@600&display=swap" rel="stylesheet">
<link href="css/style.css" rel="stylesheet" type="text/css" />
</head>
<body>
	<div class="container">
		<div class="regbox ">
			
			<h1>Register Account</h1>
			<form action="RegisterController" method="post">
				<p>Username</p>
				<input type="text" placeholder="Username" name="name" required>
				<p>Email</p>
				<input type="text" placeholder="Email" name="email" required>
				<p>Password</p>
				<input type="password" placeholder="Password" name="password"
					required> <input type="submit" value="Register"> <a style="color:grey"class="account"
					href="LoginServlet">Already have Account?</a>
			</form>
		</div>
	</div>
</body>
</html>
