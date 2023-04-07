package dao;

import com.hwang.dao.UserMapper;
import com.hwang.pojo.User;
import com.hwang.utils.MybatisUtils;
import org.apache.ibatis.session.RowBounds;
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
    public void test1(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();


        //底层主要应用反射
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        List<User> userList = mapper.getAllUsers();
        for (User user:userList){
            System.out.println(user);
        }
        sqlSession.commit();
        sqlSession.close();
    }



    @Test
    public void test(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        User user = mapper.getUserById(2);
        System.out.println(user);

        sqlSession.commit();
        sqlSession.close();
    }

    @Test
    public void test2(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        int res = mapper.addUser(new User(6, "abc", "hhjjhh"));

//        sqlSession.commit();
        sqlSession.close();
    }

    @Test
    public void test3(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        int res = mapper.updateUser(new User(6, "hwangjj", "qwerty"));

        sqlSession.close();
    }

    @Test
    public void test4(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        int res = mapper.deleteUser(6);

        sqlSession.close();
    }

    @Test
    public void test5(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        List<User> userList = mapper.getUserList(2);
        for (User user:userList){
            System.out.println(user);
        }

        sqlSession.close();
    }

}
