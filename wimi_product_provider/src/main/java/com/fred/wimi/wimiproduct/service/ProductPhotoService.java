package com.fred.wimi.wimiproduct.service;

import com.fred.wimi.wimiproduct.api.model.ProductPhoto;
import com.fred.wimi.wimiproduct.mapper.ProductPhotoMapper;
import org.springframework.stereotype.Service;

/**
 * 〈功能概述〉
 *
 * @author: fuliping
 * @date: 2020/4/5 12:29 上午
 */
@Service
public class ProductPhotoService extends BaseService<ProductPhoto> {
    public ProductPhotoService(ProductPhotoMapper mapper) {
        super(mapper);
    }
}
