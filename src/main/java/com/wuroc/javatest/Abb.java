package com.wuroc.javatest;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Abb {
    public static void main (String[] args) {
        HashSet<Integer> s1 = new HashSet<>(Arrays.asList(1, 2, 3));
        printSet1(s1);
    }
public static void printSet (Set s) {
    s.add(10);
    for (Object o : s)
        System.out.println(o);
}
public static void printSet1 (Set<Integer> s) {
        s.add (10);
        for (Object o : s)
        {
        System.out.println(o);
    }
}
}
