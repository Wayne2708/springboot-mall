package com.waynelee.springbootmall.dao;

import com.waynelee.springbootmall.model.Product;

public interface ProductDao {

    Product getProductById(Integer productId);
}
