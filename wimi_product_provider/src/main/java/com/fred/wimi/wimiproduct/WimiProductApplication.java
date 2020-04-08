package com.fred.wimi.wimiproduct;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

/**
 * 〈功能概述〉<br>
 *
 * @className: WimiProductApplication
 * @package: com.fred.wimi.wimiproduct
 * @author: admin
 * @date: 2020/4/3 14:19
 */
@MapperScan("com.fred.wimi.wimiproduct.mapper")
@SpringBootApplication
public class WimiProductApplication {

    public static void main(String[] args) {
        SpringApplication.run(WimiProductApplication.class,args);
    }
}
