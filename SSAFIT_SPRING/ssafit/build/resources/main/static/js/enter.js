function enter() {
  let id = document.getElementById("enter-id").value;
  let name = document.getElementById("enter-name").value;
  let email = document.getElementById("enter-email").value;
  let pw = document.getElementById("enter-pw").value;
  let pwc = document.getElementById("enter-pwc").value;

  // 입력값 검증
  if (id === null || name === null || email === null || pw === null || pwc === null) {
    alert("빈칸이 없도록 입력해주세요.");
    return;
  }
  if (pw !== pwc) {
    alert("비밀번호확인이 올바르지 않습니다.")
    return;
  }
}