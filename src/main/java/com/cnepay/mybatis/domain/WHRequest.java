package com.cnepay.mybatis.domain;

import java.io.Serializable;

/**
 * Created by zhj on 2018/5/3.
 */
public class WHRequest<T extends Serializable> implements Serializable{
    private T content;

    private int pageNum=1;

    private int pageSize=6;

    public T getContent() {
        return content;
    }

    public void setContent(T content) {
        this.content = content;
    }

    public int getPageNum() {
        return pageNum;
    }

    public void setPageNum(int pageNum) {
        this.pageNum = pageNum;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }
}
