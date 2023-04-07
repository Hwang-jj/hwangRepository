package com.hwang.dao;

import com.hwang.pojo.Teacher;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface TeacherMapper {

    //获取所有老师
    List<Teacher> getTeacher();

    //获取指定老师下的所有学生及老师的信息
    Teacher getTeacherAndStudent(@Param("tid") int id);

    Teacher getTeacherAndStudent2(@Param("tid") int id);
}
