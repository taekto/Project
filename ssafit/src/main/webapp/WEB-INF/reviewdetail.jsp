<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>SSAFIT</title>
    <link href="./img/icon.png" rel="shortcut icon" type="image/x-icon">
    <link rel="stylesheet" href="css/review.css" />
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/css/bootstrap.min.css"
        rel="stylesheet"
        integrity="sha384-GLhlTQ8iRABdZLl6O3oVMWSktQOp6b7In1Zl3/Jr59b6EGGoI1aFkw7cmDA6j6gD"
        crossorigin="anonymous"/>
</head>
<body>
    <h2 class="center" id="title">💥운동영상 리뷰💥</h2>
    <hr>



    
      <form method="post" action="return">
		<input type="hidden" name="videoid" value="${videoid}">
    	<button class="btn btn-outline-primary write-btn">목록</button>
   	</form>
    
    <span class="right-btn">
        <form method="get" action="modify">
	       	<input type="hidden" name="id" value="${review.id}">
	    	<input type="hidden" name="videoid" value="${videoid}">
	    	<input type="hidden" name="title" value="${review.title}">
	    	<input type="hidden" name="writer" value="${review.writer}">
	    	<input type="hidden" name="content" value="${review.content}">
	    	<input type="hidden" name="view_cnt" value="${review.view_cnt}">
    		
    		<button class="btn btn-outline-primary" style="margin-bottom: 5px; margin-left: 20px">글수정</button>
        </form>
        
	    <form method="post" action="delete">
	    	<input type="hidden" name="id" value="${review.id}">
            <input type="hidden" name="videoid" value="${videoid}">
	    	<button class="btn btn-outline-danger write-btn">글삭제</button>
	    </form>
    
    
    </span>
    <hr>
    <br>
        <div class="detail">
            <div class="card" style=" height: 270px;">
                <ul style="width: 100%;" class="list-group list-group-flush" style="margin-top: 50px;">
                	<div style="margin-right: 0%;">
	                    <h2 >${review.title}</h2>
	                    <br>
	                    <div>작성자 : <span class="writer">${review.writer}</span></div>
	                    <hr>
	                    <h4>내용</h4>
	                    <div class="content">${ review.content}</div>
                    </div>
                </ul>
            </div>
        </div>

    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/js/bootstrap.bundle.min.js"
    integrity="sha384-w76AqPfDkMBDXo30jS1Sgez6pr3x5MlQ1ZAGC+nuZB+EYdgRZgiwxhTBTkF7CXvN"
    crossorigin="anonymous"></script>
</body>
</html>