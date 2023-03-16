package com.wuroc.javatest;

import java.util.concurrent.Callable;

public interface TestUU {
//        public String m1() {return "";}
        public default String m2() {return "";}
        public static String m3() {return "";}
        public abstract String m4();

}
class C implements Callable {public String call() {
        return null;
}}
