package com.zp.product.dao;

import com.zp.product.domain.ProductInfo;
import org.junit.Assert;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class ProductInfoDaoTest {

    @Autowired
    private ProductInfoDao productInfoDao;

    @Test
    public void findByProductStatus() {
        List<ProductInfo> list = productInfoDao.findByProductStatus(0);
        Assert.assertTrue(list.size() > 0);
    }
}