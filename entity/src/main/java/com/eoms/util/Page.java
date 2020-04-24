package com.eoms.util;


public class Page implements  java.io.Serializable {  //封装分页的条件
    private Integer page=1;  //页码
    private Integer rows=3;  //页大小

    public void setPage(Integer page) {
        this.page = page;
    }

    public void setRows(Integer rows) {
        this.rows = rows;
    }

    public Integer getPage() {
        return page;
    }

    public Integer getRows() {
        return rows;
    }
}
