package com.zp.product.service;

import com.zp.product.ProductApplicationTests;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.jupiter.api.Assertions.*;

class ProductServiceTest extends ProductApplicationTests {

    @Autowired
    private ProductService productService;

    @Test
    void findUpAll() {
        productService.findUpAll().forEach(System.out::println);
    }
}