package com.mook.house.house.Service;

import com.mook.house.house.entity.User;
import com.mook.house.house.entity.UserEntity;

import java.util.List;

public interface UserService {
    public List<User> getUser();
    public List<User> getHouseUser();
    public List<UserEntity> getUserEntry();
    UserEntity findUserByUsernameAndPassword(String username, String password);
}
