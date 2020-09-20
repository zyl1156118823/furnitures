package com.mook.house.house.Service;

import domain.Product;

public interface ProductService {
    int addProduct(Product product);
    int getMaxId();
}
