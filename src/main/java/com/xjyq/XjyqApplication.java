package com.xjyq;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableTransactionManagement
@ComponentScan(basePackages ={"com.xjyq.controller","com.xjyq.service", "com.xjyq.Aspc", "com.xjyq.task","com.xjyq.config"})
@MapperScan(basePackages = {"com.xjyq.mapper"})
public class XjyqApplication {

	public static void main(String[] args) {
		SpringApplication.run(XjyqApplication.class, args);
		System.out.print("==============================项目启动成功！=========================================");
	}

}
