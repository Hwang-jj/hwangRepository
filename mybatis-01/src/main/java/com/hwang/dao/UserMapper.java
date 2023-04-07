package com.hwang.dao;

import com.hwang.pojo.User;

import java.util.List;
import java.util.Map;

public interface UserMapper {
    //查询全部用户
    List<User> getUserList();

    //根据id查询用户
    User getUserById(int id);

    //insert用户
    int addUser(User user);

    //
    int addUser2(Map<String ,Object> map);

    //修改用户
    int updateUser(User user);

    //删除一个用户
    int deleteUser(int id);

    //模糊查询用户
    List<User> getUserLike(String value);

}
