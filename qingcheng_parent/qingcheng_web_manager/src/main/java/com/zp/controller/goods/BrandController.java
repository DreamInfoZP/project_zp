package com.zp.controller.goods;

import com.alibaba.dubbo.config.annotation.Reference;
import com.zp.pojo.goods.Brand;
import com.zp.service.goods.BrandService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author zhoupeng
 */
@RestController
@RequestMapping("/brand")
public class BrandController {

    /**
     * 注入远程的服务
     */
    @Reference
    private BrandService brandService;

    @RequestMapping("/findAll")
    public List<Brand> findAll() {
        return brandService.findAll();
    }

}
