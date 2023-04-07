package com.hwang.dao;

import com.hwang.pojo.Student;
import com.hwang.pojo.Teacher;
import com.hwang.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

/**
  * @ClassName MyTest
  * @description: TODO
  * @author Hwangjj
  * @date 2023/3/25 10:37
  * @version: 1.0
  */ 

public class MyTest {

    @Test
    public void test1(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        TeacherMapper mapper = sqlSession.getMapper(TeacherMapper.class);
        Teacher teacher = mapper.getTeacher(1);
        System.out.println(teacher);

        sqlSession.commit();
        sqlSession.close();
    }

    @Test
    public void test2(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        StudentMapper mapper = sqlSession.getMapper(StudentMapper.class);
        List<Student> students = mapper.getStudent();
        for (Student student:students){
            System.out.println(student);
        }
        sqlSession.commit();
        sqlSession.close();
    }

    @Test
    public void test3(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        StudentMapper mapper = sqlSession.getMapper(StudentMapper.class);
        List<Student> students = mapper.getStudentAndTeacher();
        for (Student student:students){
            System.out.println(student);
        }
        sqlSession.commit();
        sqlSession.close();
    }
}
