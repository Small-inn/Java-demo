package com.IODemo;

import java.io.*;

/**
 * BufferedWriter: 将文本写入字符处输出流，缓冲各个字符，从而提供单个字符、数组和字符串的高效写入
 * BufferedReader: 从字符输入流中读取文本，缓冲各个字符，从而实现字符、数组和行的高效读取
 * 方法：
 *    BufferedWriter
 *      void newLine()：写一个换行符，这个由系统决定
 *    BufferedReader
 *      String readLine()：一次读取一行数据，但是不读取换行符
 * */
public class BufferedStreamDemo {
    public static void main(String[] args) throws IOException {
//        创建缓冲流对象
//        BufferedWriter bw = new BufferedWriter(new FileWriter("bw.txt"));
//        bw.write("hello");
//        bw.flush();
//        bw.close();
//        创建输入缓冲流对象
//        BufferedReader br = new BufferedReader(new FileReader("c.txt"));
//        int ch;
//        while ((ch = br.read()) != -1) {
//            System.out.print((char) ch);
//        }
//        br.close();
        BufferedWriter bw = new BufferedWriter(new FileWriter("bw2.txt"));
        BufferedReader br = new BufferedReader(new FileReader("bw2.txt"));
        for (int i = 0; i < 10; i++) {
            bw.write("hello" + i);
            bw.newLine(); // ===> bw.write("\r\n")
            bw.flush();
        }
        bw.close();

        String st;
        while ((st = br.readLine()) != null) {
            System.out.print(st);
        }
        br.close();
    }
}
