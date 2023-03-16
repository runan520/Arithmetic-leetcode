package com.wuroc.javatest;

public class T13{
public static class P {
        public void prints(int i) {System.out.println("P");}
        public void prints(boolean i) {System.out.println("P");}
//        static public void prints(boolean i) {System.out.println("P");}
        public static void display() {System.out.println("P");}
        }
        public  static class C extends P {
            public void print() {System.out.println("c");}
            public static void display() {System.out.println("c");}
        }
        public static void main(String[] args) {
            P obj = new C();
//            obj.print();
            obj.display();
}

        }
