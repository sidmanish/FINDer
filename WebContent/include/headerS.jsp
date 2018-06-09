<%if(session.getAttribute("username")==null) {
RequestDispatcher rd = request.getRequestDispatcher("login.jsp");
request.setAttribute("msg","Session expired!! Please login again!!");
rd.forward(request, response);
}else{
%>

<%@page import="com.finder.dao.*"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="java.util.List" %>
     <%@ page import="com.finder.bean.*" %>
     <%@page import="com.finder.servlet.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
 <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

<title>Finder :Dashboard</title>
<!-- Favicon -->
    <link rel="shortcut icon" type="image/icon" href="assets/images/FINDernew.png"/>
    <!-- Font Awesome -->
    <link href="https://maxcdn.bootstrapcdn.com/font-awesome/4.6.3/css/font-awesome.min.css" rel="stylesheet">
     <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta/css/bootstrap.min.css" integrity="sha384-/Y6pD6FV/Vv2HJnA6t+vslU6fwYXjCFtcEpHbNJ0lyAFsXTsjBbfaDjzALeQsN6M" crossorigin="anonymous">
    
    <!-- Slick slider -->
    <link href="assets/css/slick.css" rel="stylesheet">
    <!-- Gallery Lightbox -->
    <link href="assets/css/magnific-popup.css" rel="stylesheet">
    <!-- Skills Circle CSS  -->
    <link rel="stylesheet" type="text/css" href="https://unpkg.com/circlebars@1.0.3/dist/circle.css">
    

    <!-- Main Style -->
    <link href="style.css" rel="stylesheet">
    <link href="Login.css" rel="stylesheet">

    <!-- Fonts -->

    <!-- Google Fonts Raleway -->
	<link href="https://fonts.googleapis.com/css?family=Raleway:300,400,400i,500,500i,600,700" rel="stylesheet">
	<!-- Google Fonts Open sans -->
	<link href="https://fonts.googleapis.com/css?family=Open+Sans:400,400i,600,700,800" rel="stylesheet">
 

</head>

<body>
 <!--START SCROLL TOP BUTTON -->
    <a class="scrollToTop" href="#">
      <i class="fa fa-angle-up"></i>
    </a>
  <!-- END SCROLL TOP BUTTON -->
  	
  	<!-- Start Header -->
	<header id="mu-hero">
		<div class="container">
			<nav class="navbar navbar-expand-lg navbar-light mu-navbar">
				<!-- Text based logo -->
				<a class="navbar-brand mu-logo" href="index.html"><span>FINDer</span></a>
				<!-- image based logo -->
			   	<!-- <a class="navbar-brand mu-logo" href="index.jsp"><img src="assets/images/logo.png" alt="logo"></a> -->
			  <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
			    <span class="fa fa-bars"></span>
			  </button>

			  <div class="collapse navbar-collapse" id="navbarSupportedContent">
			    <ul class="navbar-nav mr-auto mu-navbar-nav">
			      <li class="nav-item">
			        <a href="index.html">Home</a>
			      </li>
			      
			    <li class="nav-item dropdown ">
				        <a class="dropdown-toggle" href="blog.html" role="button" id="navbarDropdown" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
				          Services
				        </a>
				       <div class="dropdown-menu" aria-labelledby="navbarDropdown">
				          <a class="dropdown-item" href="addService.jsp">Add Services</a>
				          <a class="dropdown-item" href="ViewServiceServlet">List of services</a>
				        </div>
				    </li>
				    <li class="nav-item dropdown ">
				        <a class="dropdown-toggle" href="blog.html" role="button" id="navbarDropdown" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
				          Service Providers
				        </a>
				       <div class="dropdown-menu" aria-labelledby="navbarDropdown">
				          <a class="dropdown-item" href="AddSProviderServlet">Add Service providers</a>
				          <a class="dropdown-item" href="ViewSProviderServlet">List of service providers</a>
				        </div>
				    </li>
				     <li class="nav-item dropdown ">
				        <a class="dropdown-toggle" href="blog.html" role="button" id="navbarDropdown" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
				          Location
				        </a>
				       <div class="dropdown-menu" aria-labelledby="navbarDropdown">
				          <a class="dropdown-item" href="addLocation.jsp">Add Locations</a>
				          <a class="dropdown-item" href="ViewLocationServlet">List of Locations</a>
				        </div>
				    </li>
			      
			      
			       
			       
			        <li class="nav-item "><a href="LogOutServlet">Logout</a></li>
			    </ul>
			  </div>
			</nav>
		</div>
	</header>
	<!-- End Header -->
	
