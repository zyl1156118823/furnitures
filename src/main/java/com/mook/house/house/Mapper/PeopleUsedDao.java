package com.mook.house.house.Mapper;

import domain.PeopleUsed;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface PeopleUsedDao {

    List<PeopleUsed> findAll();
}
