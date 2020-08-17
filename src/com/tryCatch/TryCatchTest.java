package com.tryCatch;

public class TryCatchTest {
    public static void main(String[] args) {
        test();
    }
    /**
     * divider: 除数
     * result: 结果
     * try-catch：捕获while循环
     * 每次循环divider减1，result = result + 100 / divider
     * 如果捕获异常就打印“抛出异常了！！！！”返回-1
     * 否则返回result
     * */
    public static int test() {
        int divider = 10;
        int result = 100;
        try {
            while (divider > -1) {
                divider--;
                result = result + 100 / divider;
            }
            return  result;
        } catch(Exception e) {
            e.printStackTrace();
            System.out.println("循环抛出异常了！！！");
        }
        return 0;
    }
}
