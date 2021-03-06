package com.centit.support.database.utils;

/**
 * Created by codefan on 17-9-19.
 */
public class PageDesc {

    private int totalRows;
    private int pageSize;
    /**
     * base 1
     */
    private int pageNo;

    public static PageDesc createNotPaging(){
        return new PageDesc(-1,-1,-1);
    }

    public PageDesc() {
        totalRows = 0;
        pageSize = 20;
        pageNo = 1;
    }

    public PageDesc(int pn, int ps) {
        totalRows = 0;
        pageSize = ps;
        pageNo = pn;
    }

    public PageDesc(int pn, int ps, int tr) {
        totalRows = tr;
        pageSize = ps;
        pageNo = pn;
    }

    public int getTotalRows() {
        return totalRows;
    }

    public void setTotalRows(int totalRows) {
        this.totalRows = totalRows;
    }

    public void setTotalRows(Integer totalRows) {
        this.totalRows = totalRows==null ? 0 : totalRows;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public void setRows(int pageSize) {
        this.pageSize = pageSize;
    }

    public int getPageNo() {
        return pageNo;
    }

    public void setPageNo(int pageNo) {
        this.pageNo = pageNo;
    }

    public void setPage(int pageNo) {
        this.pageNo = pageNo;
    }

    public int getRowStart() {
        return ( pageNo > 1 ? pageNo - 1 : 0 ) * pageSize;
    }

}
