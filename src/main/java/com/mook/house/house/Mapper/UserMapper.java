package com.mook.house.house.Mapper;

import com.mook.house.house.entity.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;


@Mapper
public interface UserMapper {
    public List<User> getAllUser();
    public List<User> getUserhouse();
    public List<User> getUserhouse1();
}
