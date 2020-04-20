package com.zp.product.controller;

import com.zp.product.domain.ProductCategory;
import com.zp.product.domain.ProductInfo;
import com.zp.product.service.CategoryService;
import com.zp.product.service.ProductService;
import com.zp.product.utils.ResultVoUtil;
import com.zp.product.vo.ProductInfoVO;
import com.zp.product.vo.ProductVO;
import com.zp.product.vo.ResultVO;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.stream.Collectors;

/**
 * 1.查询所有在架的商品
 * 2.查询雷米type列表
 * 3.查询类目
 * 4.构造数据
 */
@RestController
@RequestMapping("/product")
public class ProductController {

    @Autowired
    private ProductService productService;

    @Autowired
    private CategoryService categoryService;

    @GetMapping("/list")
    public ResultVO<Object> list() {
        List<ProductInfo> productInfoList = productService.findUpAll();
        List<Integer> categoryTypeList = productInfoList.stream()
                .map(ProductInfo::getCategoryType)
                .collect(Collectors.toList());
        List<ProductCategory> categories = categoryService.findByCategoryTypeIn(categoryTypeList);
        List<ProductVO> productVOList = new CopyOnWriteArrayList<>();
        categories.forEach((l) -> {
            ProductVO productVO = new ProductVO();
            BeanUtils.copyProperties(l, productVO);
            List<ProductInfoVO> infos = new CopyOnWriteArrayList<>();
            productInfoList.forEach((m) -> {
                if (m.getCategoryType().equals(l.getCategoryType())) {
                    ProductInfoVO productInfoVO = new ProductInfoVO();
                    BeanUtils.copyProperties(m, productInfoVO);
                    infos.add(productInfoVO);
                }
            });
        });

        return ResultVoUtil.success(productVOList);
    }
}
