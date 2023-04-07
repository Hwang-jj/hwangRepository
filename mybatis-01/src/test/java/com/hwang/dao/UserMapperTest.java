package com.hwang.dao;

import com.hwang.pojo.User;
import com.hwang.utils.MybatisUtils;
import org.apache.ibatis.jdbc.SQL;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;


import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
  * @ClassName UserDaoTest
  * @description: TODO
  * @author Hwangjj
  * @date 2023/3/23 20:49
  * @version: 1.0
  */ 

public class UserMapperTest {
    @Test
    public void test(){
        SqlSession sqlSession = null;
        try {
            //1 获得sqlsession对象
            sqlSession = MybatisUtils.getSqlSession();
            //方式一：执行sql
            UserMapper mapper = sqlSession.getMapper(UserMapper.class);
            List<User> userList = mapper.getUserList();

            for (User user : userList) {
                System.out.println(user);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            sqlSession.close();
        }
    }

    @Test
    public void test2(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        User user = mapper.getUserById(1);
        System.out.println(user);


        sqlSession.close();
    }

    @Test
    public void test3(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        int res = mapper.addUser(new User(4, "赵六", "123456"));

        if (res>0){
            System.out.println("插入成功");
        }

        //提交事务!!!
        sqlSession.commit();
        sqlSession.close();

    }

    @Test
    public void test4(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        int res = mapper.updateUser(new User(4, "hjj", "654321"));
        if (res>0) System.out.println("更新成功!");
        sqlSession.commit();
        sqlSession.close();
    }

    @Test
    public void test5(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        int res = mapper.deleteUser(4);
        if (res>0) System.out.println("删除成功！");

        sqlSession.commit();
        sqlSession.close();
    }

    @Test
    public void test6(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);

        Map<String, Object> map = new HashMap<>();
        map.put("userid",4);
        map.put("username","hjj");
        map.put("userpassword","987654");

        int res = mapper.addUser2(map);
        if (res>0) System.out.println("添加成功");

        sqlSession.commit();
        sqlSession.close();
    }

    @Test
    public void test7(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);

        List<User> userList = mapper.getUserLike("%李%");
        for (User user:userList){
            System.out.println(user);
        }

        sqlSession.commit();
        sqlSession.close();
    }
}
