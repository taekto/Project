package com.ssafy.ssafit.dao;

import com.ssafy.ssafit.dto.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserDao {
    List<User> selectAll();

    void insertUser(User user);

    User selectOne(String id);
}
