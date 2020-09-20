package com.mook.house.house.Mapper;

import domain.Category;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface CategoryDao {
    List<Category> findAll();
}
