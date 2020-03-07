package com.zp.service.goods;

import com.zp.pojo.goods.Brand;

import java.util.List;

/**
 * @author zhoupeng
 */
public interface BrandService {

    /**
     * 查询所有品牌
     *
     * @return list列表
     */
    List<Brand> findAll();
}
