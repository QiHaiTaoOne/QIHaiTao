package com.xjyq.service;

import com.xjyq.common.JsonResponse;

public interface IUserservice {

    JsonResponse selectByPrimaryKey(Integer pageSize, Integer currentPage);
}