package com.IODemo;

import java.io.FileWriter;
import java.io.IOException;

/**
 *  FileWriter方法：
 *      void write(String str): 写一个字符串数据
 *      void write(String str, int index, int len): 写一个字符串的部分数据
 *      void write(int ch)：写一个字符数据
 *      void write(char[] chs, int index, int len)：写一个字符数组的一部分数据
 *
 *      数据换行：\n、windows: \r\n,linux: \n, mac: \r
 *      数据的追加写入：
 *
 * */
public class FileWriterTest {
    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("b.txt");
//        fw.write("abcdefg", 0, 5);
//        fw.write('a');
//        fw.write(97);
        char[] chs = {'a', 'b', 'c', 'd', 'e'};
        fw.write(chs, 2, 3);
        fw.close();
    }
}
