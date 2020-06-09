/**
 * 打印水仙花数
 * 三位数
 * 153 = 1*1*1 + 5*5*5 + 3*3*3
 * */
public class ForDemo {
    public static void main(String[] args) {
        int h = 0;
        int t = 0;
        int l = 0;
        int sum = 0;
        for (int i = 100; i < 1000; i++) {
            h = i / 100;
            t = (i % 100) / 10;
            l = i % 100 % 10;
            if (i == h * h * h + t * t * t + l * l * l) {
                sum += 1;
                System.out.println(i);
            }
        }
        System.out.println("个数"+sum);
    }
}
