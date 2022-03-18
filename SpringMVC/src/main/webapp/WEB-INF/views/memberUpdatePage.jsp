<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix='c' uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix='fn' uri="http://java.sun.com/jsp/jstl/functions"%>
<!DOCTYPE html>
<html lang="en">
<head>
<title>Bootstrap Example</title>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
<link rel='stylesheet'
	href='https://cdn.jsdelivr.net/npm/bootstrap-icons@1.8.0/font/bootstrap-icons.css'>
<style>
a {
	color: black;
}

input {
	border : 0;
}
</style>
</head>
<body>
	<div class="container">
		<h2>
			<a href='myPage.do'><i class="bi bi-chevron-left"></i></a> Spring
			MVC Board
			<div style="float: right;">
				<c:choose>
					<c:when test="${empty member}">
						<a href="login.do"><button class="btn btn-sm" style="margin-right: 0;">LogIn</button></a>
					</c:when>
					<c:otherwise>
						<span style = "font-size:20px;">${member.nick}님</span>
						<a href="logout.do"><button class="btn btn-sm" style="margin-right: 0;">LogOut</button></a>
					</c:otherwise>
				</c:choose>
			</div>
		</h2>
		<div class="panel panel-default">
			<div class="panel-heading">Member Info Update</div>
			<div class="panel-body">
				<form action = "memberUpdate.do" method = "post">
					<input type ='text' name = 'id' value ='${member.id}' hidden readonly>
					<input type ='password' name = 'pw' value ='${member.pw}' hidden readonly>
					<table class="table table-hover table-bordered" style="width: 100%">
						<tr>
							<th>Nick</th>
							<td><input type ='text' name = 'nick' value ='${member.nick}'></td>
						</tr>
						<tr>
							<th>Tel</th>
							<td><input type ='text' name = 'tel' value ='${member.tel}'></td>
						</tr>
						<tr>
							<th>Address</th>
							<td><input type ='text' name = 'address' value ='${member.address}'></td>
						</tr>
					</table>
					<div style = "text-align:right;">
						<button type = 'submit' class='btn' style = "font-size : 10px;">Submit</button>
						<button type = 'reset' class='btn' style = "font-size : 10px;">Reset</button>
					</div>
				</form>
			</div>
			<div class="panel-body">Big Data 1차</div>
		</div>
	</div>
</body>
</html>