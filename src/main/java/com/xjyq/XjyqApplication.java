package com.xjyq;

import lombok.extern.slf4j.Slf4j;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableTransactionManagement
@ComponentScan(basePackages ={"com.xjyq.controller","com.xjyq.service", "com.xjyq.Aspc", "com.xjyq.task","com.xjyq.config"})
@MapperScan(basePackages = {"com.xjyq.mapper"})
@Slf4j
public class XjyqApplication {

	public static void main(String[] args) {
		SpringApplication.run(XjyqApplication.class, args);
		log.info("=======================项目启动成功！=============================");
		System.out.print("==============================项目启动成功！=========================================");
	}

}
