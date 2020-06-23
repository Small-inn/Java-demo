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
 * 获取元素：
 *      public E get(int index):返回指定索引处的元素
 * 集合长度：
 *      public int size(): 返回集合中的元素的个数
 * 删除元素：
 *      public boolean remove(Object o): 删除指定元素，返回删除是否成功
 *      public E remove(int index): 删除指定索引处元素，返回被删除的元素
 * 修改元素：
 *      public E set(int index, E element): 修改指定索引处的元素，返回被修改的元素
 * */
public class ArrayListDemo {
    public static void main(String[] args) {
//      创建集合对象
        ArrayList<String> array = new ArrayList<String>();
        System.out.println(array);
        array.add("hello");
        array.add("world");
        array.add("java");
        System.out.println(array);
//      获取
        System.out.println(array.get(0));
        System.out.println(array.get(1));
        System.out.println(array.get(2));
//      长度
        System.out.println(array.size());
//      删除
        System.out.println(array.remove("world"));
        System.out.println(array.remove(0));
//      修改
        System.out.println(array.set(0, "android"));
        System.out.println(array);
    }
}
