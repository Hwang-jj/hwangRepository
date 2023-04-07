package dao;

import com.hwang.dao.UserMapper;
import com.hwang.pojo.User;
import com.hwang.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

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
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        User user = mapper.getUserById(2);
        System.out.println(user);


        sqlSession.close();
    }




}
