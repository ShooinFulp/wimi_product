package com.fred.wimi.wimiproduct.controller;

import com.fred.wimi.wimiproduct.service.ProductPhotoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 〈商品照片〉
 *
 * @author: fuliping
 * @date: 2020/4/5 12:38 上午
 */
@RestController
@RequestMapping("product/photo")
public class ProductPhotoController {
    @Autowired
    private ProductPhotoService productPhotoService;
}
