package com.cnepay.mybatis.service;

import com.github.pagehelper.PageInfo;

import java.io.Serializable;

public interface ICURDService<T extends Serializable> {
    public boolean save(T objectParam);
    public boolean update(T objectParam);
    public boolean delete(Long id);
    public PageInfo<T> findAllByObject(T objectParam, int pageNum, int pageSize);
    public Serializable findOne(Long id);
}
