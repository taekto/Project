package com.ssafy.ssafit.controller;

import com.ssafy.ssafit.domain.User;
import com.ssafy.ssafit.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import javax.servlet.http.HttpSession;
import java.util.Optional;

@Controller
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    @GetMapping("login")
    public String showLogin() {
        return "login";
    }

    @GetMapping("logout")
    public String doLogout(HttpSession session) {
        session.invalidate();
        return "redirect:index";
    }

    @PostMapping("login")
    public String doLogin(HttpSession session, User user) {
        Optional<User> tmp = userService.selectUserById(user.getUserName());



        if(!tmp.isPresent() || !(user.getUserPassword().equals(tmp.get().getUserPassword()))) {
            return "redirect:login";
        }
        session.setAttribute("loginUser", user);
        return "redirect:index";
    }

}
