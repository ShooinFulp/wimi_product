package com.fred.wimi.wimiproduct.api.utils;

import com.fred.wimi.wimiproduct.api.enums.exceptioncode.BaseDataErrorCode;
import com.fred.wimi.wimiproduct.api.framework.model.Pagination;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.List;

/**
 * 通用查询工具
 *
 * @param <O> 返回结果  (Output)
 * @param <I> 入参     (Input)
 */
public class GenericServiceUtil<O, I> {

    private static final Logger logger = LoggerFactory.getLogger(GenericServiceUtil.class);

    @FunctionalInterface
    public interface Function<O, I> {
        /**
         * 实际调用函数
         *
         * @param searBean 查询条件对象
         * @return 查询出的结果
         */
        List<O> search(I searBean);
    }


    /**
     * 通过Model获取数据
     *
     * @param searchBean Model数据，非null字段都做为条件查询
     * @return List 如果无数据时，返回是长度为0的List对象
     */
    public List<O> selectAll(I searchBean, Function<O, I> c) {
        List<O> result = null;
        try {
            result = c.search(searchBean);
        } catch (Exception e) {
            logger.error(BaseDataErrorCode.SELECT_EXCEPTION.getMessage(), e);
        }

        if (result == null) {
            result = new ArrayList<O>();
        }

        return result;
    }


    /**
     * 用于分页查询，查询条件不限制是Pagination对象
     *
     * @param pagination 分页结果
     * @param searchBean 查询条件牫
     * @param c
     */
    public void search(Pagination<O> pagination, I searchBean, Function<O, I> c) {
//        executePagination(new SearchCallBack<O, I>() {
//            @Override
//            public List<O> execute(I searchBean) {
//                return c.search(searchBean);
//            }
//        }, pagination, searchBean);

        executePagination(pagination, searchBean, c);
    }

    private void executePagination(Pagination<O> pagination, I searchBean, Function<O, I> callback) {
        try {
            if (pagination != null) {
                PageHelper.startPage(pagination.getPage(), pagination.getPageSize(), pagination.isCount());
            }

            List<O> pageResult = callback.search(searchBean);

            if (pagination != null) {
                if (pagination.isCount()) {
                    Page page = (Page) pageResult;

                    pagination.setRowTotal((int) page.getTotal());
                    pagination.setPageTotal(page.getPages());
                }
            }

            List<O> result = new ArrayList<O>();
            if (pageResult != null && pageResult.size() > 0) {
                result.addAll(pageResult);
            }

            pagination.setRows(result);
        } catch (Exception e) {
            logger.error(BaseDataErrorCode.SELECT_PAGINATION_EXCEPTION.getMessage(), e);
        }
    }

}
