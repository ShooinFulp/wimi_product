package com.fred.wimi.wimiproduct.controller;

import com.fred.wimi.wimiproduct.api.framework.model.BizResult;
import com.fred.wimi.wimiproduct.api.request.productcategory.AddProductCategory;
import com.fred.wimi.wimiproduct.api.request.productcategory.UpdateProductCategory;
import com.fred.wimi.wimiproduct.service.ProductCategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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

    @PostMapping
    public BizResult<String> addProductCategory(@RequestBody AddProductCategory addProductCategory) {
        return productCategoryService.addProductCategory(addProductCategory);
    }

    @DeleteMapping
    public BizResult<String> deleteProductCategory(@RequestParam("id") Long id ){
        return  productCategoryService.deleteProductCategory(id);
    }

    @PutMapping
    public BizResult<String> updateProductCategory(@RequestBody UpdateProductCategory updateProductCategory){
        return  productCategoryService.updateProductCategory(updateProductCategory);
    }
}
