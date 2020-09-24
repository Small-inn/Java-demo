package com.ReflectDemo;

// 反射操作注解
// getAnnotations
// getAnnotation

import java.lang.annotation.*;

// 利用注解和反射完成类和表结构的映射关系
public class TestReflection09 {
    public static void main(String[] args) throws ClassNotFoundException {
        Class cs = Class.forName("com.ReflectDemo.Student2");

        Annotation[] annotations = cs.getAnnotations();
        for (Annotation annotation : annotations) {
            System.out.println(annotation);
        }

        TableLx tableLx = (TableLx) cs.getAnnotation(TableLx.class);
        String value = tableLx.value();
        System.out.println(value);

    }
}

@TableLx("db_student")
 class Student2 {

//    @FieldLx(columnName = "db_id", type = "int", length = 10)
    private int id;
//    @FieldLx(columnName = "db_age", type = "int", length = 10)
    private int age;
//   @FieldLx(columnName = "db_name", type = "String", length = 10)
    private String name;

    public Student2() {
    }

    public Student2(int id, int age, String name) {
        this.id = id;
        this.age = age;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student2{" +
                "id=" + id +
                ", age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}


// 类名注解
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@interface TableLx{
    String value();
}

// 属性注解
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@interface FieldLx{
    String columnName();
    String type();
    int length();
}
