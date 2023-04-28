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
    <h2 class="center" id="title">💥운동영상 리뷰수정💥</h2>
    <hr>
    <form method="POST" action="modify">
    
    	<input class="review-correct" style="width: 90%;" id="correct"  name="title" value="${review.title}">
    
    
	    <div style="margin-top: 2%; margin-left: 5.5%;">수정할 내용</div>
	    
	    <div class="input-group" style="width: 90%; margin-left: 5.5%;">
	        <textarea class="form-control" aria-label="With textarea" id="content" name="content">${review.content}</textarea>
	    </div>
	
	
	    <input type="hidden" name="id" value="${review.id}">
    	<input type="hidden" name="youtubeid" value="${review.youtubeid}">
    	<input type="hidden" name="writer" value="${review.writer}">
    	<input type="hidden" name="viewcount" value="0">
	
	
	    <div class="corrent-btn">
	        <button class="btn btn-outline-primary">수정</button>
	    </div>
    
    </form>

</body>
</html>