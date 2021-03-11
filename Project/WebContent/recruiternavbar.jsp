

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Homepage</title>
<link href="css/navbar.css" rel="stylesheet" type="text/css" />
<link rel="preconnect" href="https://fonts.gstatic.com">
<link
	href="https://fonts.googleapis.com/css2?family=Source+Sans+Pro:wght@600&display=swap"
	rel="stylesheet">

<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
<style>
* {
	box-sizing: border-box;
}
</style>
</head>
<body>
	<nav class="content">
		<div class="navLeft">
			<img alt="" src="img/OpenNaukri.png" />
			<h3>Glassdoor</h3>
		</div>

		<div class="navRight">
			<ul>
				<li><a href="recruiternavbar.jsp">Home</a></li>
				<li><a href="#">About Us</a>
					<div class="aboutus">
						<ul id="drop">
							<li><a href="missionrecruiter.jsp">Mission</a></li>
							<li><a href="visionrecruiter.jsp">Vision</a></li>
							<li><a
								href="https://www.google.com/search?q=jobs&rlz=1C1SQJL_enIN927IN927&oq=jobs&aqs=chrome..69i57j0i433j0i131i433i457j0i402l2j69i61j69i60l2.856j0j4&sourceid=chrome&ie=UTF-8&ibp=htl;jobs&sa=X&ved=2ahUKEwiSuIGp8_juAhX0zzgGHXsSD4EQutcGKAB6BAgFEAQ&sxsrf=ALeKk03vhdNAlZldiZxyW4B3jtHyFCFwnA:1613839147760#htivrt=jobs&htidocid=veB3EQoWx7VUxI1dAAAAAA%3D%3D&fpstate=tldetail" target="_blank">career</a></li>
						</ul>
					</div></li>
				<li><a href="#"></a><a href="">Recruiter Actions</a>
				<div class="aboutus">
				<ul id="drop">
				<li><a href="user-list.jsp">Add Job Openings</a></li>
				<li><a href="RecruiterUser.jsp">Logout</a></li>
				</ul>
				</div>
				<!--  <li><a href="#"></a><a href="LoginServlet">Login</a></li>
				<li><a href="#"></a><a href="RegisterServlet">Register</a></li>-->
				<li>
					<form class="example" action="https://www.google.com/search"
						style="margin: auto; max-width: 250px" target="_blank">
						<input type="text" placeholder="skills,designation.." name="q">
						<button>
							<i class="fa fa-search"></i>
						</button>
					</form>

				</li>

			</ul>
		</div>

	</nav>
	
	<img src="img/naukriad.jpg" style="width:100%;height:400px;margin-left:0;"> 
	<br>
	
	<%@include file="recruiterfooter.jsp" %>
	
</body>
</html>