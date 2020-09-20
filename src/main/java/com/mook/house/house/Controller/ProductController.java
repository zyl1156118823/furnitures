package com.mook.house.house.Controller;

import com.google.gson.Gson;
import com.mook.house.house.Service.ProductService;
import com.mook.house.house.entity.User;
import domain.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;
import java.text.ParseException;
import java.util.Date;

/**
 * LUOPEILONG
 * 2020/9/19
 **/
@RestController
@RequestMapping("product")
public class ProductController {


    @Autowired
    private ProductService productService;

    @PostMapping("/add")
    public int addProduct(@RequestBody String param, HttpSession session) throws ParseException {
        Product product = new Gson().fromJson(param,Product.class);
        int id = productService.getMaxId();
        String userInfo = session.getAttribute("username").toString();
        product.setCreateBy(userInfo);
        product.setCreateTime(new Date());
        product.setId(id);
        return productService.addProduct(product);
    }

}
