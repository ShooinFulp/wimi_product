package com.fred.wimi.wimiproduct.api.framework.model;

import com.fred.wimi.wimiproduct.api.enums.exceptioncode.AppCode;

import java.io.Serializable;

/**
 * 〈业务返回实体〉<br>
 *
 * @className: BizResult
 * @package: com.fred.wimi.wimiproduct.api.response
 * @author: admin
 * @date: 2020/4/3 17:59
 */
public class BizResult<T> extends ResponseData<T> implements Serializable {

    /**
     * 成功默认码为0
     */
    public static <T> BizResult<T> success(String message, T data) {
        return new BizResult<T>(0, message, data);
    }

    public static <T> BizResult<T> success(T data) {
        return new BizResult<T>(0, "操作成功", data);
    }

    public static BizResult failure(String message, int code) {
        return new BizResult(code, message);
    }

    public static BizResult failure(AppCode appCode) {
        return new BizResult(appCode);
    }

    public BizResult(int code, String message) {
        super(code, message);
    }

    public BizResult(int code, String message, T data) {
        super(code, message, data);
    }

    public BizResult(AppCode appCode) {
        super(appCode);
    }

}
