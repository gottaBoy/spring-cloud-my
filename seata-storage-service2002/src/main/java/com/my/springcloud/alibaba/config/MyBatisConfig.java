package com.my.springcloud.alibaba.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@MapperScan({"com.my.springcloud.alibaba.dao"})
public class MyBatisConfig {
}
