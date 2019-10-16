<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>Beautiful Bootstrap Navbar with Menu Icons</title>
<link href="https://fonts.googleapis.com/css?family=Roboto|Varela+Round" rel="stylesheet">
<link rel="stylesheet" href="https://fonts.googleapis.com/icon?family=Material+Icons">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<link rel="stylesheet" href="navbar.css">
</head> 
<body>
<nav class="navbar navbar-inverse navbar-expand-xl navbar-dark">
	<div class="navbar-header d-flex col">
		<a class="navbar-brand" href="#"><i class="fa fa-user-secret"></i>Code<b>Seeker</b></a>  		
		<button type="button" data-target="#navbarCollapse" data-toggle="collapse" class="navbar-toggle navbar-toggler ml-auto">
			<span class="navbar-toggler-icon"></span>
			<span class="icon-bar"></span>
			<span class="icon-bar"></span>
			<span class="icon-bar"></span>
		</button>
	</div>
	<!-- Collection of nav links, forms, and other content for toggling -->
	<div id="navbarCollapse" class="collapse navbar-collapse justify-content-start">		
		<form class="navbar-form form-inline">
			<div class="input-group search-box">								
				<input type="text" id="search" class="form-control" placeholder="Search here...">
				<span class="input-group-addon"><i class="material-icons">&#xE8B6;</i></span>
			</div>
		</form>
		<ul class="nav navbar-nav navbar-right ml-auto">
			<li class="nav-item active"><a href="index.jsp" class="nav-link"><i class="fa fa-home"></i><span>Home</span></a></li>
			<li class="nav-item"><a href="projects.jsp" class="nav-link"><i class="fa fa-gears"></i><span>Projects</span></a></li>
			<li class="nav-item"><a href="team.jsp" class="nav-link"><i class="fa fa-users"></i><span>Team</span></a></li>
			<li class="nav-item"><a href="reports.jsp" class="nav-link"><i class="fa fa-pie-chart"></i><span>Reports</span></a></li>
			<li class="nav-item"><a href="career.jsp" class="nav-link"><i class="fa fa-briefcase"></i><span>Careers</span></a></li>
			<li class="nav-item"><a href="messages.jsp" class="nav-link"><i class="fa fa-envelope"></i><span>Messages</span></a></li>
			<li class="nav-item"><a href="messages.jsp" class="nav-link"><i class="fa fa-registered"></i><span>Register</span></a></li>	
			<li class="nav-item"><a href="notification.jsp" class="nav-link"><i class="fa fa-bell"></i><span>Notifications</span></a></li>
			<li class="nav-item dropdown">
				<a href="#" data-toggle="dropdown" class="nav-link dropdown-toggle user-action"><img src="https://www.tutorialrepublic.com/examples/images/avatar/3.jpg" class="avatar" alt="Avatar"> User <b class="caret"></b></a>
				<ul class="dropdown-menu">
					<li><a href="profile.jsp" class="dropdown-item"><i class="fa fa-user-o"></i> Profile</a></li>
					<li><a href="login.jsp" class="dropdown-item"><i class="fa fa-user"></i> Login</a></li>
					<li><a href="settings.jsp" class="dropdown-item"><i class="fa fa-sliders"></i> Settings</a></li>
					<li class="divider dropdown-divider"></li>
					<li><a href="logout.jsp" class="dropdown-item"><i class="material-icons">&#xE8AC;</i> Logout</a></li>
				</ul>
			</li>
		</ul>
	</div>
</nav>
</body>
</html>                                                        