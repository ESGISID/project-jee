<%--
  Created by IntelliJ IDEA.
  User: savon
  Date: 05/03/2023
  Time: 14:50
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
	<head>
		<title>MyApp</title>
		<link rel="icon" type="image/x-icon" href="${pageContext.request.contextPath}/assets/images/moankaisa.ico">
		
		<link href="https://fonts.googleapis.com/css?family=Lato" rel="stylesheet">
		<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet"
			  integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC"
			  crossorigin="anonymous">
		
		<link href="${pageContext.request.contextPath}/css/index.css" rel="stylesheet" type="text/css">
		<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js"
				integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM"
				crossorigin="anonymous"></script>
	</head>
	<body>
		<nav class="navbar navbar-expand-lg navbar-dark bg-dark">
			<div class="container-fluid">
				<a class="navbar-brand" href="#">Bu$ine$$</a>
				<button class="navbar-toggler" type="button" data-bs-toggle="collapse"
						data-bs-target="#navbarSupportedContent" aria-controls="navbarSupportedContent"
						aria-expanded="false" aria-label="Toggle navigation">
					<span class="navbar-toggler-icon"></span>
				</button>
				<div class="collapse navbar-collapse" id="navbarSupportedContent">
					<ul class="navbar-nav me-auto mb-2 mb-lg-0">
						<li class="nav-item">
							<a class="nav-link active" aria-current="page" href="${pageContext.request.contextPath}/">Home</a>
						</li>
						<li class="nav-item">
							<a class="nav-link" href="${pageContext.request.contextPath}/search-servlet">List users</a>
						</li>
						<li class="nav-item dropdown">
							<a class="nav-link dropdown-toggle"
							   id="navbarDropdown" role="button"
							   data-bs-toggle="dropdown" aria-expanded="false">
								Dropdown
							</a>
							<ul class="dropdown-menu" aria-labelledby="navbarDropdown">
								<li><a class="dropdown-item" href="#">Action</a></li>
								<li><a class="dropdown-item" href="#">Another action</a></li>
								<li>
									<hr class="dropdown-divider">
								</li>
								<li><a class="dropdown-item" href="#">Something else here</a></li>
							</ul>
						</li>
						<li class="nav-item">
							<a class="nav-link disabled" href="#" tabindex="-1" aria-disabled="true">Disabled</a>
						</li>
					</ul>
					<form class="d-flex" action = "${pageContext.request.contextPath}/user-details-servlet" method = "GET">
						<input class="form-control me-2" type="search" placeholder="Search" aria-label="Search"  name="username" style="width: 180px">
						<button class="btn btn-outline-success" type="submit" style="width: 140px">Search users</button>
					</form>
				</div>
			</div>
		</nav>
