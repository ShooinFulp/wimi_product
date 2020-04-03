package com.fred.wimi.wimiproduct.api.response;

import com.fred.wimi.wimiproduct.api.enums.exceptioncode.AppCode;

/**
 * 〈功能概述〉<br>
 *
 * @className: ResponseData
 * @package: com.fred.wimi.wimiproduct.api.response
 * @author: admin
 * @date: 2020/4/3 17:59
 */
public class ResponseData<T> {
    private int code;
    private String msg;
    private T data;

    public ResponseData() {
    }

    public ResponseData(int code, String message) {
        this.code = code;
        this.msg = message;
    }

    public ResponseData(int code, String message, T data) {
        this.code = code;
        this.msg = message;
        this.data = data;
    }

    public ResponseData(AppCode appCode) {
        this.code = appCode.getCode();
        this.msg = appCode.getMessage();
    }

    public ResponseData(AppCode appCode, T data) {
        this.code = appCode.getCode();
        this.msg = appCode.getMessage();
        this.data = data;
    }

    public int getCode() {
        return this.code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return this.msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public T getData() {
        return this.data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
