package com.ssafy.ssafit.controller;

import com.ssafy.ssafit.dto.User;
import com.ssafy.ssafit.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import javax.servlet.http.HttpSession;

@Controller
public class UserController {

    @Autowired
    private UserService userService;


    @GetMapping({"index",""})
    public String showIndex() {
        return "index";
    }

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
    public String doLogin(User user , HttpSession session ) {
        User tmp = userService.selectOne(user.getUserid());
        if(tmp == null || !(user.getPassword().equals(tmp.getPassword()))) {
            return "redirect:login";
        }
        session.setAttribute("loginUser", tmp);
        return "redirect:index";
    }







}
