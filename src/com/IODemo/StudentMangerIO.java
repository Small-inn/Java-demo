package com.IODemo;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class StudentMangerIO {
    public static void main(String[] args) throws IOException {
//      定义文件路径
        String fileName = "students.txt";

        while (true) {
            System.out.println("欢迎来到学生管理系统-----");
            System.out.println("1.查看所有学生");
            System.out.println("2.添加学生");
            System.out.println("3.删除学生");
            System.out.println("4.修改学生");
            System.out.println("5.退出");

            System.out.println("请输入您的选择：");
            Scanner sc = new Scanner(System.in);
            String choiceStr = sc.nextLine();
            switchIf(choiceStr, fileName);
        }
    }
    public static void switchIf(String choiceStr, String fileName) throws IOException {
        switch (choiceStr) {
            case "1":
//              查看所有学生
                findAllStudent(fileName);
                break;
            case "2":
//              添加学生
                addStudent(fileName);
                break;
            case "3":
//              删除学生
                removeStudent(fileName);
                break;
            case "4":
//              修改学生
                updateStudent(fileName);
                break;
            case "5":
//              退出，这里使用case穿透效果
//                break;
            default:
                System.out.println("感谢您的使用！");
                System.exit(0); // JVM退出
                break;
        }
    }
    public static void findAllStudent(String fileName) throws IOException {
//      创建集合对象
        ArrayList<Student> arrayList = new ArrayList<Student>();
//      从文件中读取数据
        readData(fileName, arrayList);
        if (arrayList.size() == 0) {
            System.out.println("暂无信息");
            return;
        }
//      \t tab键位置
        System.out.println("学号\t姓名\t年龄\t地址");
        for (int i = 0; i < arrayList.size(); i++ ) {
            Student st = arrayList.get(i);
            System.out.println(st.getId() + "\t" + st.getName() + "\t" + st.getAge() + "\t" + st.getAddress());
        }
    }
    public static void addStudent(String fileName) throws IOException {
//      创建集合对象
        ArrayList<Student> arrayList = new ArrayList<Student>();
//      从文件中读取数据
        readData(fileName, arrayList);
        Scanner sc = new Scanner(System.in);
        String id;
        while (true) {
            System.out.println("请输入学号：");
            id = sc.nextLine();
            boolean flag = false;
            for (int i = 0; i < arrayList.size(); i++) {
                Student s = arrayList.get(i);
                if (s.getId().equals(id)) {
                    flag = true;
                    break;
                }
            }
            if (flag) {
                System.out.println("学号被占用，请重新输入");
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
//      添加到数组中
        arrayList.add(st);
//      把集合中的数据重新写到文件
        writeData(fileName, arrayList);
        System.out.println("添加成功！");
    }
    public static void removeStudent(String fileName) throws IOException {
//      创建集合对象
        ArrayList<Student> arrayList = new ArrayList<Student>();
//      从文件中读取数据
        readData(fileName, arrayList);
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入要删除的学号：");
        String id = sc.nextLine();
        int index  = -1;
        for (int i = 0; i < arrayList.size(); i++) {
            Student st = arrayList.get(i);
            if (st.getId().equals(id)) {
                index = i;
                break;
            }
        }
        if (index == -1) {
            System.out.println("删除项不存在,请重新选择");
        } else {
            arrayList.remove(index);
//          把集合中的数据重新写到文件
            writeData(fileName, arrayList);
            System.out.println("删除学生成功");
        }

    }
    public static void updateStudent(String fileName) throws IOException {
//      创建集合对象
        ArrayList<Student> arrayList = new ArrayList<Student>();
//      从文件中读取数据
        readData(fileName, arrayList);
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入你要修改的学生号：");
        String id = sc.nextLine();
        int index = -1;
        for (int i = 0; i < arrayList.size(); i++ ) {
            Student st = arrayList.get(i);
            if (st.getId().equals(id)) {
                index = i;
                break;
            }
        }
        if (index == -1) {
            System.out.println("修改的学生不存在，请重新输入");
        } else {
            System.out.println("请输入新的姓名：");
            String name = sc.nextLine();
            System.out.println("请输入新的年龄：");
            String age = sc.nextLine();
            System.out.println("请输入新的地址：");
            String address = sc.nextLine();

            Student st = new Student();
            st.setId(id);
            st.setName(name);
            st.setAge(age);
            st.setAddress(address);
//          添加到数组中
            arrayList.set(index, st);
//          把集合中的数据重新写到文件
            writeData(fileName, arrayList);
            System.out.println("修改成功！");
        }
    }
    public static void readData(String fileName, ArrayList<Student> arrayList) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(fileName));
        String line;
        while ((line = br.readLine()) != null) {
            String[] data = line.split("---");
            Student s = new Student();
            s.setId(data[0]);
            s.setName(data[1]);
            s.setAge(data[2]);
            s.setAddress(data[3]);
            arrayList.add(s);
        }
        br.close();
    }
    public static void writeData(String fileName, ArrayList<Student> arrayList) throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter(fileName));
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
}
