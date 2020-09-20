package com.mook.house.house.Service.impl;


import com.mook.house.house.Mapper.ProductDao;
import com.mook.house.house.Service.ProductService;
import domain.Product;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * LUOPEILONG
 * 2020/9/19
 **/
@Service
public class ProductServiceImpl implements ProductService {

    @Resource
    private ProductDao productDao;

    @Override
    public int addProduct(Product product) {
        return productDao.addProduct(product);
    }

    @Override
    public int getMaxId() {
        Integer id = productDao.getMaxId();
        if(id == null){
            return 1;
        }else{
            return id+1;
        }
    }
}
