package com.zp.service.impl;


import com.alibaba.dubbo.config.annotation.Service;
import com.zp.dao.BrandMapper;
import com.zp.pojo.goods.Brand;
import com.zp.service.goods.BrandService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * @author zhoupeng
 */
@Service
public class BrandServiceImpl implements BrandService {

    @Autowired
    private BrandMapper brandMapper;

    @Override
    public List<Brand> findAll() {
        return brandMapper.selectAll();
    }
}
