package com.fred.wimi.wimiproduct.model;

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;

@Table(name = "product")
public class Product {
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

    private String title;

    private BigDecimal price;

    @Column(name = "retail_price")
    private BigDecimal retailPrice;

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
     * @return title
     */
    public String getTitle() {
        return title;
    }

    /**
     * @param title
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * @return price
     */
    public BigDecimal getPrice() {
        return price;
    }

    /**
     * @param price
     */
    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    /**
     * @return retail_price
     */
    public BigDecimal getRetailPrice() {
        return retailPrice;
    }

    /**
     * @param retailPrice
     */
    public void setRetailPrice(BigDecimal retailPrice) {
        this.retailPrice = retailPrice;
    }
}