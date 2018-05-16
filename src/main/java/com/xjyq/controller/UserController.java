package com.xjyq.controller;

import com.xjyq.Aspc.Login;
import com.xjyq.common.JsonResponse;
import com.xjyq.service.IUserservice;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/user")
public class UserController {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Resource
    private IUserservice iUserservice;


    @Login
    @RequestMapping("/find")
    public JsonResponse fid(){
     return  iUserservice.selectByPrimaryKey(1, 1) ;
    }

}