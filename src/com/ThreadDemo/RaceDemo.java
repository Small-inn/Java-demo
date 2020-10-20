package com.ThreadDemo;

public class RaceDemo implements Runnable {
    private static String winner;
    @Override
    public void run() {
        for (int i = 0; i <= 100; i++) {
            // 模拟兔子休息
//            if (Thread.currentThread().getName().equals("兔子") && i%10 ==0) {
//                try {
//                    Thread.sleep(5);
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
//            }

            boolean flag = gameOver(i);
            if (flag) {
                break;
            }
            System.out.println(Thread.currentThread().getName() + "---跑了" + i + "步");

        }
    }

    public boolean gameOver(int steps) {
        // 先判断时候有胜利者
        if (winner != null) {
            return true;
        } {
            if (steps >= 100) {
                winner = Thread.currentThread().getName();
                System.out.println("winner is" + winner);
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        RaceDemo raceDemo = new RaceDemo();
        new Thread(raceDemo, "兔子").start();
        new Thread(raceDemo, "乌龟").start();
    }
}
