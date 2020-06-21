package com.fred.wimi.wimiproduct.service;

import com.fred.wimi.wimiproduct.api.constant.WimiConstant;
import com.fred.wimi.wimiproduct.api.enums.exceptioncode.BaseDataErrorCode;
import com.fred.wimi.wimiproduct.api.exception.WimiException;
import com.fred.wimi.wimiproduct.api.framework.model.BizResult;
import com.fred.wimi.wimiproduct.api.model.BaseModel;
import com.fred.wimi.wimiproduct.api.model.Product;
import com.fred.wimi.wimiproduct.api.model.ProductCategory;
import com.fred.wimi.wimiproduct.api.request.productcategory.AddProductCategory;
import com.fred.wimi.wimiproduct.api.request.productcategory.UpdateProductCategory;
import com.fred.wimi.wimiproduct.converter.ProductCategoryConverter;
import com.fred.wimi.wimiproduct.mapper.ProductCategoryMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.util.ObjectUtils;

/**
 * 〈商品分类〉
 *
 * @author: fuliping
 * @date: 2020/4/5 12:28 上午
 */
@Service
public class ProductCategoryService extends BaseService<ProductCategory> {

    protected static final Logger logger = LoggerFactory.getLogger(ProductCategoryService.class);

    public ProductCategoryService(ProductCategoryMapper mapper) {
        super(mapper);
    }

    public BizResult<String> addProductCategory(AddProductCategory addProductCategory) {

        if (ObjectUtils.isEmpty(addProductCategory)) {
            throw WimiException.create(BaseDataErrorCode.Data_ARG_ERROR);
        }

        ProductCategory productCategory = ProductCategoryConverter.AddProductCategory2Model(addProductCategory);

        this.insert(productCategory);

        return BizResult.success(WimiConstant.SUCCESS);
    }

    public BizResult<String> deleteProductCategory(Long id) {
        this.gc(id);
        return BizResult.success(WimiConstant.SUCCESS);
    }

    public BizResult<String> updateProductCategory(UpdateProductCategory updateProductCategory) {

        if (ObjectUtils.isEmpty(updateProductCategory)) {
            throw WimiException.create(BaseDataErrorCode.Data_ARG_ERROR);
        }

        ProductCategory productCategory = ProductCategoryConverter.UpdateProductCategory2Model(updateProductCategory);

        this.update(productCategory);

        return BizResult.success(WimiConstant.SUCCESS);
    }
}
