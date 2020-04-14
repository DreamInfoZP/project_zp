package com.zp.product.dao;

import com.zp.product.BaseTest;
import com.zp.product.domain.ProductCategory;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class ProductCategoryDaoTest extends BaseTest {
    @Autowired
    private ProductCategoryDao productCategoryDao;

    @Test
    public void findAll() {
        List<ProductCategory> allList = productCategoryDao.findAll();
        Assert.assertTrue(allList.size() == 0);
    }
}