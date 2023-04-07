package com.hwang.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
  * @ClassName User
  * @description: TODO
  * @author Hwangjj
  * @date 2023/3/25 17:20
  * @version: 1.0
  */ 

@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
    private int id;
    private String name;
    private String pwd;
}
