<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix='c' uri="http://java.sun.com/jsp/jstl/core"%>
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
	<Style>
		th, td {
			text-align:center;
		}
		
		a {
			color : black;
		}
		
		#modal.modal-overlay {
			width: 100%;
			height: 100%;
			position: absolute;
			left: 0;
			top: 0;
			display: none;
			flex-direction: column;
			align-items: center;
			justify-content: center;
			background: rgba(0, 0, 0, 0.25);
			box-shadow: 0 8px 32px 0 rgba(31, 38, 135, 0.37);
			backdrop-filter: blur(1.5px);
			-webkit-backdrop-filter: blur(1.5px);
			border-radius: 10px;
			border: 1px solid rgba(255, 255, 255, 0.18);
			z-index: 3;
		}
		
		#modal .modal-window {
			background: rgba(255, 255, 255, 1);
			box-shadow: 0 8px 32px 0 rgba(31, 38, 135, 0.37);
			backdrop-filter: blur(13.5px);
			-webkit-backdrop-filter: blur(13.5px);
			border-radius: 10px;
			border: 1px solid rgba(255, 255, 255, 0.18);
			width: 600px;
			height: 800px;
			position: relative;
			padding: 3px;
			z-index: 3;
		}
		
		#resultMemBerList {
			overflow: auto;
		}
		
	</Style>
</head>
<body>
 
<div class="container">
 	<h2><a href = 'boardList.do'><i class="bi bi-chevron-left"></i></a> Spring MVC Board
 		<div style="float: right;">
			<c:choose>
				<c:when test="${empty member}">
					<a href="login.do"><button class="btn btn-sm" style="margin-right: 0;">LogIn</button></a>
				</c:when>
				<c:otherwise>
					<span style = "font-size:20px;">${member.nick}님</span>
					<c:choose>
						<c:when test = "${member.id eq 'Admin'}">
							<button type = 'button' id = 'memberList' class="btn btn-sm" style="margin-right: 0;">Member Management</button>
						</c:when>
						<c:otherwise>
							<a href="myPage.do"><button class="btn btn-sm" style="margin-right: 0;">MyPage</button></a>
						</c:otherwise>
					</c:choose>
					<a href="logout.do"><button class="btn btn-sm" style="margin-right: 0;">LogOut</button></a>
				</c:otherwise>
			</c:choose>
		</div>
	</h2>
	
	<div id="modal" class="modal-overlay">
		<div class="modal-window">
			<div class="report-container b">
				<!-- header 박스 -->
				<header class="container-head b">
					<div class="item back b">
						<i class="bi bi-chevron-left" style = "font-size:3ch;"></i>
						<span style = "font-size:3ch;">Member Management</span>
					</div>
				</header>
				<div id = "resultMemberList"></div>
			</div>
		</div>
	</div>
	
  	<div class="panel panel-default">
    <div class="panel-heading">Board List</div>
    <div class="panel-body">
    	<table class = "table table-hover table-bordered" style = "width:100%">
			<tr class = "active">
				<th>번호</th>
				<th>글제목</th>
				<th>작성자</th>
				<th>작성일</th>
				<th>조회수</th>
			</tr>
			<c:set var = "no" value = "1"/>
			<c:forEach var = "vo" items = "${list}">
				<tr>
					<td>${no}</td>
					<td><a href = "board.do?idx=${vo.idx}">${vo.title}</a></td>
					<td>${vo.writter}</td>
					<td>${vo.indate}</td>
					<td>${vo.count}</td>
				</tr>
				<c:set var = "no" value = "${no+1}"/>
			</c:forEach>
		</table>
		<c:choose>
			<c:when test = "${empty member}">
			</c:when>
			<c:otherwise>
				<a href = 'boardInsertForm.do'><button class = 'btn'>글 작성</button></a>
			</c:otherwise>
		</c:choose>
    </div>
    <div class="panel-body">Big Data 1차</div>
  </div>
</div>

<script type = "text/javascript">
	
	$('#memberList').on('click',function(){
		console.log('회원 정보 보기')
		$.ajax({
			url : "memberList.do",
			type : "post",
			dataType : "json",
			success : resultJson,
			error : function(e) {
				console.log(e);
			}
		});
	});
	
	function resultJson(data){
		console.log(data);
		var html = "<table class = 'table table-hover table-bordered' style = 'width:100%' border = '1'><tr class = 'active'><th>ID</th><th>Nick</th><th>Tel</th><th>Address</th><th></th></tr>";
		for (var i = 0; i < data.length; i++){
			var html = html + "<tr>";
			var html = html + "<td>"+data[i]['id']+"</td>"
			var html = html + "<td>"+data[i]['nick']+"</td>"
			var html = html + "<td>"+data[i]['tel']+"</td>"
			var html = html + "<td>"+data[i]['address']+"</td>"
			var html = html + "<td><button class = 'btn btn-sm' onclick = 'memberRemove("+'"'+data[i]['id']+'"'+")'><i class = 'bi bi-person-dash-fill' </i></button></td>"
			var html = html + "</tr>";
		}
		var html = html +"</table>";
		$('#resultMemberList').html(html);
	}
	
	// 모달 창 켜기
	const modal = document.getElementById("modal");
	const memberList = document.getElementById("memberList");

	memberList.addEventListener("click", e => {
	    modal.style.display = "flex";
	});


	// 모달 창 끄기 1. x 버튼 누르기  2. 모달 바깥 영역 클릭

	//1. x 버튼 누르기
	const back = modal.querySelector(".back");

	back.addEventListener("click", e => {
	    modal.style.display = "none";
	});

	//2. 모달 바깥 영역 클릭
	modal.addEventListener("click", e => {
	    const evTarget = e.target;
	    if(evTarget.classList.contains("modal-overlay")) {
	        modal.style.display = "none";
	    }
	}); 
	
</script>

</body>
</html>