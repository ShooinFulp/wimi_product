package com.fred.wimi.wimiproduct.service;

import com.fred.wimi.wimiproduct.api.model.ProductDetail;
import com.fred.wimi.wimiproduct.mapper.ProductCategoryMapper;
import com.fred.wimi.wimiproduct.mapper.ProductDetailMapper;
import org.springframework.stereotype.Service;

/**
 * 〈功能概述〉
 *
 * @author: fuliping
 * @date: 2020/4/5 12:28 上午
 */
@Service
public class ProductDetailService extends BaseService<ProductDetail> {
    public ProductDetailService(ProductDetailMapper mapper) {
        super(mapper);
    }
}
