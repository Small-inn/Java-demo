package com.OverrideDemo;

public class TestOverride {
    public static void main(String[] args) {
        // 静态方法和非静态方法区别很大
        // 静态方法：调用只和左边定义的数据类型有关


        // 非静态：重写

        // 方法的调用只和左边定义的数据类型有关
        A a = new A();
        a.test();


        B b = new A();
        b.test();
    }
}
