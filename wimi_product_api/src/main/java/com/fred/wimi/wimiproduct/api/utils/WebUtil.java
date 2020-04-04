package com.fred.wimi.wimiproduct.api.utils;

import org.springframework.util.StringUtils;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.ServletRequest;
import javax.servlet.http.HttpServletRequest;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.util.*;

public class WebUtil {

    /**
     * 尝试获取当前请求的HttpServletRequest实例
     *
     * @return HttpServletRequest
     */
    public static HttpServletRequest getHttpServletRequest() {
        try {
            return ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getRequest();
        } catch (Exception e) {
            return null;
        }
    }


    public static Map<String, String> getParameters(HttpServletRequest request) {
        Map<String, String> resultMap = new HashMap<>();
        Map<?, ?> requestMap = request.getParameterMap();
        for (Object key : requestMap.keySet()) {
            resultMap.put(String.valueOf(key), request.getParameter(String.valueOf(key)) == null ? "" : request
                    .getParameter(String.valueOf(key)).trim());
        }
        return resultMap;
    }

    public static String getParameterString(Map<String, String> parameterMap) {
        if (parameterMap == null) {
            return "";
        }
        StringBuilder stringBuilder = new StringBuilder();
        Iterator inter = parameterMap.entrySet().iterator();
        while (inter.hasNext()) {
            Map.Entry entry = (Map.Entry) inter.next();
            Object key = entry.getKey();
            Object val = entry.getValue();
            stringBuilder.append(key.toString()).append(":").append(val.toString()).append("\n");
        }
        return stringBuilder.toString();
    }


    public static String getBodyString(ServletRequest request) {
        StringBuilder sb = new StringBuilder();
        InputStream inputStream = null;
        BufferedReader reader = null;

        try {
            inputStream = request.getInputStream();
            reader = new BufferedReader(new InputStreamReader(inputStream, Charset.forName("UTF-8")));
            String line = "";

            while ((line = reader.readLine()) != null) {
                sb.append(line);
            }
        } catch (IOException var17) {
            var17.printStackTrace();
        } finally {
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException var16) {
                    var16.printStackTrace();
                }
            }

            if (reader != null) {
                try {
                    reader.close();
                } catch (IOException var15) {
                    var15.printStackTrace();
                }
            }

        }

        return sb.toString();
    }

    public static Map<String, String> getHeaders(HttpServletRequest request) {
        Map<String, String> map = new LinkedHashMap<>();
        Enumeration<String> enumeration = request.getHeaderNames();
        while (enumeration.hasMoreElements()) {
            String key = enumeration.nextElement();
            String value = request.getHeader(key);
            map.put(key, value);
        }
        return map;
    }

    static final String[] ipHeaders = {
            "X-Forwarded-For",
            "X-Real-IP",
            "Proxy-Client-IP",
            "WL-Proxy-Client-IP"
    };

    /**
     * 获取请求客户端的真实ip地址
     *
     * @param request 请求对象
     * @return ip地址
     */
    public static String getIpAddr(HttpServletRequest request) {
        for (String ipHeader : ipHeaders) {
            String ip = request.getHeader(ipHeader);
            if (!StringUtils.isEmpty(ip) && !ip.contains("unknown")) {
                return ip;
            }
        }
        return request.getRemoteAddr();
    }

    /**
     * web应用绝对路径
     *
     * @param request 请求对象
     * @return 绝对路径
     */
    public static String getBasePath(HttpServletRequest request) {
        String path = request.getContextPath();
        String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + request.getRequestURI();
        return basePath;
    }

}