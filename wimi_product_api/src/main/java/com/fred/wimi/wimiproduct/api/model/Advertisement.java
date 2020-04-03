package com.fred.wimi.wimiproduct.model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "advertisement")
public class Advertisement {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY, generator = "SELECT LAST_INSERT_ID()")
    private Long id;

    @Column(name = "created_by")
    private String createdBy;

    @Column(name = "creation_date")
    private Date creationDate;

    @Column(name = "updated_by")
    private String updatedBy;

    @Column(name = "updation_date")
    private Date updationDate;

    @Column(name = "gc_flag")
    private Boolean gcFlag;

    @Column(name = "enabled_flag")
    private byte[] enabledFlag;

    /**
     * 广告名称
     */
    @Column(name = "advertisement_name")
    private String advertisementName;

    /**
     * 广告位置(1.首部轮播，2.专场广告，3.中间轮播)
     */
    @Column(name = "advertisement_position")
    private String advertisementPosition;

    /**
     * 广告排序
     */
    private Integer sort;

    /**
     * 广告链接
     */
    @Column(name = "advertisement_url")
    private String advertisementUrl;

    /**
     * 广告图片
     */
    @Column(name = "advertisement_photo_url")
    private String advertisementPhotoUrl;

    /**
     * @return id
     */
    public Long getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * @return created_by
     */
    public String getCreatedBy() {
        return createdBy;
    }

    /**
     * @param createdBy
     */
    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    /**
     * @return creation_date
     */
    public Date getCreationDate() {
        return creationDate;
    }

    /**
     * @param creationDate
     */
    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    /**
     * @return updated_by
     */
    public String getUpdatedBy() {
        return updatedBy;
    }

    /**
     * @param updatedBy
     */
    public void setUpdatedBy(String updatedBy) {
        this.updatedBy = updatedBy;
    }

    /**
     * @return updation_date
     */
    public Date getUpdationDate() {
        return updationDate;
    }

    /**
     * @param updationDate
     */
    public void setUpdationDate(Date updationDate) {
        this.updationDate = updationDate;
    }

    /**
     * @return gc_flag
     */
    public Boolean getGcFlag() {
        return gcFlag;
    }

    /**
     * @param gcFlag
     */
    public void setGcFlag(Boolean gcFlag) {
        this.gcFlag = gcFlag;
    }

    /**
     * @return enabled_flag
     */
    public byte[] getEnabledFlag() {
        return enabledFlag;
    }

    /**
     * @param enabledFlag
     */
    public void setEnabledFlag(byte[] enabledFlag) {
        this.enabledFlag = enabledFlag;
    }

    /**
     * 获取广告名称
     *
     * @return advertisement_name - 广告名称
     */
    public String getAdvertisementName() {
        return advertisementName;
    }

    /**
     * 设置广告名称
     *
     * @param advertisementName 广告名称
     */
    public void setAdvertisementName(String advertisementName) {
        this.advertisementName = advertisementName;
    }

    /**
     * 获取广告位置(1.首部轮播，2.专场广告，3.中间轮播)
     *
     * @return advertisement_position - 广告位置(1.首部轮播，2.专场广告，3.中间轮播)
     */
    public String getAdvertisementPosition() {
        return advertisementPosition;
    }

    /**
     * 设置广告位置(1.首部轮播，2.专场广告，3.中间轮播)
     *
     * @param advertisementPosition 广告位置(1.首部轮播，2.专场广告，3.中间轮播)
     */
    public void setAdvertisementPosition(String advertisementPosition) {
        this.advertisementPosition = advertisementPosition;
    }

    /**
     * 获取广告排序
     *
     * @return sort - 广告排序
     */
    public Integer getSort() {
        return sort;
    }

    /**
     * 设置广告排序
     *
     * @param sort 广告排序
     */
    public void setSort(Integer sort) {
        this.sort = sort;
    }

    /**
     * 获取广告链接
     *
     * @return advertisement_url - 广告链接
     */
    public String getAdvertisementUrl() {
        return advertisementUrl;
    }

    /**
     * 设置广告链接
     *
     * @param advertisementUrl 广告链接
     */
    public void setAdvertisementUrl(String advertisementUrl) {
        this.advertisementUrl = advertisementUrl;
    }

    /**
     * 获取广告图片
     *
     * @return advertisement_photo_url - 广告图片
     */
    public String getAdvertisementPhotoUrl() {
        return advertisementPhotoUrl;
    }

    /**
     * 设置广告图片
     *
     * @param advertisementPhotoUrl 广告图片
     */
    public void setAdvertisementPhotoUrl(String advertisementPhotoUrl) {
        this.advertisementPhotoUrl = advertisementPhotoUrl;
    }
}