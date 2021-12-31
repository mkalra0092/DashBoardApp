<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body style="background: url(../img/Background.jpg)">
	<img class="img-responsive" width="100%" height="180px"
		src="/img/1.jpg">
	<form:form method="post" modelAttribute="customer">
		<table style="background-color: cyan; margin: auto;">
			<tr>
				<td>Name :</td>
				<td><form:input path="cust_name" /></td>
			</tr>
			<tr>
				<td>City :</td>
				<td><form:input path="branchId.branchName" /></td>
			</tr>
			<tr>
				<td><input type="submit" value="Show AQI" /></td>
			</tr>
		</table>
	</form:form>
</body>
</html>