function login() {
  let id = document.getElementById("login-id").value;
  let pw = document.getElementById("login-pw").value;
  let userList = localStorage.getItem("user")
  userList = JSON.parse(userList)

  for (user of userList) {
    if (id == user["id"] && pw == user["pw"]) {
      alert("로그인 성공!")
      return
    }
  }
  alert("사용자 정보가 올바르지 않습니다.")
}