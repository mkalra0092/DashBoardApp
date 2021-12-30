<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="/bootstrap/css/bootstrap.min.css">
<script src="/bootstrap/js/bootstrap.min.js"></script>
<script src="/jquery/jquery.min.js"></script>
</head>
<body style="background: url(../img/Background.jpg)">
	<img class="img-responsive" width="100%" height="180px"
		src="/img/1.jpg">
	<h3 align="center">
		<spring:message code="u.mesg" />
	</h3>


	<%-- <h5 align="center" style="color: red;">
		<spring:message code="u.role" />
	</h5> --%>
	<br>
	<br>
	
	<h4>
		<a href='<spring:url value="/customer/add"/>'>Add New Customer
			Details</a>
	</h4>
	<br>
	<br>
	<br>
	<br>
	<br>
	<br>
	<br>
	<br>
	<h5 style="margin-left: 75%">
		<input type="button" value="Contact Us"> <input type="button"
			value="About Us">
	</h5>
	<hr>
</body>
</html>