<%@ tag language="java" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="app" tagdir="/WEB-INF/tags"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>AstroAura</title>
<link rel="stylesheet" href="css/styles.css" />

<script src="https://code.jquery.com/jquery-3.7.1.min.js"></script>
<script
	src="https://cdn.jsdelivr.net/npm/semantic-ui@2.5.0/dist/semantic.min.js"></script>
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/semantic-ui@2.5.0/dist/semantic.min.css">
<script type="text/javascript" src="js/navigations.js"></script>
<script type="text/javascript" src="js/userForm.js"></script>

</head>
<body>

	<nav>
		<app:navbar></app:navbar>
	</nav>
	<main class="ui left aligned padded grid">
		<div class="fourteen wide column ">
			<jsp:doBody></jsp:doBody>
		</div>
	</main>
</body>