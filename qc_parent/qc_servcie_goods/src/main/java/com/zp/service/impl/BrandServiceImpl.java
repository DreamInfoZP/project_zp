package com.zp.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.zp.dao.BrandMapper;
import com.zp.entity.PageResult;
import com.zp.finals.TableConst;
import com.zp.pojo.goods.Brand;
import com.zp.service.goods.BrandService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import tk.mybatis.mapper.entity.Example;

import java.util.List;
import java.util.Map;

/**
 * @author zhoupeng
 */
@Service
public class BrandServiceImpl implements BrandService, TableConst {

    @Autowired
    private BrandMapper brandMapper;

    @Override
    public List<Brand> findAll() {
        return brandMapper.selectAll();
    }

    @Override
    public PageResult<Brand> findPage(int page, int size) {
        PageHelper.startPage(page, size);
        Page<Brand> pageResult = (Page<Brand>) brandMapper.selectAll();
        return new PageResult<>(pageResult.getTotal(), pageResult.getResult());
    }

    @Override
    public List<Brand> findList(Map<String, Object> searchMap) {
        return brandMapper.selectByExample(getExample(searchMap));
    }

    @Override
    public PageResult<Brand> findPage(Map<String, Object> searchMap, int page, int size) {
        PageHelper.startPage(page, size);
        Page<Brand> pageResult = (Page<Brand>) brandMapper.selectByExample(getExample(searchMap));
        return new PageResult<>(pageResult.getTotal(), pageResult.getResult());
    }

    @Override
    public Brand findById(Integer id) {
        return brandMapper.selectByPrimaryKey(id);
    }

    @Override
    public void add(Brand brand) {
        brandMapper.insert(brand);
    }

    @Override
    public void update(Brand brand) {
        // updateByPrimaryKeySelectives 属性为null的时候忽略
        // updateByPrimaryKey   属性为null的时候将null保存到数据库
        brandMapper.updateByPrimaryKeySelective(brand);
    }

    @Override
    public void delete(Integer id) {
        brandMapper.deleteByPrimaryKey(id);
    }

    private Example getExample(Map<String, Object> searchMap) {
        Example example = new Example(Brand.class);
        Example.Criteria criteria = example.createCriteria();
        if (searchMap != null) {
            if (StringUtils.isNotEmpty((CharSequence) searchMap.get(NAME))) {
                criteria.andLike(NAME, "%" + searchMap.get(NAME) + "%");
            }
            if (StringUtils.isNotEmpty((CharSequence) searchMap.get(LETTER))) {
                criteria.andEqualTo(searchMap.get(LETTER));
            }
        }
        return example;
    }


}
