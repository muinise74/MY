<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix='c' uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix='fn' uri = "http://java.sun.com/jsp/jstl/functions" %>
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
	<link rel='stylesheet' href='https://cdn.jsdelivr.net/npm/bootstrap-icons@1.8.0/font/bootstrap-icons.css'>
	<style>
		a {
			color : black;
		}
		
		input {
			border : 0;
			width : 100%;
		}
		
		form {
			width : 500px;
			margin :auto;
			text-align : center;
		}
	</style>
</head>
<body>
<div class="container">
  <h2><a href = 'login.do'><i class="bi bi-chevron-left"></i></a> Spring MVC Board</h2>
  <div class="panel panel-default">
    <div class="panel-heading">Join</div>
    <div class="panel-body">
    	<form action = "joinInsert.do" method = "post">
    		<table class = "table table-hover table-bordered" style = "width:100%">
    			<tr>
    				<th>ID</th>
    				<td id = 'idCheck' style= 'text-align: left;'><input id = 'id' required="required" type = "text" name = "id" placeholder = "Enter ID"></td>
    			</tr>
    			<tr>
    				<th>PW</th>
    				<td><input id = 'pw' class = 'form-control' required="required" type = "password" name = "pw" placeholder = "Enter PW" readonly = 'readonly'></td>
    			</tr>
    			<tr>
    				<th>Nick</th>
    				<td><input id = 'nick' class = 'form-control' required="required" type = "text" name = "nick" placeholder = "Enter Nick" readonly = 'readonly'></td>
    			</tr>
    			<tr>
    				<th>Tel</th>
    				<td><input id = 'tel' class = 'form-control' required="required" type = "tel" name = "tel" placeholder = "Enter Tel" readonly = 'readonly'></td>
    			</tr>
    			<tr>
    				<th>Address</th>
    				<td><input id = 'address' class = 'form-control' required="required" type = "text" name = "address" placeholder = "Enter Address" readonly = 'readonly'></td>
    			</tr>
    		</table>
    		<div>
	    		<button type = 'submit' class = 'btn'>Submit</button>
	    		<button type = 'reset' class = 'btn'>Reset</button>
	    	</div>
    	</form>
    </div>
    <div class="panel-body">Big Data 1차</div>
  </div>
</div>

<script>
	
	$('#id').on('focusout',function(){
		var id = $('#id').val()
		if (id == '') {
			$('#idck').remove();
			$('#idCheck').append('<span id ="idck" style = "color : red; font-size : 10px;">ID를 입력하세요</span>');
			$('#pw').attr("readonly",true);
			$('#nick').attr("readonly",true);
			$('#tel').attr("readonly",true);
			$('#address').attr("readonly",true);
		} else {
			$.ajax({
				url : "idCheck.do",
				type : "post",
				data : {id:id},
				dataType : "json",
				success : function(data){
					if (data > 0) {
						$('#idck').remove();
						$('#idCheck').append('<span id ="idck" style = "color : green; font-size : 10px;">'+id+'은(는) 사용 가능한 ID 입니다.</span>');
						$('#pw').removeAttr("readonly");
						$('#nick').removeAttr("readonly");
						$('#tel').removeAttr("readonly");
						$('#address').removeAttr("readonly");
					} else {
						$('#idck').remove();
						$('#idCheck').append('<span id ="idck" style = "color : red; font-size : 10px;">'+id+'은(는) 중복된 ID 입니다.</span>');
						$('#pw').attr("readonly",true);
						$('#nick').attr("readonly",true);
						$('#tel').attr("readonly",true);
						$('#address').attr("readonly",true);
					}
				},
				error : function(e) {
					console.log(e);
				}
			});
		}
	});
	
	$('.form-control').on('click',function(){
		var text = this.getAttribute("readonly");
		if (text = 'readonly') {
			alert('중복 체크를 먼저 해주세요.');
		}
	});
</script>
</body>
</html>