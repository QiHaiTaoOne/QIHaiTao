package com.xjyq.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.xjyq.Aspc.Login;
import com.xjyq.common.JsonResponse;
import com.xjyq.mapper.UserMapper;
import com.xjyq.pojo.User;
import com.xjyq.service.IUserservice;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class IUserserviceImpl  implements IUserservice {

    @Resource
    private UserMapper userMapper;

    @Override
    public JsonResponse selectByPrimaryKey(Integer pageSize, Integer currentPage) {
        PageHelper.startPage(currentPage, pageSize);
        List<User> userList = userMapper.getUser();
        PageInfo pageInfo = new PageInfo(userList);
        return JsonResponse.createBySuccess(pageInfo);
    }
}