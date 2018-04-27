package com.xjyq.mapper;

import com.xjyq.pojo.PhoneBook;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface PhoneBookMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(PhoneBook record);

    int insertSelective(PhoneBook record);

    PhoneBook selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(PhoneBook record);

    int updateByPrimaryKey(PhoneBook record);
}