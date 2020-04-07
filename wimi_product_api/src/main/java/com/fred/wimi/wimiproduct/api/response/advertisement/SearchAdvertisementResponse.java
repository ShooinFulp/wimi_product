package com.fred.wimi.wimiproduct.api.response.advertisement;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.sun.jmx.snmp.Timestamp;
import lombok.Data;

/**
 * 〈功能概述〉
 *
 * @author: fuliping
 * @date: 2020/4/7 11:14 下午
 */
@Data
public class SearchAdvertisementResponse {
    protected Long id;
    protected String createdBy;
    @JsonFormat(
            pattern = "yyyy-MM-dd HH:mm:ss",
            timezone = "GMT+8"
    )
    protected Timestamp creationDate;
    protected String updatedBy;
    @JsonFormat(
            pattern = "yyyy-MM-dd HH:mm:ss",
            timezone = "GMT+8"
    )
    protected Timestamp updationDate;
    protected Boolean enabledFlag = true;
    protected Boolean gcFlag = false;

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
