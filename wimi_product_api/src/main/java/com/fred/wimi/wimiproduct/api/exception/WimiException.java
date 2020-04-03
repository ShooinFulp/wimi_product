package com.fred.wimi.wimiproduct.api.exception;

import com.fred.wimi.wimiproduct.api.enums.exceptioncode.AppCode;
import com.fred.wimi.wimiproduct.api.enums.exceptioncode.SystemErrorCode;
import lombok.*;
import org.springframework.util.StringUtils;

/**
 * 〈功能概述〉<br>
 *
 * @className: WimiException
 * @package: com.fred.wimi.wimiproduct.api.exception
 * @author: admin
 * @date: 2020/4/3 16:16
 */
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
@Getter
@Setter(AccessLevel.PRIVATE)
public class WimiException extends RuntimeException {

    private AppCode appCode = SystemErrorCode.SYSTEM_UNKOWN_EXCEPTION;

    private WimiException(String message, AppCode appErrorCode) {
        super(message);
        this.appCode = appErrorCode;
    }

    private static WimiException of(String message, AppCode appCode) {
        return new WimiException(message, appCode);
    }

    public static WimiException create(@lombok.NonNull AppCode appCode) {
        return WimiException.of(appCode.getMessage(), appCode);
    }

    public static WimiException create(@lombok.NonNull AppCode appCode, String errorMessage) {
        if (StringUtils.isEmpty(errorMessage)) {
            return WimiException.of(appCode.getMessage(), appCode);
        }
        return WimiException.of(errorMessage, appCode);
    }
}
