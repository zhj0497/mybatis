package com.cnepay.mybatis;

import org.apache.ibatis.annotations.Mapper;
import org.mybatis.spring.annotation.MapperScan;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * Created by zhj on 2017/8/11.
 */
@SpringBootApplication
@EnableTransactionManagement
@MapperScan("com.cnepay.mybatis.mapper")
public class Application {
    private static final Logger logger = LoggerFactory.getLogger(Application.class);

    public static void main(String[] args) {
        logger.info("=========================");
        logger.info("mybatis：" + System.getProperty("file.encoding"));
        logger.info("=========================");

        SpringApplication.run(Application.class, args);
    }
}
