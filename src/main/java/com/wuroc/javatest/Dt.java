package com.wuroc.javatest;


import org.junit.Test;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.Iterator;
import java.util.zip.GZIPInputStream;

/**
 * @ClassName Dt
 * @Description TODO
 * @Author XiaoShuMu
 * @Version 1.0
 * @Create 2021-11-20 10:38
 * @Blog https://www.cnblogs.com/WLCYSYS/
 **/
public class Dt {


    public static void main(String[] args) throws IOException {
        Date date = new Date();
        int res = 30 / 100 * 100;
        System.out.println(res);
        String s = null;
//        if(s!=null || s.length() >0) {
//            System.out.println("null");
//        }
//        if (s.equals("null") || s.length() == 0) {
//            System.out.println("aa");
//        }

        String s1 = "Hello world";
        String s2 = new String("Hello world");
        String s3 = "Hello" + " world";
        System.out.println(6&15);
        System.out.println(Arrays.stream("a|b|c".split("[0-9]{3}")).toList());
        Integer a = 88, b = 88;
//        System.out.println('[0-9]{3}' + "");
//        new ObjectInputStream(new FileInputStream("a.dat"));
//        new BufferedReader(new FileReader("a.txt"));
//        new GZIPInputStream(new FileInputStream("a.zip"));
//        new BufferedWriter(new FileOutputStream("a.dat"));
//        System.out.println(((Dt) null).waitforSignal());

//        ArrayList<String> str = new ArrayList<>();
//        str.add("A");
//        Iterator<String> it = new Iterator<String>();
    }
//    @Test
//    void waitforSignal() throws InterruptedException {
//        Object obj = new Object();
//        synchronized (Thread.currentThread()) {
//            obj.wait();
//            obj.notify();
//        }
//    }


}
