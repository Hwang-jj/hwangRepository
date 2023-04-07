package com.hwang.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
  * @ClassName Teacher
  * @description: TODO
  * @author Hwangjj
  * @date 2023/3/25 10:32
  * @version: 1.0
  */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Teacher {
    private int id;
    private String name;

    private List<Student> students;
}
