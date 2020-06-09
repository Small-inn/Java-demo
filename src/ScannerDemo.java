/**
 * 为了提高程序灵活性，把数据改为键盘录入
 * 使用步骤：
 *  1.导包
 *      在一个类中的顺序：package > import > class
 *  2.创建键盘录入对象
 *      Scanner sc = new Scanner(System.in)
 *  3.接收数据
 *      int i = sc.nextInt()
 * */

import java.util.Scanner;

public class ScannerDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个数：");
//        int i = sc.nextInt();
//        System.out.println("i:" + i);
//      输入三个数比较最大值
        int a = sc.nextInt();
        System.out.println("请输入一个数：");
        int b = sc.nextInt();
        System.out.println("请输入一个数：");
        int c = sc.nextInt();
        int max = (a > b ? a : b) > c ? (a > b ? a : b) : c;
        System.out.println(max);
    }
}
