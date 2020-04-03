package com.fred.wimi.wimiproduct.model;

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;

@Table(name = "product_photo")
public class ProductPhoto {
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

    @Column(name = "enabled_flag")
    private Boolean enabledFlag;

    @Column(name = "gc_flag")
    private Boolean gcFlag;

    /**
     * 商品id
     */
    @Column(name = "product_id")
    private Long productId;

    /**
     * 图片地址
     */
    private String url;

    /**
     * 排序
     */
    private BigDecimal sort;

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
     * @return enabled_flag
     */
    public Boolean getEnabledFlag() {
        return enabledFlag;
    }

    /**
     * @param enabledFlag
     */
    public void setEnabledFlag(Boolean enabledFlag) {
        this.enabledFlag = enabledFlag;
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
     * 获取商品id
     *
     * @return product_id - 商品id
     */
    public Long getProductId() {
        return productId;
    }

    /**
     * 设置商品id
     *
     * @param productId 商品id
     */
    public void setProductId(Long productId) {
        this.productId = productId;
    }

    /**
     * 获取图片地址
     *
     * @return url - 图片地址
     */
    public String getUrl() {
        return url;
    }

    /**
     * 设置图片地址
     *
     * @param url 图片地址
     */
    public void setUrl(String url) {
        this.url = url;
    }

    /**
     * 获取排序
     *
     * @return sort - 排序
     */
    public BigDecimal getSort() {
        return sort;
    }

    /**
     * 设置排序
     *
     * @param sort 排序
     */
    public void setSort(BigDecimal sort) {
        this.sort = sort;
    }
}