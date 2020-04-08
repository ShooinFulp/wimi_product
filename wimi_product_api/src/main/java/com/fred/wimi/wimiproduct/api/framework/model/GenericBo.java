package com.fred.wimi.wimiproduct.api.framework.model;

import lombok.Data;

/**
 * 〈通用业务对象〉
 *
 * @author: fuliping
 * @date: 2020/4/5 6:43 下午
 */
@Data
public class GenericBo<T> {
    private T vo;
    private int page;
    private int pageSize;
    private String sorterField;
    private  String sorterOrder;
}
