package com.fred.wimi.wimiproduct.api.framework.model;

public class GenericBO<T> {
    private T vo;
    private String id;
    private String[] ids;
    private int page = 1;
    private int pageSize = 10;
    private String sorterField;
    private String sorterOrder;

    public GenericBO() {
    }

    public T getVo() {
        return this.vo;
    }

    public void setVo(T vo) {
        this.vo = vo;
    }

    public int getPage() {
        return this.page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public int getPageSize() {
        return this.pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String[] getIds() {
        return this.ids;
    }

    public void setIds(String[] ids) {
        this.ids = ids;
    }

    public String getSorterField() {
        return this.sorterField;
    }

    public void setSorterField(String sorterField) {
        this.sorterField = sorterField;
    }

    public String getSorterOrder() {
        return this.sorterOrder;
    }

    public void setSorterOrder(String sorterOrder) {
        this.sorterOrder = sorterOrder;
    }
}