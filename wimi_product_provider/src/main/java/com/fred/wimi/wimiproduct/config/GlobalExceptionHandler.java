package com.fred.wimi.wimiproduct.config;

import com.fred.wimi.wimiproduct.api.exception.WimiException;
import com.fred.wimi.wimiproduct.api.response.BizResult;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

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
    public BizResult wimiExceptionHandler(WimiException wimiException){
        return  BizResult.
    }

}
