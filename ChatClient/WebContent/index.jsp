<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Code Seeker</title>
  
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js"></script>
  
  
</head>
<body>
<%@ include file="navbar.jsp" %>

<div class="container">
  <h2>We're here for something amazing.</h2>
  <div id="myCarousel" class="carousel slide" data-ride="carousel">
    <!-- Indicators -->
    <ol class="carousel-indicators">
      <li data-target="#myCarousel" data-slide-to="0" class="active"></li>
      <li data-target="#myCarousel" data-slide-to="1"></li>
      <li data-target="#myCarousel" data-slide-to="2"></li>
    </ol>

    <!-- Wrapper for slides -->
    <div class="carousel-inner" style="height:350px;">

      <div class="item active">
        <img src="images/carousal.jpg" alt="Los Angeles" style="width:100%; height:350px; ">
        <div class="carousel-caption">
          <h3>Hidden Challanges</h3>
          <p>Powereup the world with your light.</p>
        </div>
      </div>

      <div class="item">
        <img src="https://wallpaperplay.com/walls/full/6/4/9/187222.jpg" alt="Chicago" style="width:100%;">
        <div class="carousel-caption">
          <h3>Find yourself</h3>
          <p>Get attached with future techs.</p>
        </div>
      </div>
    
      <div class="item">
        <img src="https://wallpaperplay.com/walls/full/8/1/a/13365.jpg" alt="New York" style="width:100%;">
        <div class="carousel-caption">
          <h3>Something New.</h3>
          <p>We're waiting for you.</p>
        </div>
      </div>
  
    </div>

    <!-- Left and right controls -->
    <a class="left carousel-control" href="#myCarousel" data-slide="prev">
      <span class="glyphicon glyphicon-chevron-left"></span>
      <span class="sr-only">Previous</span>
    </a>
    <a class="right carousel-control" href="#myCarousel" data-slide="next">
      <span class="glyphicon glyphicon-chevron-right"></span>
      <span class="sr-only">Next</span>
    </a>
  </div>
</div>

</body>
</html>