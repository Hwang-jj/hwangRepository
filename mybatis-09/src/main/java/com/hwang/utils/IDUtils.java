package com.hwang.utils;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;
import org.junit.Test;

import java.util.UUID;

/**
  * @ClassName IDUtils
  * @description: TODO
  * @author Hwangjj
  * @date 2023/3/25 14:38
  * @version: 1.0
  */ 

public class IDUtils {

    public static String getId(){
        return UUID.randomUUID().toString().replaceAll("-", "");
    }

    @Test
    public void test(){
        System.out.println(IDUtils.getId());
    }
}
