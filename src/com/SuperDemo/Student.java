package com.SuperDemo;

public class Student extends Person{

    private String name = "学生";

    public Student() {
        System.out.println("student的无参构造");
    }

    public Student(String name) {
        this.name = name;
    }

    public void print() {
        System.out.println("student");
    }

    public void test() {
        print();
        this.print();
        super.print();
    }

    public void test1(String name) {
        System.out.println(name);
        System.out.println(this.name);
        System.out.println(super.name);
    }

}
