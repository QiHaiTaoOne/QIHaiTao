package com.xjyq.service.impl;

import com.xjyq.Aspc.Login;
import com.xjyq.common.JsonResponse;
import com.xjyq.mapper.UserMapper;
import com.xjyq.service.IUserservice;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class IUserserviceImpl  implements IUserservice {

    @Resource
    private UserMapper userMapper;

    @Override
    public JsonResponse selectByPrimaryKey(Integer id) {
        return JsonResponse.createBySuccess(userMapper.selectByPrimaryKey(id));
    }
}