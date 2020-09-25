package com.StaticDemo;
// 静态导入包
import static  java.lang.Math.random;

public class TestStatic {
    {
        System.out.println("匿名代码块");
    }
    static {
        System.out.println("静态代码块");
    }

    public TestStatic() {
        System.out.println("构造方法");
    }

    public static void main(String[] args) {
        TestStatic ts = new TestStatic();
        System.out.println(random());
    }
}
