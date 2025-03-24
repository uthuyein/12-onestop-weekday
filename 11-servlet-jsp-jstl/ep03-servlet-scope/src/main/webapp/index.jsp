<%@page import="com.jdc.mkt.dto.Counter"%>
<%@page import="java.time.LocalDate"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC"
	crossorigin="anonymous">
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js"
	integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM"
	crossorigin="anonymous"></script>
<title>Servlet Communication</title>
</head>
<body>
	<nav class="navbar navbar-expand-lg navbar-light bg-light">
		<a class="navbar-brand" href="#">Communication</a>
		<button class="navbar-toggler" type="button" data-toggle="collapse"
			data-target="#navbarNavAltMarkup" aria-controls="navbarNavAltMarkup"
			aria-expanded="false" aria-label="Toggle navigation">
			<span class="navbar-toggler-icon"></span>
		</button>
		<div class="collapse navbar-collapse" id="navbarNavAltMarkup">
			<div class="navbar-nav">
				<a class="nav-item nav-link" href="counter">Scope</a>
			</div>
		</div>
	</nav>
	<div class="container">

		<table class="table table-striped mb-3">
			<tr>
				<td><a href="counter" class="nav-link">Request Scope :</a></td>
				<td>
					<%
					Counter c1 = (Counter) request.getAttribute("counter");
					if (null == c1) {
						c1 = new Counter();
					}
					%>
					<%= c1.getCounter() %>
				</td>
			</tr>
			
			<tr>
				<td><a href="counter" class="nav-link">Session Scope :</a></td>
				<td>
					<%
					Counter c2 = (Counter) session.getAttribute("counter");
					if (null == c2) {
						c2 = new Counter();
					}
					%>
					<%= c2.getCounter() %>
				</td>
			</tr>
			
			<tr>
				<td><a href="counter" class="nav-link">Application Scope :</a></td>
				<td>
					<%
					Counter c3 = (Counter) application.getAttribute("counter");
					if (null == c3) {
						c3 = new Counter();
					}
					%>
					<%= c3.getCounter() %>
				</td>
			</tr>

		</table>

	</div>
</body>
</html>






