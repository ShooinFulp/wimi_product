package com.fred.wimi.wimiproduct.api.framework.model;

public class PageSize {
    public static int DEFAULT_PAGESIZE = 10;
    protected int page;
    protected int pageSize;

    public PageSize() {
        this.pageSize = DEFAULT_PAGESIZE;
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
}