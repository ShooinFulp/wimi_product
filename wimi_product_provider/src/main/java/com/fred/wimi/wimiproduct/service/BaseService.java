package com.fred.wimi.wimiproduct.service;

import tk.mybatis.mapper.common.Mapper;

import java.util.List;

/**
 * 〈功能概述〉
 *
 * @author: fuliping
 * @date: 2020/4/4 11:55 下午
 */
public abstract class BaseService<T> {

    protected Mapper<T> mapper;

    public BaseService(Mapper mapper) {
        this.mapper = mapper;
    }

    public T selectById(long id) {
        return mapper.selectByPrimaryKey(id);
    }

    public List<T> selectAll() {
        return mapper.selectAll();
    }

    public int insert(T entity) {
        return mapper.insertSelective(entity);
    }

    public int update(T entity) {
        return mapper.updateByPrimaryKey(entity);
    }

    public int delete(long id) {
        return mapper.deleteByPrimaryKey(id);
    }
}
