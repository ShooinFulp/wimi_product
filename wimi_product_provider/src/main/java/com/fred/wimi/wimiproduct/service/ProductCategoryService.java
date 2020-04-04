package com.fred.wimi.wimiproduct.service;

import com.fred.wimi.wimiproduct.api.model.Product;
import com.fred.wimi.wimiproduct.mapper.ProductCategoryMapper;
import org.springframework.stereotype.Service;

/**
 * 〈功能概述〉
 *
 * @author: fuliping
 * @date: 2020/4/5 12:28 上午
 */
@Service
public class ProductCategoryService extends BaseService<Product> {
    public ProductCategoryService(ProductCategoryMapper mapper) {
        super(mapper);
    }
}
