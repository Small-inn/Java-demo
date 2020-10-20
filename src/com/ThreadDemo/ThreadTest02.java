package com.ThreadDemo;

public class ThreadTest02 implements Runnable {
    private int tickCounts = 10;

    @Override
    public void run() {
        while (true) {
            if (tickCounts < 0) {
                break;
            }
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + "-----拿到了，第" + tickCounts-- + "张票");
        }
    }

    public static void main(String[] args) {
        ThreadTest02 threadTest02 = new ThreadTest02();

        new Thread(threadTest02, "小明").start();
        new Thread(threadTest02, "老师").start();
        new Thread(threadTest02, "黄牛").start();
    }
}
