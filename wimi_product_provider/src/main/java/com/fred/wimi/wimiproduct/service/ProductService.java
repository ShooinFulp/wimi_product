package com.fred.wimi.wimiproduct.service;

import com.fred.wimi.wimiproduct.api.model.Product;
import com.fred.wimi.wimiproduct.mapper.ProductMapper;
import org.springframework.stereotype.Service;

/**
 * 〈功能概述〉
 *
 * @author: fuliping
 * @date: 2020/4/5 12:29 上午
 */
@Service
public class ProductService extends BaseService<Product> {
    public ProductService(ProductMapper mapper) {
        super(mapper);
    }
}
