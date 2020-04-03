package com.fred.wimi.wimiproduct.model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "product_detail")
public class ProductDetail {
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

    private Long productid;

    private String detail;

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
     * @return productid
     */
    public Long getProductid() {
        return productid;
    }

    /**
     * @param productid
     */
    public void setProductid(Long productid) {
        this.productid = productid;
    }

    /**
     * @return detail
     */
    public String getDetail() {
        return detail;
    }

    /**
     * @param detail
     */
    public void setDetail(String detail) {
        this.detail = detail;
    }
}