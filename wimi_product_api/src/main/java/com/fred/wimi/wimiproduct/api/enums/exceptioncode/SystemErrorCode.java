package com.fred.wimi.wimiproduct.api.enums.exceptioncode;

/**
 * 〈系统错误枚举〉<br>
 *
 * @className: SystemErrorCode
 * @package: com.fred.wimi.wimiproduct.api.enums
 * @author: admin
 * @date: 2020/4/3 16:46
 */

public enum SystemErrorCode implements AppCode {
    SYSTEM_UNKOWN_EXCEPTION(-1, "压力山大，请稍后再试！");

    private int code;
    private String message;

    SystemErrorCode(int code, String message) {
        this.code = code;
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
