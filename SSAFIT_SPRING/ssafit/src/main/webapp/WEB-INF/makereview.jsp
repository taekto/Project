<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
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
    <h2 class="center" id="title">💥운동영상 리뷰등록💥</h2>
    <hr>
    
	<form method="post" action="registreview">
	
		<input type="hidden" name="youtubeid" value="${youtubeId}">
	    <input class="review-correct"  style="width: 90%;" id="review-regist-title" placeholder=" 제목" name="title">
	    <input type="hidden" name="writer" value="${loginUser.userid}">
	    <input type="hidden" name="viewcount" value="0">
	    <input type="hidden" name="id" value="0">
	    <div style="margin-top: 2%; margin-left: 5.5%;"></div>
	    <div class="input-group" style="width: 90%; margin-left: 5.5%;">
	    <textarea class="form-control" id="review-regist-contents" aria-label="With textarea" placeholder="내용" name="content"></textarea>
	    </div>
	
	    <div class="corrent-btn">
	        <button class="btn btn-outline-primary">등록</button>
	    </div>
	</form>
	    <div class="corrent-btn">
	 	<form method="post" action="cancel">
	 		<input type="hidden" name="reviewVideoId" value="${youtubeId}">
    		<button class="btn btn-outline-danger">취소</button>
    	</form>
	    </div> 

</body>
</html>