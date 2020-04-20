package com.zp.product.dao;

import com.zp.product.ProductApplicationTests;
import com.zp.product.domain.ProductCategory;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ProductCategoryDaoTest extends ProductApplicationTests {
    @Autowired
    private ProductCategoryDao productCategoryDao;

    @Test
    public void findAll() {
        List<ProductCategory> allList = productCategoryDao.findAll();
        Assert.assertTrue(allList.size() == 0);
    }
}