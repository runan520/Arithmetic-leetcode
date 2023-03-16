package com.wuroc.javatest;

/**
 * @ClassName FinalMethodTest
 * @Description TODO
 * @Author XiaoShuMu
 * @Version 1.0
 * @Create 2022-05-20 16:08
 * @Blog https://www.cnblogs.com/WLCYSYS/
 **/
public class FinalMethodTest {
    public static void main(String args []) {
    Thread t = new Thread() {
    public void run() {
            world();
        }
    };
            t.run();
            System.out.print("hello ");
        }
        static void world() {
                System.out.print("world");
}
    }
