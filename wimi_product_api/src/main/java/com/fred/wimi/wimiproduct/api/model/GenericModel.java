package com.fred.wimi.wimiproduct.api.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.sun.jmx.snmp.Timestamp;

import java.io.Serializable;

public class GenericModel<PK> implements Serializable {
    private static final long serialVersionUID = 1L;
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
    protected Long enabledFlag = 1L;

    public GenericModel() {
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

    public Long getEnabledFlag() {
        return this.enabledFlag;
    }

    public void setEnabledFlag(Long enabledFlag) {
        this.enabledFlag = enabledFlag;
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
        } else if (!(o instanceof GenericModel)) {
            return false;
        } else {
            GenericModel other = (GenericModel)o;
            if (this.getId() != null && other.getId() != null) {
                if (this.getId() instanceof Comparable) {
                    return ((Comparable)this.getId()).compareTo(other.getId()) == 0;
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