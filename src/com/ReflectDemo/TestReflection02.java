package com.ReflectDemo;

import java.lang.annotation.Inherited;

// 测试class类的创建方式有哪些
public class TestReflection02 {
    public static void main(String[] args) throws ClassNotFoundException {
        Person person = new Student();
        System.out.println("这个人是：" + person.name);
        // 方式一： 通过对象获得
        Class cl1 = person.getClass();
        System.out.println(cl1.getName());
        System.out.println(cl1.hashCode());
        // 方式二：forName
        Class cl2 = Class.forName("com.ReflectDemo.Student");
        System.out.println(cl2.hashCode());
        // 方式三：通过类名.class获得
        Class cl3 = Student.class;
        System.out.println(cl3.hashCode());
        // 方式四：基本内置类型的包装类都有一个type属性
        Class cl4 = Integer.TYPE;
        System.out.println(cl4);
        // 获得父类类型
        Class cl5 = cl1.getSuperclass();
        System.out.println(cl5);
    }
}

class Person {
    String name;
    public Person() {}
    public Person(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                '}';
    }
}

class Student extends Person {
    public Student() {
        this.name = "学生";
    }
}

class Teacher extends Person {
    public Teacher() {
        this.name = "老师";
    }
}
