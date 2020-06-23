package com.studentManger;
/**
 * 学生管理系统实现
 * A:定义学生类
 * B:学生管理系统查看所有学生的代码编写
 * C:学生管理系统的添加学生
 * D:学生管理系统的删除学生
 * E:学生管理系统的修改学生
 *
 */
import javax.lang.model.util.SimpleElementVisitor7;
import java.util.ArrayList;
import java.util.Scanner;
public class StudentMangerTest {
    public static void main(String[] args) {
        ArrayList<Student> arrayList = new ArrayList<Student>();
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
            switchIf(choiceStr, arrayList);
        }
    }
    public static void switchIf(String choiceStr, ArrayList<Student> arrayList) {
        switch (choiceStr) {
            case "1":
//              查看所有学生
                findAllStudent(arrayList);
                break;
            case "2":
//              添加学生
                addStudent(arrayList);
                break;
            case "3":
//              删除学生
                removeStudent(arrayList);
                break;
            case "4":
//              修改学生
                updateStudent(arrayList);
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
    public static void findAllStudent(ArrayList<Student> arrayList) {
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
    public static void addStudent(ArrayList<Student> arrayList) {
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
        System.out.println("添加成功！");
    }
    public static void removeStudent(ArrayList<Student> arrayList) {
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
            System.out.println("删除学生成功");
        }

    }
    public static void updateStudent(ArrayList<Student> arrayList) {
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
            System.out.println("修改成功！");
        }
    }
}
