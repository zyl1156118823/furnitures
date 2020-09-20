package com.mook.house.house.Mapper;


import domain.Product;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface ProductDao {

    Integer getMaxId();

    int addProduct(Product product);
}
