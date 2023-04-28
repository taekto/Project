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
  <link rel="stylesheet" href="css/login.css" />
  <title>SSAFIT</title>
  <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/css/bootstrap.min.css"
  rel="stylesheet"
  integrity="sha384-GLhlTQ8iRABdZLl6O3oVMWSktQOp6b7In1Zl3/Jr59b6EGGoI1aFkw7cmDA6j6gD"
  crossorigin="anonymous"/>
</head>
<body>
  <div class="card" style="margin-left: 30%;">
    <div class="card-body">
      <br>
      <h3 style="margin-left: 40%;">로그인</h3>
      <br>
      		<form method="post" action="login">
      <div>
        <input type="text" class="enter-input" id="login-id" name="userid" placeholder="✏️아이디">
      </div>
      <div>
        <input type="password" class="enter-input" id="login-pw" name="password" placeholder="🔒비밀번호">
      </div>
      <br>
      <div class="enter-input" class="enter-input">
      
			<input type="hidden" name="act" value="login"> 

			<button class="btn btn-primary" style="width: 200px; margin-left: 10%;">로그인</button>
 		</form>
 
       <button type="button" class="btn btn-secondary" style="width: 200px" 
       	onclick="location.href='enter.jsp'"
       >취소</button>
      </div>
      </div>
      <br>
    </div>
  <script type="text/javascript" src="js/login.js"></script>
  <script>
	// request 영역에 msg라는 이름의 attribute가 있다면 화면에 alert으로 출력한다.
	let msg = "${msg}";
	if (msg) {
		alert(msg)
	}
</script>
</body>
</html>