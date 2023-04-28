package com.ssafy.ssafit.service;

import com.ssafy.ssafit.dto.User;

import java.util.List;

public interface UserService {

    List<User> selectAll();

    void insertUser(User user);

    User selectOne(String id);
}
