package com.cnepay.mybatis.domain;

import java.io.Serializable;

/**
 * Created by zhj on 2018/5/4.
 */
public class WHResponse<T extends Serializable> implements Serializable {
    private T content;

    private int page;

    private int size;

    private int total;

    private Status status;

    private String msg;

    public enum Status {
        SUCCESS,
        FAIL;
    }

    public T getContent() {
        return content;
    }

    public void setContent(T content) {
        this.content = content;
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
