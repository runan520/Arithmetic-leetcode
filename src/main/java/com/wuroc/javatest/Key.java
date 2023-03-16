package com.wuroc.javatest;

import java.util.HashMap;
import java.util.Map;

public  class Key {
    int i;
    @Override
    public boolean equals (Object obj) { return i== ((Key)obj).i;}
    @Override
    public int hashCode() {
        return i;
    }

        @Override
        public String toString() {
            return String.valueOf(i);
        }
            public static void main(String[] args) {
            Key key = new Key();
            Map<Key,String> map = new HashMap<>();
            key.i = 0;
            map.put (key, "A");
            key.i = 2;
            map.put (key, "8");
            key.i = 3;
            System.out.println(map.size() + "  " + map.get(key));
}}
