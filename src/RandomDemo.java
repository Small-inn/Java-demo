/**
 *
 * Random:
 *  导包
 *  创建对象
 *  获取随机数
 * */
import java.util.Random;
import java.util.Scanner;

public class RandomDemo {
//    基础用法
//    public static void main(String[] args) {
//        Random ra = new Random();
//        int a = ra.nextInt(10); // [0, 10)
//        System.out.println(a);
//    }
//    猜数游戏1-100
    public static void main(String[] args) {
        Random ra = new Random();
        int aim = ra.nextInt(100) + 1;
        Scanner sc = new Scanner(System.in);
//      输入数字
        while (true) {
            System.out.println("请输入一个数：");
            int num = sc.nextInt();

            if (num > aim) {
                System.out.println("大了");
            } else if (num < aim) {
                System.out.println("小了");
            } else {
                System.out.println("恭喜");
                break;
            }
        }
    }
}
