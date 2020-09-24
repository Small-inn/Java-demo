package com.ReflectDemo;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class TestReflection05 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException, NoSuchMethodException {
        Class cl = Class.forName("com.ReflectDemo.User");

        cl.getName(); // 包名 + 类名
        cl.getSimpleName(); // 类名
        Field[] fields = cl.getFields(); // 获得属性,public属性
        System.out.println(fields.length);
        for (Field field: fields) {
            System.out.println(field);
        }
        fields = cl.getDeclaredFields(); // 全部属性
        for (Field field: fields) {
            System.out.println(field);
        }

        Field name = cl.getDeclaredField("name"); // 获取指定属性的值
        System.out.println(name);

        Method[] methods = cl.getMethods(); // 获取本类及其父类的全部public的方法
        methods = cl.getDeclaredMethods(); // 获得本类的所有方法
        System.out.println(methods);

        Method getName = cl.getMethod("getName", null);
        Method setName = cl.getMethod("setName", String.class);
        System.out.println(getName);
        System.out.println(setName);

        Constructor[] constructors = cl.getConstructors(); // 获取构造器
        for (Constructor constructor: constructors) {
            System.out.println(constructor);
        }
        constructors = cl.getDeclaredConstructors();

    }
}
