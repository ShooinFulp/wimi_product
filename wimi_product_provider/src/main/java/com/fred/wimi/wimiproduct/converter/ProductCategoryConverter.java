package com.fred.wimi.wimiproduct.converter;

import com.fred.wimi.wimiproduct.api.model.ProductCategory;
import com.fred.wimi.wimiproduct.api.request.productcategory.AddProductCategory;
import org.springframework.beans.BeanUtils;

/**
 * 〈功能概述〉<br>
 *
 * @className: ProductCategoryConverter
 * @package: com.fred.wimi.wimiproduct.converter
 * @author: admin
 * @date: 2020/6/10 16:11
 */
public class ProductCategoryConverter {
    public static ProductCategory AddProductCategory2Model(AddProductCategory addProductCategory) {
        ProductCategory productCategory = new ProductCategory();

        BeanUtils.copyProperties(addProductCategory, productCategory);

        return productCategory;
    }
}
