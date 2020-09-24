package com.ReflectDemo;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class TestReflection07 {

    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        test01();
        test02();
        test03();
    }

    // 普通方式调用
    public static void test01() {
        User u = new User();
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < 100000000; i++) {
            u.getName();
        }
        long endTime = System.currentTimeMillis();
        System.out.println("普通方式执行：" + (endTime - startTime) + "ms");
    }

    // 通过反射调用
    public static void test02() throws NoSuchMethodException, ClassNotFoundException, IllegalAccessException, InstantiationException, InvocationTargetException {
        Class cs = Class.forName("com.ReflectDemo.User");
        User us = (User) cs.newInstance();
        Method getName = cs.getDeclaredMethod("getName", null);
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < 100000000; i++) {
            getName.invoke(us, null);
        }
        long endTime = System.currentTimeMillis();
        System.out.println("反射方式执行：" + (endTime - startTime) + "ms");
    }

    // 通过反射调用, 关闭检测
    public static void test03() throws NoSuchMethodException, ClassNotFoundException, IllegalAccessException, InstantiationException, InvocationTargetException {
        Class cs = Class.forName("com.ReflectDemo.User");
        User us = (User) cs.newInstance();
        Method getName = cs.getDeclaredMethod("getName", null);
        getName.setAccessible(true);
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < 100000000; i++) {
            getName.invoke(us, null);
        }
        long endTime = System.currentTimeMillis();
        System.out.println("反射方式执行：" + (endTime - startTime) + "ms");
    }

}
