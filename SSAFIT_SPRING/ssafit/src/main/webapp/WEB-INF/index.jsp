<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<head>
  <meta charset="UTF-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <link href="./img/icon.png" rel="shortcut icon" type="image/x-icon">
  <link rel="stylesheet" href="css/index.css" />
  <title>SSAFIT</title>
  <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/css/bootstrap.min.css" rel="stylesheet"
    integrity="sha384-GLhlTQ8iRABdZLl6O3oVMWSktQOp6b7In1Zl3/Jr59b6EGGoI1aFkw7cmDA6j6gD" crossorigin="anonymous" />
  <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.7.1/font/bootstrap-icons.css" />
  <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/js/bootstrap.bundle.min.js"
    integrity="sha384-w76AqPfDkMBDXo30jS1Sgez6pr3x5MlQ1ZAGC+nuZB+EYdgRZgiwxhTBTkF7CXvN"
    crossorigin="anonymous"></script>
  <script src="js/jquery-3.5.1.min.js" type="text/javascript"></script>
</head>

<body>
  <header>
    <nav class="navbar navbar-white bg-white">
      <div class="container-fluid">
        <a class="navbar-brand" href="#" style="color:blueviolet"><strong>SSAFIT</strong></a>

        <ul class="nav justify-content-end">
          <li class="nav-item">
            <a class="nav-link" href="#" style="color:rgb(27, 137, 201)"><strong>HOME</strong></a>
          </li>
          <li class="nav-item">
            <a class="nav-link text-secondary" href="#"><strong>헬스장찾기</strong></a>
          </li>

          <form method="GET" action="login">
          	    		<button>
          	    		<li class="nav-item">
                        <a class="nav-link" href=""><i class="bi bi-person-plus" style="color:blueviolet"></i></a>
                              </li>
          	    		</button></form>

            <form method="GET" action="logout">
                      	    		<button>
                      	    		<li class="nav-item">
                                                <a class="nav-link" href="main?act=logout"><i class="bi bi-box-arrow-in-right" style="color:blueviolet"></i></a>
                                              </li>
                      	    		</button></form>
        </ul>
      </div>
    </nav>
  </header>
  <div id="carouselExample" class="carousel slide">
    <div class="carousel-inner">
      <div class="carousel-item active" style="width: 100%; height: 20vw; overflow: hidden">
        <img src="./img/main.jpg" class="d-block w-100" alt="..." />
      </div>
      <div class="carousel-item" style="width: 100%; height: 20vw; overflow: hidden">
        <img src="./img/main.jpg" class="d-block w-100" alt="..." />
      </div>
    </div>
    <button class="carousel-control-prev" type="button" data-bs-target="#carouselExample" data-bs-slide="prev">
      <span class="carousel-control-prev-icon" aria-hidden="true"></span>
      <span class="visually-hidden">Previous</span>
    </button>
    <button class="carousel-control-next" type="button" data-bs-target="#carouselExample" data-bs-slide="next">
      <span class="carousel-control-next-icon" aria-hidden="true"></span>
      <span class="visually-hidden">Next</span>
    </button>
  </div>
  <br>

      <br><br>
      <h4 style="color:darkslategray"><strong>운동 부위 선택 </strong></h4>
      
	  <form method="post" action="video">
		  <input type="hidden" name="act" value="init">
		  <input type="submit" name="part" value="전신">
		  <input type="submit" name="part" value="상체">
		  <input type="submit" name="part" value="하체">
		  <input type="submit" name="part" value="복부">
	  </form>

	    <div style="width: 80%; margin: 0 auto;">
          <!-- 8개 -->
          <div class="box">
          	<c:forEach items="${list}" var="video" varStatus="vs">
          	<div class = "child">
            		<iframe width="510" height="360" src="https://img.youtube.com/vi/${video.id }/0.jpg" title="YouTube video player" frameborder="0" allow="accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture; web-share" allowfullscreen></iframe>
      	    	<br>
      	    	${video.title }<br>
      	    	${video.part }<br>
      	    	👁  ${video.channelName }
      			<form method="post" action="detail">
      				<input type="hidden" name="id" value="${video.id}">
      	    		<button>상세보기</button>
      	    	</form>
      	    	<br>
      	    	</div>
      	    </c:forEach>

           </div>

    </div>
    <br>
    <br>
  </body>  
</html>