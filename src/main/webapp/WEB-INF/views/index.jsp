<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
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
	<h3>GITHUB REPO : https://github.com/mkalra0092/DashBoardApp.git</h3>
	<h2 align="center">
		<spring:message code="u.mesg" />
	</h2>
	<h5 style="color: green;">${requestScope.status}</h5>
	<form method="post">
		<table style="background-color: cyan; margin: auto;">

			<tr>
				<td>Enter User Name :</td>
				<td><input type="text" name="name"></td>
			</tr>
			<tr>
				<td>Enter Phone :</td>
				<td><input type="text" name="phone"></td>
			</tr>
			<tr>
				<td>Enter User City :</td>
				<td><input type="text" name="city"></td>
			</tr>
			<tr>
				<td>Enter Date :</td>
				<td><input type="date" name="dt"></td>
			</tr>
			<tr>
				<td><input type="submit" value="submit"></td>
		</table>
	</form>
	
	<br>
	<h4>
		<a href='<spring:url value="/customer/add"/>'>Add New Customer
			Details</a>
	</h4>
	<br>
	<hr>
	<br>
	<h2>AQI :</h2>
	<table style="background-color: orange; margin: auto;">
		<caption>Showing data from date :
			${sessionScope.aqi_dtls.dateTime}</caption>
		<tr>
			<th>CO2</th>
			<th>Temperature</th>
			<th>Humidity</th>
			<th>PM2.5</th>
			<th>PM10</th>
			<th>TVOC</th>

		</tr>
		<c:forEach var="a" items="${sessionScope.list_all}">
		<tr >
			<td>${a.pMaster.co2}</td>
			<td>${a.pMaster.temp}</td>
			<td>${a.pMaster.humidity}</td>
			<td>${a.pMaster.pm2}</td>
			<td>${a.pMaster.pm10}</td>
			<td>${a.pMaster.tvoc}</td>
		</tr>
		</c:forEach>
	</table>

	<h4>
		<a href='<spring:url value="/threshold/update"/>'>Update Lower and
			Upper Threshold Units</a>
	</h4>
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