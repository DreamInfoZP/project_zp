package com.zp.product.service;

import com.zp.product.domain.ProductCategory;

import java.util.List;

public interface CategoryService {
    List<ProductCategory> findByCategoryTypeIn(List<Integer> ids);
}
