<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
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
    <div>
        <h2 class="center" id="title">💥운동영상 리뷰💥</h2>
        <hr>
    </div>
    <div class="center2">
    <iframe width="560" height="315" src="https://www.youtube.com/embed/${youtubeid}" title="YouTube video player" frameborder="0" allow="accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture; web-share" allowfullscreen></iframe>
    </div>
    <div>
        <hr>
        <form method="get" action="registform">
			<input type="hidden" name="videoid" value="${videoid}">
        	<button class="btn btn-outline-primary write-btn">글작성</button>			
		</form>
	    <hr>
    </div>
    <table class="table">
        <thead>
            <tr>
                <th scope="col">번호</th>
                <th scope="col">제목</th>
                <th scope="col">쓰니</th>
                <th scope="col">조회수</th>
            </tr>
        </thead>
        <tbody class="review-list">
      	 	<c:forEach items="${reviews}" var="review" varStatus="vs">
      	 	            <tr>
    		    <td>${review.id}</td>

                <td>
                <a>
					<form method="get" action="reviewdetail">
						<input type="submit" value="${review.title}" style="border: none; background: transparent; color:violet">
						<input type="hidden" name="id" value="${review.id}">
						<input type="hidden" name="content" value="${review.content}">
						<input type="hidden" name="title" value="${review.title}">
						<input type="hidden" name="writer" value="${review.writer}">
                        <input type="hidden" name="videoid" value="${videoid}">

                    </form>
				</a>
                
                </td>
                
                <td>${review.writer}</td>
                <td>${review.view_cnt}</td>
                <br>
                            </tr>
	    	</c:forEach>
            <tr>
            </tr>
        </tbody>
    </table>
    <br><br><br>


    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/js/bootstrap.bundle.min.js"
    integrity="sha384-w76AqPfDkMBDXo30jS1Sgez6pr3x5MlQ1ZAGC+nuZB+EYdgRZgiwxhTBTkF7CXvN"
    crossorigin="anonymous"></script>
</body>
</html>