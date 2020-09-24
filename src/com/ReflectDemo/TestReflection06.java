package com.ReflectDemo;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

// 动态创建对象
public class TestReflection06 {
    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException, NoSuchFieldException {
        Class cl = Class.forName("com.ReflectDemo.User");

        // 本质是调用了无参构造器
        User user = (User) cl.newInstance();
        System.out.println(user);

        // 通过构造器创建对象
        Constructor constructor = cl.getDeclaredConstructor(String.class, int.class, int.class);
        User u2 = (User) constructor.newInstance("lx", 001, 20);
        System.out.println(u2);

        // 通过反射调用普通方法
        User u3 = (User) cl.newInstance();
        Method setName = cl.getDeclaredMethod("setName", String.class);
        // invoke: 激活的意思， 参数：1.对象， 2.方法的值
        setName.invoke(u3, "哈哈哈");
        System.out.println(u3.getName());

        // 通过反射操作属性
        User u4 = (User) cl.newInstance();
        Field field = cl.getDeclaredField("name");
        // 不能直接操作私有属性，我们需要关闭程序的安全检测，属性或者方法的setAccessible(true)
        field.setAccessible(true); //
        field.set(u4, "嘿嘿");
        System.out.println(u4.getName());


    }
}
