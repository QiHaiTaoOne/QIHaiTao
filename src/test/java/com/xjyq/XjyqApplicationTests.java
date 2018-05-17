package com.xjyq;

import com.xjyq.common.JsonResponse;
import com.xjyq.mapper.UserMapper;
import com.xjyq.service.IUserservice;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
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



	@Test
	public void contextLoads() {
        log.info("=============log.info==================");
		log.debug("==========log.debug============");
		log.error("======log.error============");
		log.warn("=======log.warn==========");
	}

}
