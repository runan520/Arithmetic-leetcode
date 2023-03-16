package com.wuroc.javatest;


import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 非贪婪匹配
 */
public class TestPa {
    public static void main(String[] args) {
        String content = "aaaa222222333";
//        String regStr ="\\d+";//贪婪匹配
        String regStr ="\\d.+?";//非贪婪匹配
        Pattern pattern = Pattern.compile(regStr);
        Matcher matcher = pattern.matcher(content);
        while (matcher.find()){
            System.out.println("找到："+matcher.group(0));
        }
    }
}
