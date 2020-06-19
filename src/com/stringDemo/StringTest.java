package com.stringDemo;

import java.util.Scanner;
public class StringTest {
    public static void main(String[] args) {
        String username = "admin";
        String password = "123456";
//      1.0 模拟登陆
//        while (true) {
//            Scanner sc = new Scanner(System.in);
//            System.out.println("请输入用户名");
//            String inputName = sc.nextLine();
//            System.out.println("请输入密码");
//            String inputPassword = sc.nextLine();
//            if (username.equals(inputName) && password.equals(inputPassword)) {
//                System.out.println("登陆成功！");
//                break;
//            } else {
//                System.out.println("账户或密码错误！");
//            }
//        }
//      2.0 统计字符串中的字符出现的次数
//        statisCh();
        System.out.println(arrToStr());
    }

    public static void statisCh() {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入字符：");
        String str = sc.nextLine();

        int bigCount = 0;
        int smallCount = 0;
        int numCount = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch >= 'A' && ch <= 'Z') {
                bigCount++;
            } else if (ch >= 'a' && ch <= 'z') {
                smallCount++;
            } else if (ch >= '0' && ch <= '9') {
                numCount++;
            } else {
                System.out.println("该字符"+ch+"非法");
            }
        }

        System.out.println(bigCount + "--" + smallCount + "--" + numCount);
    }
    public static String arrToStr() {
        int[] arr = {1, 2, 3};
        String item = "";
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1) {
                item += arr[i];
            } else {
                item += arr[i] + ",";
            }
        }
        String st = "[" + item + "]";
        return st;
    }
}
