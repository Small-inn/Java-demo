/**
 *
 * 1.0 根据输入月份输出季节
 * 2.0 回文数字
 * 3.0 斐波那契数列
 *
 *
 * 面向对象：
 *      成员变量和局部变量的区别：
 *      A:在类中的位置不同
 *          成员变量：在类中，方法外
 *          局部变量：在方法中或者声明上（形参）
 *      B:在内存中的位置不同
 *          成员变量：堆内存中
 *          局部变量：栈内存
 *      C:声明周期的不同
 *          成员变量：随着对象的创建而存在，随着对象的消失而消失
 *          局部变量：随着方法的调用而存在，随着方法的调用完毕而消失
 *      D:初始值的问题
 *          成员变量：有默认值
 *          局部变量：无默认值，需先定义，赋值，最后使用
 *
 * private关键字
 *      private可以修饰成员变量，也可以修饰成员方法
 *      被private修饰的成员只能在本类中被访问
 * */

import java.util.Scanner;

public class TestDemo {
    public static void main(String[] args) {
//        outSeason();
//        hwNum();
        System.out.println(tzNum(6));
    }
//  四季
    public static void outSeason() {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入月份（1-12）：");
        int month = sc.nextInt();
        if (month == 1 || month == 2 || month == 3) {
            System.out.println("春季");
        } else if (month == 4 || month == 5 || month == 6) {
            System.out.println("夏季");
        } else if (month == 7 || month == 8 || month == 9) {
            System.out.println("秋季");
        } else if (month == 10 || month == 11 || month == 12) {
            System.out.println("冬季");
        } else {
            System.out.println("输入不符合规范，请重新输入");
            outSeason();
        }
    }
//  回文数
    public static void hwNum() {
        for (int i = 10000; i < 100000; i++) {
            int ge = i % 10;
            int shi = i / 10 % 10;
            int bai = i / 100 % 10;
            int qian = i / 1000 % 10;
            int wan = i / 10000 % 10;
            if (ge == wan && shi == qian) {
                System.out.println(i);
            }
        }
    }
//  兔子问题
    public static long tzNum(int n) {
//        使用递归
//        if (n == 1 || n == 2) {
//            return 1;
//        } else {
//            return tzNum(n - 1) + tzNum(n - 2);
//        }
//      数组
        int[] arr = new int[n];
        arr[0] = 1;
        arr[1] = 1;
        for (int i = 2; i < n; i++) {
            arr[i] = arr[i- 1] + arr[i - 2];
        }
        return arr[n - 1];
    }
//  局部变量
    public static void vaible() {
        int y = 0;
    }
}
