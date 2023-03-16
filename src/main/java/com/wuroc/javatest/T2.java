package com.wuroc.javatest;

public class T2 {

            public static class Parent {}
    public static class Children extends Parent {}
        public static void some(Children obj) {
            System.out.println("Children");
        }
        public static void some(Parent obj) {
            System.out.println("Parent");
        }
            public static void main(String[] args) {
                Parent obj1 = new Parent();
                Parent obj2 = new Children();
                some (obj1);
                some (obj2);
}
    }

