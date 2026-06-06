package com.waynelee.springbootmall.service.impl;

import com.waynelee.springbootmall.dao.ProductDao;
import com.waynelee.springbootmall.model.Product;
import com.waynelee.springbootmall.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductDao productDao;

    @Override
    public Product getProductById(Integer productId) {
        return productDao.getProductById(productId);
    }
}
