package com.wuroc.javatest;

public  class T81 extends Thread {
    public void run() {
        System.out.println("hello ");
    }

    public static void main(String[] args) {
        Thread t = new T81();
        System.out.println(t.isAlive());
    }
}
