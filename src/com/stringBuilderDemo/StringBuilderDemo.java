package com.stringBuilderDemo;

/**
 * StringBuilder: 是一个可变的字符串，字符串缓冲区类
 *
 * 与String的区别：
 *      String的内容是固定的，StringBuilder是不固定的
 *
 * 构造方法：StringBuilder()
 * 成员方法：public int capacity(): 返回当前容量，理论值
 *         public int length(): 返回长度（字符数）
 * 添加功能：public StringBuilder append(任意类型)，添加数据，返回对象本身
 * 反转功能：public StringBuilder reverse()
 * */
import java.util.Scanner;
public class StringBuilderDemo {
    public static void main(String[] args) {
//      1.0
        StringBuilder stb = new StringBuilder();
        System.out.println(stb.capacity());
        System.out.println(stb.length());
        stb.append("hello");
        stb.append("world");
        System.out.println(stb);

//      2.0
        StringBuilder sb = new StringBuilder();
        int[] arr = {1, 2, 3};
        sb.append("[");
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1) {
                sb.append(arr[i]);
            } else {
                sb.append(arr[i] + ",");
            }
        }
        sb.append("]");
        System.out.println(sb);
//      3.0
        System.out.println("请输入");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        Boolean b = isSymmettry(str);
        System.out.println(b);
    }
    public static boolean isSymmettry(String s) {
        StringBuilder sb = new StringBuilder(s);
        sb.reverse();
        return sb.toString().equals(s);
    }
}
