package com.fred.wimi.wimiproduct.api.framework.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.util.List;

public class Pagination<T> extends PageSize {
    private List<T> rows;
    private int rowTotal;
    private int pageTotal;
    @JsonIgnore
    private boolean count;
    @JsonIgnore
    private GenericBO criteria;

    public Pagination() {
        this(1, DEFAULT_PAGESIZE, true);
    }

    public Pagination(int page, int pageSize, boolean count) {
        this.rows = null;
        this.rowTotal = 0;
        this.pageTotal = 0;
        this.count = true;
        this.setPage(page);
        this.setPageSize(pageSize);
        this.count = count;
    }

    public static Pagination getInstance(int page, int pageSize) {
        return new Pagination(page, pageSize, true);
    }

    public static Pagination getInstance2Top(int top) {
        return new Pagination(0, top, false);
    }

    public static Pagination getInstance4BO(GenericBO genericBO) {
        Pagination pagination = new Pagination(genericBO.getPage(), genericBO.getPageSize(), true);
        pagination.setCriteria(genericBO);
        return pagination;
    }

    public static Pagination getInstance2Top4BO(GenericBO genericBO) {
        Pagination pagination = new Pagination(0, genericBO.getPageSize(), false);
        pagination.setCriteria(genericBO);
        return pagination;
    }

    public List<T> getRows() {
        return this.rows;
    }

    public void setRows(List<T> rows) {
        this.rows = rows;
    }

    public int getRowTotal() {
        return this.rowTotal;
    }

    public void setRowTotal(int rowTotal) {
        this.rowTotal = rowTotal;
    }

    public int getPageTotal() {
        return this.pageTotal;
    }

    public void setPageTotal(int pageTotal) {
        this.pageTotal = pageTotal;
    }

    public boolean isCount() {
        return this.count;
    }

    public GenericBO getCriteria() {
        return this.criteria;
    }

    public void setCriteria(GenericBO criteria) {
        this.criteria = criteria;
    }
}