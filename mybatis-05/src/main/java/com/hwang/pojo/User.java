package com.hwang.pojo;


import lombok.AllArgsConstructor;
import lombok.Data;

/**
  * @ClassName User
  * @description: TODO
  * @author Hwangjj
  * @date 2023/3/23 20:37
  * @version: 1.0
  */ 

@Data
@AllArgsConstructor
public class User {
    private int id;
    private String name;
    private String password;

}
