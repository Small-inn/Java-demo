package com.stringDemo;

import java.util.Scanner;
public class StringTest {
    public static void main(String[] args) {
        String username = "admin";
        String password = "123456";

        while (true) {
            Scanner sc = new Scanner(System.in);
            System.out.println("请输入用户名");
            String inputName = sc.nextLine();
            System.out.println("请输入密码");
            String inputPassword = sc.nextLine();
            if (username.equals(inputName) && password.equals(inputPassword)) {
                System.out.println("登陆成功！");
                break;
            } else {
                System.out.println("账户或密码错误！");
            }
        }
    }
}
