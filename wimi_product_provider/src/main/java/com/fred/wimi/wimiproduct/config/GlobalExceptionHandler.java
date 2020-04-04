package com.fred.wimi.wimiproduct.config;

import com.fred.wimi.wimiproduct.api.exception.WimiException;
import com.fred.wimi.wimiproduct.api.response.BizResult;
import com.fred.wimi.wimiproduct.api.utils.ErrorHandlerUtil;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import javax.servlet.http.HttpServletRequest;
import java.sql.SQLException;

/**
 * 〈功能概述〉<br>
 *
 * @className: GlobalExceptionHandler
 * @package: com.fred.wimi.wimiproduct.config
 * @author: admin
 * @date: 2020/4/3 17:16
 */
@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(WimiException.class)
    public BizResult wimiExceptionHandler(HttpServletRequest request, WimiException wimiException) {
        return ErrorHandlerUtil.handlerBizError(request, wimiException);
    }

    @ExceptionHandler({RuntimeException.class})
    public  BizResult runtimeExceptionHandler(HttpServletRequest request, WimiException wimiException){
        return  ErrorHandlerUtil.handlerRuntimeError(request,wimiException);
    }

}
