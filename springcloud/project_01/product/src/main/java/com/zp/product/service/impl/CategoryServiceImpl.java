package com.zp.product.service.impl;

import com.zp.product.dao.ProductCategoryDao;
import com.zp.product.domain.ProductCategory;
import com.zp.product.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryServiceImpl implements CategoryService {

    @Autowired
    private ProductCategoryDao productCategoryDao;

    @Override
    public List<ProductCategory> findByCategoryTypeIn(List<Integer> ids) {
        return productCategoryDao.findAllById(ids);
    }
}
