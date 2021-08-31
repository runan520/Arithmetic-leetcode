package com.wuroc.javatest;

import java.nio.charset.StandardCharsets;
import java.util.*;

/**
 * @ClassName ObjNullComputer
 * @Description TODO
 * @Author HepengWu
 * @Date 2021/7/30 19:53
 * @Version 1.0
 **/
public class ObjNullComputer {

    private static final  List<Integer> list = new ArrayList<>();

    private static String string = "1234567";
    private static final StringBuilder sb = new StringBuilder(string);
    private static final HashMap<String,Object> hashMap = new HashMap<>();
    public static void main(String[] args) {
            long a=1;
            Long b=1L;
            if (a==b){
                System.out.println("==");
            }

//        list.add(1);
//        list.add(4);
//        list.add(2);
//        System.out.println(Arrays.toString(list.toArray()).replaceAll("\\[|]|\\s",""));

        sb.deleteCharAt(0);
        sb.delete(0,1);
        System.out.println(sb);
        hashMap.put("rrr",null);

        hashMap.put("qr",2);
        System.out.println(hashMap);
        System.out.println(hashMap.get("rrr"));
        if (hashMap.get("rrr") == null){
            string = null;
            System.out.println("test");
            System.out.println(string);
        }
    }
}
