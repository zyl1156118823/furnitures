package com.mook.house.house.Service.impl;

import com.mook.house.house.Mapper.UserDao;
import com.mook.house.house.Mapper.UserMapper;
import com.mook.house.house.Service.UserService;
import com.mook.house.house.entity.User;
import com.mook.house.house.entity.UserEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class UserServiseImpl implements UserService {
    @Autowired(required = false)
    UserMapper userMapper;
    @Autowired(required = false)
    UserDao userDao;
    @Override
    public List<User> getUser() {
        List<User> userList=userMapper.getAllUser();
        for (User user:userList) {
            System.out.println(user);
        }
        return userList;
    }

    @Override
    public List<User> getHouseUser() {
        return userMapper.getUserhouse();
    }

    @Override
    public List<UserEntity> getUserEntry() {
        return userDao.findAllStu();
    }

    @Override
    public UserEntity findUserByUsernameAndPassword(String username, String password) {
        return userDao.findUserByStuidAndPassword(username,password);
    }
}
