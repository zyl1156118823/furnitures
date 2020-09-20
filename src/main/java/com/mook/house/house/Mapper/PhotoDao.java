package com.mook.house.house.Mapper;

import domain.Photo;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface PhotoDao {
    Integer getMaxId();
    int addPhoto(Photo photo);
}
