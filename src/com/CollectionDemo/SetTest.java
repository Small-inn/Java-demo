package com.CollectionDemo;

import java.util.HashSet;
import java.util.Objects;

/**
 *
 * HashSet的使用：
 * 存储过程：哈希表（数组+链表+红黑树）
 * 存储过程：
 *     1. 根据hashcode,计算保存位置，如果位置为空，则直接保存，如果不为空执行第二步
 *     2. 再执行equals方法，如果返回为true则认为是重复，否则形成链表
 * */

public class SetTest {
    public static void main(String[] args) {
        HashSet<Person> persons = new HashSet<Person>();

        Person p1 = new Person("lx", 20);
        Person p2 = new Person("xx", 22);
        Person p3 = new Person("hh", 25);

        persons.add(p1);
        persons.add(p2);
        persons.add(p3);
        persons.add(new Person("hh", 25));

        System.out.println(persons.size());
        System.out.println(persons.toString());
        // 删除
        persons.remove(p1);
        System.out.println(persons.toString());
    }
}

class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age &&
                name.equals(person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}
