package com.fred.wimi.wimiproduct.api.enums.exceptioncode;

/**
 * 〈业务错误枚举〉<br>
 *
 * @className: BusinessErrorCode
 * @package: com.fred.wimi.wimiproduct.api.enums
 * @author: admin
 * @date: 2020/4/3 16:44
 */

public enum BusinessErrorCode implements AppCode {
    ;

    private int code;
    private String message;

    BusinessErrorCode(int code, String message) {
        this.message = message;
    }

    @Override
    public String getMessage() {
        return this.message;
    }

    @Override
    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public int getCode() {
        return this.code;
    }

    @Override
    public void setCode(int code) {
        this.code = code;
    }
}
