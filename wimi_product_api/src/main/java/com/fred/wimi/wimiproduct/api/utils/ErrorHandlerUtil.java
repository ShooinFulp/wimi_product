package com.fred.wimi.wimiproduct.api.utils;

import com.fred.wimi.wimiproduct.api.exception.WimiException;
import com.fred.wimi.wimiproduct.api.response.BizResult;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.http.HttpServletRequest;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 〈错误处理工具类   处理的同时打日志〉
 *
 * @author: fuliping
 * @date: 2020/4/3 9:27 下午
 */
public class ErrorHandlerUtil {

    private static Logger logger = LoggerFactory.getLogger(ErrorHandlerUtil.class);

    public static BizResult handlerBizError(HttpServletRequest request, WimiException wimiException) {
        printLog(wimiException,request);
        return BizResult.failure(wimiException.getMessage(), wimiException.getAppCode().getCode());
    }

    public static BizResult handlerRuntimeError(HttpServletRequest request, WimiException wimiException) {
        printLog(wimiException,request);
        return BizResult.failure(wimiException.getMessage(), wimiException.getAppCode().getCode());
    }
    public static void printLog(Exception exception,HttpServletRequest request){
        String requestUrl = WebUtil.getBasePath(request);
        Date now = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        String currentTime = dateFormat.format(now);
        //处理get方式请求参数
        String paramMapString = WebUtil.getParameterString(WebUtil.getParameters(request));
        String ip = WebUtil.getIpAddr(request);

        //获取请求body数据
        String bodyStr = WebUtil.getBodyString(request);

        if(!"GET".equals(request.getMethod())){
            paramMapString = bodyStr;
        }

        StringWriter sw = new StringWriter();
        PrintWriter pw = new PrintWriter(sw);

        try {
            exception.printStackTrace(pw);
            String errorStackTrace = sw.toString();
            logger.error("====>requestTime:{},requestURL:{},requestMsg:{},IP:{},errorInfo:{},errorStack:{}",
                    new Object[]{currentTime, requestUrl, paramMapString,ip, exception.getMessage(), errorStackTrace});
            sw.close();
        } catch (Exception e) {
            logger.error("====>requestTime:{},requestURL:{},requestParamMap:{},errorInfo:{}",
                    new Object[]{currentTime, requestUrl, paramMapString, exception.getMessage()});
        } finally {
            pw.close();
        }
    }

}