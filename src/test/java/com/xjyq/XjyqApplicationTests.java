package com.xjyq;

import com.xjyq.mapper.UserMapper;
import com.xjyq.service.IUserservice;
import com.xjyq.service.commonService.RabbitMQService;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

@RunWith(SpringRunner.class)
@Slf4j
@SpringBootTest
public class XjyqApplicationTests {


	@Resource
	private IUserservice iUserservice;

	@Resource
	private  UserMapper userMapper;

	@Resource
	private RabbitMQService rabbitMQService;



	@Test
	public void contextLoads() {
        log.info("=============log.info==================");
        for (int i=0;i<20;i++){
			rabbitMQService.send("Hello World"+"=================="+i);

		}
	}

}
