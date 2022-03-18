<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix='c' uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>


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
	<Style>
		th, td {
			text-align:center;
		}
		
		a {
			color : black;
		}
		
	</Style>
</head>
<body>
 
<div class="container">
  <h2><a href = 'boardList.do'><i class="bi bi-chevron-left"></i></a> Spring MVC Board</h2>
  <div class="panel panel-default">
    <div class="panel-heading">Board Insert Form</div>
    <div class="panel-body">
			<form class="form-horizontal" action="boardInsert.do" method='post'>
				<div class="form-group">
					<label class="control-label col-sm-2" for="title">Title:</label>
					<div class="col-sm-10">
						<input required="required" type="text" class="form-control" id="title" name = "title"
							placeholder="Enter title">
					</div>
				</div>
				<div class="form-group">
					<label class="control-label col-sm-2" for="contents">Contents:</label>
					<div class="col-sm-10">
						<textArea type="text" class="form-control" rows = '5' id="contents" name = 'contents'
							placeholder="Enter contents"></textArea>
					</div>
				</div>
				<div class="form-group">
					<label class="control-label col-sm-2" for="writter">Writter:</label>
					<div class="col-sm-10">
						<input required="required" type="text" class="form-control" id="writter" name = 'writter'
							value = "${member.nick}" readonly>
					</div>
				</div>
				<div class="form-group">
					<div class="col-sm-offset-2 col-sm-10">
						<button type="submit" class="btn btn-default">Submit</button>
						<button type="reset" class="btn btn-default">Reset</button>
					</div>
				</div>
			</form>
		</div>
    <div class="panel-body">Big Data 1차</div>
  	</div>
</div>

</body>
</html>