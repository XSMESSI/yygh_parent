package com.atguigu.yygh.hosp.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * @Author: Leo messi
 * @Date: 2022/05/28/11:17
 * @Description:
 */
@Configuration
@MapperScan("com.atguigu.yygh.hosp.mapper")
public class HospConfig {
}
