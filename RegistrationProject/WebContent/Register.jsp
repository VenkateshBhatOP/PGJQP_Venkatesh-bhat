<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>

<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Register Account</title>

<link href="css/style.css" rel="stylesheet" type="text/css" />
</head>
<body>
	<div class="container">
		<div class="regbox box">
			<img class="avatar" src="img/register.png" height="100" width="200">
			<h1>Register Account</h1>
			<form action="RegisterServlet" method="post">
				<p>Username</p>
				<input type="text" placeholder="Username" name="name" required>
				<p>EmailId</p>
				<input type="text" placeholder="EmailId" name="email" required>
				<p>Password</p>
				<input type="password" placeholder="Password" name="password"
					required> <input type="submit" value="Register"> <a
					href="index.jsp">Already have Account?</a>
			</form>
		</div>
	</div>
</body>
</html>
