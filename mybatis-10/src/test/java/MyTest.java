import com.hwang.dao.UserMapper;
import com.hwang.pojo.User;
import com.hwang.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

/**
  * @ClassName MyTest
  * @description: TODO
  * @author Hwangjj
  * @date 2023/3/25 17:28
  * @version: 1.0
  */ 

public class MyTest {

    @Test
    public void test1(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        User user1 = mapper.queryUserById(1);
        System.out.println(user1);

//        mapper.updateUser(new User(2,"aaaa","bbbb"));
        sqlSession.clearCache();
        System.out.println("--------------------------------");

        User user2 = mapper.queryUserById(1);
        System.out.println(user2);

        System.out.println(user1==user2);

        sqlSession.close();
    }

    @Test
    public void test2(){
        SqlSession sqlSession1 = MybatisUtils.getSqlSession();
        SqlSession sqlSession2 =MybatisUtils.getSqlSession();

        UserMapper mapper1 = sqlSession1.getMapper(UserMapper.class);
        User user1 = mapper1.queryUserById(1);
        System.out.println(user1);
        sqlSession1.close();


        UserMapper mapper2 = sqlSession2.getMapper(UserMapper.class);
        User user2 = mapper2.queryUserById(1);
        System.out.println(user2);
        sqlSession2.close();

        System.out.println(user1==user2);

    }
}
