package com.ssafy.ssafit.service;

import com.ssafy.ssafit.dao.UserDao;
import com.ssafy.ssafit.dto.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    public UserDao userDao;

    @Override
    public List<User> selectAll() {
        return userDao.selectAll();
    }

    @Override
    public void insertUser(User user) {
        userDao.insertUser(user);
    }

    @Override
    public User selectOne(String id) {
        return userDao.selectOne(id);
    }
}
