package com.xjyq.mapper;

import com.xjyq.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface UserMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(User record);

    int insertSelective(User record);

//    @Select("SELECT *FROM iou_user WHERE id = #{id}")
    User selectByPrimaryKey(@Param("id") Integer id);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);

    User getByMobile(String mobile);

    List<User> getList(@Param("startTime") String startTime, @Param("endTime") String endTime, @Param("keyword") String keyword,
                       @Param("channelId") Integer channelId, @Param("state") Integer state);

    List<User> secondAuditList(@Param("adminId") Integer adminId, @Param("role") Byte role, @Param("startTime") String startTime,
                               @Param("endTime") String endTime, @Param("keyword") String keyword, @Param("state") Integer state);

    List<User> selectUserByRepayment(@Param("keyword") String keyword);


    List<User> firstAuditList(@Param("adminId") Integer adminId, @Param("role") Byte role, @Param("startTime") String startTime,
                              @Param("endTime") String endTime, @Param("keyword") String keyword, @Param("state") Integer state,
                              @Param("fromAge") Integer fromAge, @Param("toAge") Integer toAge, @Param("zhimaScore") Integer zhimaScore,
                              @Param("education") Integer education);

    int checkUsername(String userName);

    User selectLogin(@Param("userName") String userName, @Param("password") String password);

    int checkPassword(@Param("passwordOld") String passwordOld, @Param("userId") Integer userId);

    List<User> selectUserPool(@Param("startTime") String startTime, @Param("endTime") String endTime, @Param("keyword") String keyword,
                              @Param("channelId") Integer channelId, @Param("zhimaScore") Integer zhimaScore, @Param("education") Integer education,
                              @Param("fromAge") Integer fromAge, @Param("toAge") Integer toAge, @Param("state") int state);


    int acceptOperation(@Param("userIdList") List<String> userIdList, @Param("state") int state, @Param("adminId") Integer adminId);

    int transferUser(@Param("userIdList") List<String> userIdList, @Param("adminId") Integer adminId);

    int fallbackUser(@Param("userIdList") List<String> userIdList, @Param("adminId") Integer adminId, @Param("state") int state);
}