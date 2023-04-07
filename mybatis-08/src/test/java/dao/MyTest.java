package dao;

import com.hwang.dao.TeacherMapper;
import com.hwang.pojo.Teacher;
import com.hwang.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

/**
  * @ClassName MyTest
  * @description: TODO
  * @author Hwangjj
  * @date 2023/3/25 13:30
  * @version: 1.0
  */ 

public class MyTest {

    @Test
    public void test1(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        TeacherMapper mapper = sqlSession.getMapper(TeacherMapper.class);
        List<Teacher> teachers = mapper.getTeacher();
        for (Teacher teacher: teachers) {
            System.out.println(teacher);
        }
        sqlSession.close();
    }

    @Test
    public void test2(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        TeacherMapper mapper = sqlSession.getMapper(TeacherMapper.class);
        Teacher teacher = mapper.getTeacherAndStudent(1);
        System.out.println(teacher);
        sqlSession.close();
    }

    @Test
    public void test3(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        TeacherMapper mapper = sqlSession.getMapper(TeacherMapper.class);
        Teacher teacher = mapper.getTeacherAndStudent2(1);
        System.out.println(teacher);
        sqlSession.close();
    }
}
