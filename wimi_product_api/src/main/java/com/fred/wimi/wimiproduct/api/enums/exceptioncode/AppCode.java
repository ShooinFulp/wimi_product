package com.fred.wimi.wimiproduct.api.enums.exceptioncode;

/**
 * 〈所有错误枚举继承该接口〉<br>
 *
 * @className: AppCode
 * @package: com.fred.wimi.wimiproduct.api.enums
 * @author: admin
 * @date: 2020/4/3 16:20
 */
public interface AppCode {
    String toString();

    String getMessage();

    void setMessage(String var1);

    int getCode();

    void setCode(int var1);

    default boolean isSuccess() {
        return this.getCode() == 0;
    }
}
