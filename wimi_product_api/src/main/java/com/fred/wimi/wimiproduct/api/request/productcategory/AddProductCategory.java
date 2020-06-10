package com.fred.wimi.wimiproduct.api.request.productcategory;

import lombok.Data;

/**
 * 〈新增分类〉<br>
 *
 * @className: AddProductCategory
 * @package: com.fred.wimi.wimiproduct.api.request.productcategory
 * @author: admin
 * @date: 2020/6/10 16:07
 */
@Data
public class AddProductCategory {
    /**
     * 分类编码
     */
    private String categoryCode;

    /**
     * 分类名
     */
    private String categoryName;

    /**
     * 描述
     */
    private String description;

    /**
     * 父id
     */
    private Long parentid;

    /**
     * 排序
     */
    private Long sort;

    /**
     * 分类等级
     */
    private Integer levels;

    /**
     * 图片地址url
     */
    private String photoUrl;
}
