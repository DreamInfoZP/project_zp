package com.zp.product.service.impl;

import com.zp.product.dao.ProductInfoDao;
import com.zp.product.domain.ProductInfo;
import com.zp.product.enums.ProductStatusEnum;
import com.zp.product.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductInfoDao productInfoDao;

    @Override
    public List<ProductInfo> findUpAll() {
        return productInfoDao.findByProductStatus(ProductStatusEnum.UP.getCode());
    }
}
