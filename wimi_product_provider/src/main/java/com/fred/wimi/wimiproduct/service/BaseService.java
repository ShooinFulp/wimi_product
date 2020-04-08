package com.fred.wimi.wimiproduct.service;

import com.fred.wimi.wimiproduct.api.enums.exceptioncode.BaseDataErrorCode;
import com.fred.wimi.wimiproduct.api.exception.WimiException;
import com.fred.wimi.wimiproduct.api.framework.model.GenericBo;
import com.fred.wimi.wimiproduct.api.framework.model.Pagination;
import com.fred.wimi.wimiproduct.api.model.BaseModel;
import com.fred.wimi.wimiproduct.api.utils.GenericServiceUtil;
import com.fred.wimi.wimiproduct.api.utils.SnowFlakeUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.util.ObjectUtils;
import tk.mybatis.mapper.common.Mapper;

import java.sql.Timestamp;
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
     * @param <I>     入参BO泛型
     * @param <O>     返回泛型
     * @param <V>     入参VO泛型
     * @return 分页结果
     */
    protected  <I, O, V> Pagination<O> selectByPage(I request, GenericServiceUtil.Function<O, V> function) {
        try {
            GenericBo bo = (GenericBo) request;
            Pagination<O> pagination = Pagination.getInstance4BO(bo);
            new GenericServiceUtil<O, V>().search(pagination, (V) bo.getVo(), function);
            return pagination;
        } catch (Exception e) {
            logger.error(BaseDataErrorCode.SELECT_PAGINATION_EXCEPTION.getMessage(), e);
            throw WimiException.create(BaseDataErrorCode.SELECT_PAGINATION_EXCEPTION);
        }

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
                baseModel.setUpdationDate(new Timestamp(System.currentTimeMillis()));

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
                baseModel.setCreationDate(new Timestamp(System.currentTimeMillis()));
            }
            baseModel.setUpdationDate(new Timestamp(System.currentTimeMillis()));
            if (ObjectUtils.isEmpty(baseModel.getGcFlag())) {
                baseModel.setGcFlag(false);
            }
            if (ObjectUtils.isEmpty(baseModel.getEnabledFlag())) {
                baseModel.setEnabledFlag(true);
            }
        }
    }
}
