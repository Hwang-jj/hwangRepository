package com.hwang.dao;

import com.hwang.pojo.User;

import java.util.List;
import java.util.Map;

public interface UserMapper {


    //根据id查询用户
    User getUserById(int id);

    //分页
    List<User> getUserByLimit(Map<String,Object> map);

    //分页by RowBounds
    List<User> getUserByRowBounds();


}
