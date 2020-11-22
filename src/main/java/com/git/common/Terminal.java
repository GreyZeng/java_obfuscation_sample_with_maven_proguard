package com.git.common;

import com.git.reflection.ReflectTest;

public class Terminal {
    public static void terminal(int opt) throws Throwable {
        switch (opt) {
            case 1:
                print("Hello");
                break;
            case 2:
                print("world");
                break;
            default:
                print("default");
                break;
        }
    }

    public static void print(String c) throws Throwable {
        System.out.print(c);
        ReflectTest.initByDefaultConst();
    }

}
