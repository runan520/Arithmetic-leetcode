package com.wuroc.javatest;

public abstract class T10 {
    private String name;

    public T10(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract void buy();

}
class Ar extends T10{
    public Ar(String name) {
        super(name);
    }

    @Override
    public void buy() {
        System.out.println("dssd");
    }
    @Override
    public String getName() {
        return "dsd";
    }
    public static void main(String[] args) {
    }
}