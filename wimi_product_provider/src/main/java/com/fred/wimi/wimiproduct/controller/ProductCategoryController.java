package com.fred.wimi.wimiproduct.controller;

import com.fred.wimi.wimiproduct.service.ProductCategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 〈商品分类〉
 *
 * @author: fuliping
 * @date: 2020/4/5 12:33 上午
 */
@RestController
@RequestMapping("product/category")
public class ProductCategoryController {
    @Autowired
    private ProductCategoryService productCategoryService;
}
