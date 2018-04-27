package com.xjyq.controller;

import com.xjyq.Aspc.Login;
import com.xjyq.common.JsonResponse;
import com.xjyq.service.IUserservice;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private IUserservice iUserservice;


    @Login
    @RequestMapping("/find")
    public JsonResponse fid(){
        logger.info("===================打印日志=========");
     return  JsonResponse.createBySuccess(iUserservice.selectByPrimaryKey(100048)) ;
    }

}