package com.wanfeng.javalearn.test;

import java.lang.reflect.Field;

public class Demo {
    public static void main(String[] args) throws NoSuchFieldException {
        Field f1 = Thread.class.getDeclaredField("threadLocals");
        Field f2 = Thread.class.getDeclaredField("threadLocals");
        System.out.println(f1 == f2);
    }
}
