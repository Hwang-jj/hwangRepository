package com.hwang.utils;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

/**
  * @ClassName MybatisUtils
  * @description: TODO
  * @author Hwangjj
  * @date 2023/3/23 20:26
  * @version: 1.0
  */ 

public class MybatisUtils {

    private static SqlSessionFactory sqlSessionFactory;

    static {
        InputStream inputStream = null;
        try {
            //1:获取sqlSessionFactory对象
            String resource = "mybatis-config.xml";
            inputStream = Resources.getResourceAsStream(resource);
            sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    //既然有了 SqlSessionFactory，顾名思义，我们可以从中获得 SqlSession 的实例
    //SqlSession 完全包含了面向数据库执行sql命令的所有方法
    public static SqlSession getSqlSession(){
        return sqlSessionFactory.openSession(true);
    }
}



