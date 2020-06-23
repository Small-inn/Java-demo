package com.IODemo;

import java.io.FileWriter;
import java.io.IOException;

/**
 * IO流用来处理设备之间的数据传输，文件复制，上传文件，下载文件
 * 分类：
 *      - 输出流
 *          FileWriter(往文件中写数据)
 *          fileWriter(String fileName): 传递一个文件名称
 *          输出流写数据步骤：
 *              A: 创建输出流对象
 *              B: 调用输出流对象的写数据方法
 *              C: 释放资源
 *      - 输入流
 *          FileReader
 * */
public class IODemo {
    public static void main(String[] args) throws IOException { // IO流异常
        FileWriter fw = new FileWriter("a.txt");
        /**
         * 创建出流对象做了哪些？
         *      A:调用系统资源创建一个文件
         *      B:创建输出流对象
         *      C:把输出流对象指向文件
         * */
        fw.write("IO流你好"); // 数据没有直接写到文件，其实是写到了内存缓冲区
        fw.flush(); // 刷新一下
        fw.close(); // 释放资源
    }
}
