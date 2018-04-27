package com.xjyq;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages ={"com.xjyq.controller","com.xjyq.service", "com.xjyq.Aspc"})
@MapperScan(basePackages = {"com.xjyq.mapper"})
public class XjyqApplication {

	public static void main(String[] args) {
		SpringApplication.run(XjyqApplication.class, args);
	}
}
