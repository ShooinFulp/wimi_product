package com.fred.wimi.wimiproduct.api.enums.exceptioncode;

/**
 * 〈参数错误枚举〉<br>
 *
 * @className: BaseDataErrorCode
 * @package: com.fred.wimi.wimiproduct.api.enums
 * @author: admin
 * @date: 2020/4/3 16:19
 */
public enum BaseDataErrorCode implements AppCode {
    Data_ARG_ERROR(10001, "参数错误,%s"),
    INSERT_EXCEPTION(10002,"新增失败！"),
    UPDATE_EXCEPTION(10003,"更新失败！"),
    DELETE_EXCEPTION(10004,"删除失败！"),
    GC_EXCEPTION(10005,"GC失败！"),
    SELECT_EXCEPTION(10006,"查询失败"),
    SELECT_PAGINATION_EXCEPTION(10007, "分页查询失败！");

    private int code;
    private String message;
    private String format;

    BaseDataErrorCode(int code, String message) {
        this.code = code;
        this.message = message;
        this.format = message;
    }

    public BaseDataErrorCode format(Object... args) {
        this.message = String.format(this.format, args);
        return this;
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

    @Override
    public String toString() {
        return Integer.toString(this.code);
    }
}
