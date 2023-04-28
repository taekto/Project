package com.ssafy.ssafit.dto;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter @Setter @ToString
public class User {
    Integer id;
    String userid;
    String password;



    public User(Integer id, String userid, String password) {
        this.id = id;
        this.userid = userid;
        this.password = password;
    }
}
