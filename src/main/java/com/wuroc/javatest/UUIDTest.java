package com.wuroc.javatest;

import java.util.UUID;

/**
 * @ClassName UUID
 * @Description TODO
 * @Author XiaoShuMu
 * @Version 1.0
 * @Create 2021-10-22 10:53
 * @Blog https://www.cnblogs.com/WLCYSYS/
 **/
public class UUIDTest {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            String uuid = UUID.randomUUID().toString().replaceAll("-", "");
            System.out.println(uuid);
        }
    }
}
