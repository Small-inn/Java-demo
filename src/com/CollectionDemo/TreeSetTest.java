package com.CollectionDemo;

import java.util.Iterator;
import java.util.TreeSet;

/**
 *
 * TreeSet的使用
 * 存储结构:红黑树
 * 要求：元素必须要实现Comparable接口，compareTo()方法返回值为0，认为是重复元素
 * */
public class TreeSetTest {
    public static void main(String[] args) {
        //1.0 基础用法
//        TreeSet<String> treeSet = new TreeSet<>();
//        treeSet.add("xyz");
//        treeSet.add("abc");
//        treeSet.add("hello");
//        treeSet.add("world");
//        System.out.println(treeSet.size());
//        System.out.println(treeSet.toString());
//        // 使用iterator遍历
//        Iterator<String> iterator = treeSet.iterator();
//        while (iterator.hasNext()) {
//            System.out.println(iterator.next());
//        }
//
//        System.out.println(treeSet.contains("xyz"));
        //2.0 泛型
        TreeSet<Student> students = new TreeSet<>();
        Student p1 = new Student("lx", 18);
        Student p2 = new Student("hh", 20);
        Student p3 = new Student("yy", 22);

        students.add(p1);
        students.add(p2);
        students.add(p3);

        System.out.println(students.size());
        System.out.println(students.toString());

    }
}

class Student implements Comparable<Student> {
    private String name;
    private int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public int compareTo(Student o) {
        int n1 = this.getName().compareTo(o.getName());
        int n2 = this.age - o.getAge();
        return n1 == 0 ? n2 : n1;
    }
}
