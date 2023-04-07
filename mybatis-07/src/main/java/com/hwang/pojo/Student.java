package com.hwang.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
  * @ClassName Student
  * @description: TODO
  * @author Hwangjj
  * @date 2023/3/25 10:32
  * @version: 1.0
  */ 
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Student {
    private int id;
    private String name;
    private Teacher teacher;
}
