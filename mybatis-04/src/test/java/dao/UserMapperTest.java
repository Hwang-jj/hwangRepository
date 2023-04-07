package dao;

import com.hwang.dao.UserMapper;
import com.hwang.pojo.User;
import com.hwang.utils.MybatisUtils;
import org.apache.ibatis.session.RowBounds;
import org.apache.ibatis.session.SqlSession;
import org.apache.log4j.Logger;
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

    Logger logger = Logger.getLogger(UserMapperTest.class);

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
    public void testlog4j(){
        logger.info("info:进入了testlog4j方法");
        logger.debug("debug:进入了testlog4j");
        logger.error("error:进入了testlog4j");
    }

    @Test
    public void testLimit(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);

        Map<String, Object> map = new HashMap<>();
        map.put("startIndex",1);
        map.put("pageSize",2);
        List<User> userByLimit = mapper.getUserByLimit(map);

        for (User user:userByLimit){
            System.out.println(user);
        }

        sqlSession.commit();
        sqlSession.close();
    }

    @Test
    public void testRowBounds(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();

        //RowBounds实现
        RowBounds rowBounds = new RowBounds(1,2);

        //通过java代码层面实现分页
        List<User> userList = sqlSession.selectList("com.hwang.dao.UserMapper.getUserByRowBounds",null,rowBounds);
        for (User user:userList){
            System.out.println(user);
        }

        sqlSession.commit();
        sqlSession.close();
    }

}
