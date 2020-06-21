package com.fred.wimi.wimiproduct.api.request.productcategory;

import lombok.Data;

/**
 * 〈更新分类〉<br>
 *
 * @className: UpdateProductCategory
 * @package: com.fred.wimi.wimiproduct.api.request.productcategory
 * @author: admin
 * @date: 2020/6/12 15:43
 */
@Data
public class UpdateProductCategory extends AddProductCategory {
    /**
     * id
     */
    private long id;
}
