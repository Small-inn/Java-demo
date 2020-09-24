package com.ReflectDemo;

public class TestReflection04 {
    public static void main(String[] args) throws ClassNotFoundException {
        // 获取系统类的加载器
        ClassLoader cl = ClassLoader.getSystemClassLoader();
        System.out.println(cl);

        // 获取系统类加载器的父类加载器---> 扩展加载器
        ClassLoader cParent = cl.getParent();
        System.out.println(cParent);
        // 获取扩展类加载器的父类加载器---> 根加载器（C/C++）
        ClassLoader cGp = cParent.getParent();
        System.out.println(cGp);

        // 测试当前类是哪个加载器加载的
        ClassLoader classLoader = Class.forName("com.ReflectDemo.TestReflection04").getClassLoader();
        System.out.println(classLoader);
        // 测试JDK内置的类是哪个加载器加载的
        classLoader = Class.forName("java.lang.Object").getClassLoader();
        System.out.println(classLoader);

        // 获得系统类加载器可以加载的路径
        System.out.println(System.getProperty("java.class.path"));
    }
}
