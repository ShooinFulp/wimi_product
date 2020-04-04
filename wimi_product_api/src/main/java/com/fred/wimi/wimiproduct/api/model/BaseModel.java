package com.fred.wimi.wimiproduct.api.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.sun.jmx.snmp.Timestamp;

import javax.persistence.Id;
import java.io.Serializable;

public class BaseModel<PK> implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    protected PK id;
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

    public void setEnabledFlag(Boolean enabledFlag) {
        this.enabledFlag = enabledFlag;
    }

    public Boolean getGcFlag() {
        return gcFlag;
    }

    public void setGcFlag(Boolean gcFlag) {
        this.gcFlag = gcFlag;
    }

    public BaseModel() {
    }

    public PK getId() {
        return this.id;
    }

    public void setId(PK id) {
        this.id = id;
    }

    public String getCreatedBy() {
        return this.createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public Timestamp getCreationDate() {
        return this.creationDate;
    }

    public void setCreationDate(Timestamp creationDate) {
        this.creationDate = creationDate;
    }

    public String getUpdatedBy() {
        return this.updatedBy;
    }

    public void setUpdatedBy(String updatedBy) {
        this.updatedBy = updatedBy;
    }

    public Timestamp getUpdationDate() {
        return this.updationDate;
    }

    public void setUpdationDate(Timestamp updationDate) {
        this.updationDate = updationDate;
    }

    public String toString() {
        StringBuffer buffer = new StringBuffer();
        buffer.append(this.getClass().getName()).append("@").append(Integer.toHexString(this.hashCode())).append(" [");
        buffer.append("id='").append(this.getId()).append("'");
        buffer.append("]");
        return buffer.toString();
    }

    public boolean equals(Object o) {
        if (o == null) {
            return false;
        } else if (this == o) {
            return true;
        } else if (!(o instanceof BaseModel)) {
            return false;
        } else {
            BaseModel other = (BaseModel) o;
            if (this.getId() != null && other.getId() != null) {
                if (this.getId() instanceof Comparable) {
                    return ((Comparable) this.getId()).compareTo(other.getId()) == 0;
                } else {
                    return false;
                }
            } else {
                return false;
            }
        }
    }

    public int hashCode() {
        int result = 17;
        if (this.getId() instanceof Comparable) {
            result = this.getId().hashCode();
        }

        return result;
    }
}