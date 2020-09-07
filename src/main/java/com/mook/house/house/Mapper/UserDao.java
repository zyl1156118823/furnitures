package com.mook.house.house.Mapper;

import com.mook.house.house.entity.UserEntity;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
public interface UserDao {
    UserEntity findUserByStuidAndPassword(@Param("username") String username, @Param("password")String password);

    void addUser(UserEntity user);

    List<UserEntity> findAllStu();
}