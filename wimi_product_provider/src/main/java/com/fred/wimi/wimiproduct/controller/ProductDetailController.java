package com.fred.wimi.wimiproduct.controller;

import com.fred.wimi.wimiproduct.service.ProductDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 〈商品详情〉
 *
 * @author: fuliping
 * @date: 2020/4/5 12:34 上午
 */
@RestController
@RequestMapping("product/detail")
public class ProductDetailController {
    @Autowired
    private ProductDetailService productDetailService;
}
