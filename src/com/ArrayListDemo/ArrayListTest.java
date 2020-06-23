package com.ArrayListDemo;

import java.util.ArrayList;
import java.util.Scanner;
public class ArrayListTest {
    public static void main(String[] args) {
        String[] strArr = { "张三丰", "宋远桥", "张无忌", "殷梨亭", "张翠山", "灭绝师太" };
        ArrayList<String> arrayList = new ArrayList<String>();

        for (int i = 0; i < strArr.length; i++) {
            arrayList.add(strArr[i]);
        }

        for (int x = 0; x < arrayList.size(); x++) {
            String s = arrayList.get(x);
            if (s.startsWith("张")) {
                System.out.println(s);
            }
        }

        System.out.println(arrayList);
//      2.0
        ArrayList<Student> array = new ArrayList<Student>();
        for (int i = 0; i < 2; i++) {
            addStu(array);
        }
        for (int i = 0; i < array.size(); i++) {
            Student s = array.get(i);
            System.out.println(s.getAge() + "----" + s.getName());
        }
    }

    public static void addStu(ArrayList<Student> arr) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入姓名：");
        String name = sc.nextLine();
        System.out.println("请输入年龄：");
        String age = sc.nextLine();
        Student st = new Student();
        st.setName(name);
        st.setAge(age);
        arr.add(st);
    }
}
