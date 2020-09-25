package com.SuperDemo;

public class Person {

    public Person() {
        System.out.println("Person无参构造");
    }

    protected String name = "人类";

    // 私有东西无法继承
    public void print() {
        System.out.println("Person");
    }

}
