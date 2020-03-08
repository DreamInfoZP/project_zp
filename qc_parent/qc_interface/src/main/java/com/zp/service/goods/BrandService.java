package com.zp.service.goods;

import com.zp.entity.PageResult;
import com.zp.pojo.goods.Brand;

import java.util.List;
import java.util.Map;

public interface BrandService {

    /**
     * 查询所有的品牌
     *
     * @return list
     */
    List<Brand> findAll();

    /**
     * 分页查询
     *
     * @param page 页码
     * @param size 每夜数量
     * @return PageResult
     */
    PageResult<Brand> findPage(int page, int size);

    /**
     * 条件查询
     *
     * @param searchMap 查询条件
     * @return list
     */
    List<Brand> findList(Map<String, Object> searchMap);

    /**
     * 条件加分页查询
     *
     * @param searchMap 条件
     * @param page      页数
     * @param size      大小
     * @return pageResult
     */
    PageResult<Brand> findPage(Map<String, Object> searchMap, int page, int size);

    /**
     * 根据主键查询
     *
     * @param id 主键
     * @return brand
     */
    Brand findById(Integer id);

    /**
     * 添加品牌
     *
     * @param brand 添加对象
     */
    void add(Brand brand);

    /**
     * 更新品牌信息
     *
     * @param brand 更新内容
     */
    void update(Brand brand);

    /**
     * 删除品牌信息
     *
     * @param id 主键
     */
    void delete(Integer id);
}
