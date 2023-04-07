package com.hwang.dao;

import com.hwang.pojo.User;
import org.apache.ibatis.annotations.*;

import java.util.List;
import java.util.Map;

public interface UserMapper {

    @Select("select * from user")
    List<User> getAllUsers();

    //根据id查询用户(方法存在多个参数，所有的参数的前面必须加上@Param注解)
    @Select("select * from user where id = #{id}")
    User getUserById(@Param("id") int id);

    @Insert("insert into user(id,name,pwd)values(#{id},#{name},#{password})")
    int addUser(User user);

    @Update("update user set name=#{name},pwd=#{password} where id=#{id}")
    int updateUser(User user);

    @Delete("delete from user where id=#{id}")
    int deleteUser(int id);

    @Select("select * from user where id>#{id}")
    List<User> getUserList(int id);
}
