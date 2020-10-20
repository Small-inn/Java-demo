package com.ThreadDemo;

// 实现runnable接口，重写run方法，执行线程需要丢入runnable接口实现类，调用start方法

public class ThreadTest01 implements Runnable {

    @Override
    public void run() {
        // run方法线程体
        for (int i = 0; i < 10; i++) {
            System.out.println("看代码----");
        }
    }

    public static void main(String[] args) {
        // main线程，主线程
//        ThreadTest01 threadTest01 = new ThreadTest01();
//        threadTest01.start();
        // 创建runnable接口的实现类对象
        ThreadTest01 threadTest01 = new ThreadTest01();
        // 创建线程对象，通过线程对象来开启我们的线程，代理
        Thread thread = new Thread(threadTest01);

        thread.start();

        for (int i = 0; i < 20; i++) {
            System.out.println("看视频----");
        }
    }
}
