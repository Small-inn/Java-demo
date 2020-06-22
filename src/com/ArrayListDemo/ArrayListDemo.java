package com.ArrayListDemo;

import java.util.ArrayList;

/**
 * 集合类:
 *     面向对象编程语言是对事物的描述都是通过对象来体现的。
 *     为了方便对多个对象进行操作，必须对多个对象进行存储，而言想对多个对象进行存储，就不能是一个基本的变量，而应该是一个容器类型的变量。
 *     容器类型:
 *          StringBuilder: 返回结果只能是一个字符串类型
 *          数组[]: 数组的长度是固定的
 *          ArrayList: 集合类,长度可变数组实现
 *  ArrayList<E>:
 *          E:泛型
 *          public boolean add(E, e): 添加元素
 *          public void add(int index, E element):在指定的索引处添加一个元素
 * */
public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<String> array = new ArrayList<String>();
        System.out.println(array);
        array.add("hello");
        array.add("world");
        System.out.println(array);
    }
}
