package com.hwang.dao;

import com.hwang.pojo.User;
import org.apache.ibatis.annotations.Param;

public interface UserMapper {
    //根据id查询数据
    User queryUserById(@Param("id") int id);

    int updateUser(User user);
}
