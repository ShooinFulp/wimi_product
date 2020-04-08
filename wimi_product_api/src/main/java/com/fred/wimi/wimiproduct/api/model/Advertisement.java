package com.fred.wimi.wimiproduct.api.model;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

@Data
@Table(name = "advertisement")
public class Advertisement extends  BaseModel<Long> {

    /**
     * 广告名称
     */
    @Column(name = "name")
    private String name;

    /**
     * 广告位置(1.首部轮播，2.专场广告，3.中间轮播)
     */
    @Column(name = "position")
    private String position;

    /**
     * 广告排序
     */
    private Integer sort;

    /**
     * 广告链接
     */
    @Column(name = "url")
    private String url;

    /**
     * 广告图片
     */
    @Column(name = "photo_url")
    private String photoUrl;
}