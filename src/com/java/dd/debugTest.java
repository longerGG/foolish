package com.java.dd;

import sun.awt.SunHints;

import java.util.HashMap;

/**
 * @author Roy
 * @create 2020-03-19 9:49
 */
public class debugTest {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        map.put("name","tom");
        map.put("age","16");
        map.put("school","Tsinghua");
        map.put("major","computer");

        String age = map.get("age");
        System.out.println("age = " + age);

        map.remove("major");
        System.out.println(map);


    }
}
