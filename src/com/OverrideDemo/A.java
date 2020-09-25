package com.OverrideDemo;

public class A extends B {

//    public static void test() {
//        System.out.println("B => test()");
//    }
    // 重写都是方法的重写与属性无关
    @Override
    public void test() {
        System.out.println("A => test()");
    }
}
