package com.IODemo;

/**
 * 读取student.txt文件，并打印到控制台
 * */
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class FileToArrayListTest {
    public static void main(String[] args) throws IOException {
//      创建缓冲流对象
        BufferedReader br = new BufferedReader(new FileReader("student.txt"));

        ArrayList<Student> arrayList = new ArrayList<Student>();
        String str;
        while ((str = br.readLine()) != null) {
            String[] strArr = str.split("---");
            Student st = new Student();
            st.setId(strArr[0]);
            st.setName(strArr[1]);
            st.setAge(strArr[2]);
            st.setAddress(strArr[3]);
//          存储到ArrayList中
            arrayList.add(st);
        }
        br.close();
        System.out.println("学号\t姓名\t年龄\t地址");
        for (int i = 0; i < arrayList.size(); i++) {
            Student stu = arrayList.get(i);
            System.out.println(stu.getId() + "\t" + stu.getName() + "\t" +stu.getAge() + "\t" +stu.getAddress());
        }
    }
}
