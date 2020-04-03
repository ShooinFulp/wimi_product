package com.fred.wimi.wimiproduct.model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "product_category")
public class ProductCategory {
    /**
     * 分类层级
     */
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
    private Boolean enabledFlag;

    /**
     * 分类编码
     */
    @Column(name = "category_code")
    private String categoryCode;

    /**
     * 分类名
     */
    @Column(name = "category_name")
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
    @Column(name = "photo_url")
    private String photoUrl;

    /**
     * 获取分类层级
     *
     * @return id - 分类层级
     */
    public Long getId() {
        return id;
    }

    /**
     * 设置分类层级
     *
     * @param id 分类层级
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
     * 获取分类编码
     *
     * @return category_code - 分类编码
     */
    public String getCategoryCode() {
        return categoryCode;
    }

    /**
     * 设置分类编码
     *
     * @param categoryCode 分类编码
     */
    public void setCategoryCode(String categoryCode) {
        this.categoryCode = categoryCode;
    }

    /**
     * 获取分类名
     *
     * @return category_name - 分类名
     */
    public String getCategoryName() {
        return categoryName;
    }

    /**
     * 设置分类名
     *
     * @param categoryName 分类名
     */
    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    /**
     * 获取描述
     *
     * @return description - 描述
     */
    public String getDescription() {
        return description;
    }

    /**
     * 设置描述
     *
     * @param description 描述
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * 获取父id
     *
     * @return parentid - 父id
     */
    public Long getParentid() {
        return parentid;
    }

    /**
     * 设置父id
     *
     * @param parentid 父id
     */
    public void setParentid(Long parentid) {
        this.parentid = parentid;
    }

    /**
     * 获取排序
     *
     * @return sort - 排序
     */
    public Long getSort() {
        return sort;
    }

    /**
     * 设置排序
     *
     * @param sort 排序
     */
    public void setSort(Long sort) {
        this.sort = sort;
    }

    /**
     * 获取分类等级
     *
     * @return levels - 分类等级
     */
    public Integer getLevels() {
        return levels;
    }

    /**
     * 设置分类等级
     *
     * @param levels 分类等级
     */
    public void setLevels(Integer levels) {
        this.levels = levels;
    }

    /**
     * 获取图片地址url
     *
     * @return photo_url - 图片地址url
     */
    public String getPhotoUrl() {
        return photoUrl;
    }

    /**
     * 设置图片地址url
     *
     * @param photoUrl 图片地址url
     */
    public void setPhotoUrl(String photoUrl) {
        this.photoUrl = photoUrl;
    }
}