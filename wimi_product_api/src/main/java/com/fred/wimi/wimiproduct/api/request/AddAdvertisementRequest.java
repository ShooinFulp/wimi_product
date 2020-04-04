package com.fred.wimi.wimiproduct.api.request;

import lombok.Data;

import javax.persistence.Column;

/**
 * 〈功能概述〉
 *
 * @author: fuliping
 * @date: 2020/4/5 1:44 上午
 */
@Data
public class AddAdvertisementRequest {
    /**
     * 广告名称
     */
    private String name;

    /**
     * 广告位置(1.首部轮播，2.专场广告，3.中间轮播)
     */
    private String position;

    /**
     * 广告排序
     */
    private Integer sort;

    /**
     * 广告链接
     */
    private String url;

    /**
     * 广告图片
     */
    private String photoUrl;
}
