package com.java.dd;

import java.util.ArrayList;

/**
 * @author Roy
 * @create 2020-03-18 16:44
 */
public class HelloWorld {
    public static void main(String[] args) {
        String s = new String();
        System.out.println("args = [" + args + "]");
        System.out.println("HelloWorld.main");
        System.out.println("args = " + args);
        for (int i = 0; i < 50; i++) {


        }
        for (int j = 0; j < args.length; j++) {
            String arg = args[j];
            ArrayList list = new ArrayList();
            list.add(123);
            list.add(456);
            list.add(789);
            if (list == null) {
                break;
            }
        }

    }
}
