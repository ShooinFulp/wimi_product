package com.fred.wimi.wimiproduct.service;

import com.fred.wimi.wimiproduct.api.enums.exceptioncode.BaseDataErrorCode;
import com.fred.wimi.wimiproduct.api.exception.WimiException;
import com.fred.wimi.wimiproduct.api.framework.model.GenericBO;
import com.fred.wimi.wimiproduct.api.framework.model.Pagination;
import com.fred.wimi.wimiproduct.api.model.BaseModel;
import com.fred.wimi.wimiproduct.api.utils.GenericServiceUtil;
import com.fred.wimi.wimiproduct.api.utils.SnowFlakeUtil;
import com.sun.jmx.snmp.Timestamp;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.util.ObjectUtils;
import tk.mybatis.mapper.common.Mapper;

import javax.xml.crypto.Data;
import java.util.Date;
import java.util.List;

/**
 * 〈功能概述〉
 *
 * @author: fuliping
 * @date: 2020/4/4 11:55 下午
 */
public abstract class BaseService<T> {

    protected static final Logger logger = LoggerFactory.getLogger(BaseModel.class);

    protected Mapper<T> mapper;

    public BaseService(Mapper mapper) {
        this.mapper = mapper;
    }

    public T selectById(long id) {
        try {
            return mapper.selectByPrimaryKey(id);
        } catch (Exception e) {
            logger.error(BaseDataErrorCode.SELECT_EXCEPTION.getMessage(), e);
            return null;
        }

    }

    public List<T> selectAll() {
        try {
            return mapper.selectAll();
        } catch (Exception e) {
            logger.error(BaseDataErrorCode.SELECT_EXCEPTION.getMessage(), e);
            return null;
        }
    }

    /**
     * 分页查询
     *
     * @param request request参数
     * @param <I>     入参泛型
     * @param <O>     返回泛型
     * @return 分页结果
     */
    public <I, O> Pagination<O> selectByPage(I request) {
        GenericBO bo = (GenericBO) request;
        Pagination<O> pagination = Pagination.getInstance4BO(bo);
        new GenericServiceUtil<O, I>().search(pagination, request, mapper.select );
    }

    public int insert(T entity) {
        try {
            this.setDefalut(entity, true);
            return mapper.insertSelective(entity);
        } catch (Exception e) {
            logger.error(BaseDataErrorCode.INSERT_EXCEPTION.getMessage(), e);
            throw WimiException.create(BaseDataErrorCode.INSERT_EXCEPTION);
        }
    }

    public int update(T entity) {
        try {
            this.setDefalut(entity, false);
            return mapper.updateByPrimaryKey(entity);
        } catch (Exception e) {
            logger.error(BaseDataErrorCode.UPDATE_EXCEPTION.getMessage(), e);
            throw WimiException.create(BaseDataErrorCode.UPDATE_EXCEPTION);
        }
    }

    public int delete(long id) {
        try {
            return mapper.deleteByPrimaryKey(id);
        } catch (Exception e) {
            logger.error(BaseDataErrorCode.DELETE_EXCEPTION.getMessage(), e);
            throw WimiException.create(BaseDataErrorCode.DELETE_EXCEPTION);
        }

    }

    public int gc(long id) {
        try {
            int result = 0;

            T entity = mapper.selectByPrimaryKey(id);
            if (!ObjectUtils.isEmpty(entity)) {
                BaseModel baseModel = (BaseModel) entity;

                System.out.println(entity == baseModel);

                baseModel.setGcFlag(true);
                baseModel.setUpdationDate(new Timestamp(new Date().getTime()));

                result = this.mapper.updateByPrimaryKeySelective(entity);
            }
            return result;
        } catch (Exception e) {
            logger.error(BaseDataErrorCode.GC_EXCEPTION.getMessage(), e);
            throw WimiException.create(BaseDataErrorCode.GC_EXCEPTION);
        }

    }

    private void setDefalut(T entity, boolean isNew) {
        if (entity instanceof BaseModel) {
            BaseModel baseModel = (BaseModel) entity;
            if (isNew) {
                baseModel.setId(SnowFlakeUtil.nextId());
                baseModel.setCreationDate(new Timestamp(new Date().getTime()));
            }
            baseModel.setUpdationDate(new Timestamp(new Date().getTime()));
            if (ObjectUtils.isEmpty(baseModel.getGcFlag())) {
                baseModel.setGcFlag(false);
            }
            if (ObjectUtils.isEmpty(baseModel.getEnabledFlag())) {
                baseModel.setEnabledFlag(true);
            }
        }
    }
}
