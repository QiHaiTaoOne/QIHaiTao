package com.xjyq;

import com.xjyq.common.JsonResponse;
import com.xjyq.mapper.UserMapper;
import com.xjyq.service.IUserservice;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

@RunWith(SpringRunner.class)
@Rollback
@SpringBootTest
public class XjyqApplicationTests {

	private final Logger logger = LoggerFactory.getLogger(this.getClass());

	@Resource
	private IUserservice iUserservice;

	@Resource
	private  UserMapper userMapper;



	@Test
	@Transactional
	public void contextLoads() {
		JsonResponse user = iUserservice.selectByPrimaryKey(100048);
		logger.error("========logeer========"+user.getData());
		System.out.println("=============="+user.getData().toString());

	}

}
