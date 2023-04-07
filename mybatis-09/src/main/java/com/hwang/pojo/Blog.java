package com.hwang.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
  * @ClassName Blog
  * @description: TODO
  * @author Hwangjj
  * @date 2023/3/25 14:30
  * @version: 1.0
  */ 

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Blog {
    private String id;
    private String title;
    private String author;
    private Date createTime; //属性名与字段名不一致
    private int views;
}
