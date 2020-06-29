package com.IODemo;

import com.sun.crypto.provider.PBEWithMD5AndDESCipher;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * 键盘录入3个学生信息（学号、姓名、年龄、居住地）存入集合，然后遍历集合把没一个学生信息存入文本文件
 * */
public class ArrayListToFileTest {
    public static void main(String[] args) throws IOException {
        ArrayList<Student> arrayList = new ArrayList<Student>();
        addStu(arrayList);
        addStu(arrayList);
        addStu(arrayList);
//      创建输出缓冲流对象
        BufferedWriter bw = new BufferedWriter(new FileWriter("student.txt"));
        for (int i = 0; i < arrayList.size(); i++) {
            Student st = arrayList.get(i);
            StringBuilder sb = new StringBuilder();
            sb.append(st.getId()).append("---").append(st.getName()).append("---").append(st.getAge()).append("---").append(st.getAddress());
            bw.write(sb.toString());
            bw.newLine();
            bw.flush();
        }
        bw.close();
    }
//  添加学生
    public static void addStu(ArrayList<Student> arrayList) {
        Scanner sc = new Scanner(System.in);
        String id;
        while (true) {
            System.out.println("请输入学生学号");
            id = sc.nextLine();
            boolean flag = false;
            for (int i = 0; i < arrayList.size(); i++) {
                Student st = arrayList.get(i);
                if (st.getId().equals(id)) {
                    flag = true;
                    break;
                }
            }

            if (flag) {
                System.out.println("学号已被占用，请重新输入");
            } else {
                break;
            }
        }
        System.out.println("请输入姓名：");
        String name = sc.nextLine();
        System.out.println("请输入年龄：");
        String age = sc.nextLine();
        System.out.println("请输入地址：");
        String address = sc.nextLine();

        Student st = new Student();
        st.setId(id);
        st.setName(name);
        st.setAge(age);
        st.setAddress(address);
        arrayList.add(st);
        System.out.println("添加成功");
    }
}
