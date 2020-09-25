package com.ExtendsDemo.mulDt;

public class Dog extends Animal {
    public void eat() {
        System.out.println("狗吃肉");
    }
//    子类独有的方法
    public void watchDoor() {
        System.out.println("狗会看门");
    }
}
