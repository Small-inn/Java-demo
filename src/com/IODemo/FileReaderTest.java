package com.IODemo;
/**
 * FileReader: 读数据
 *
 * 方法:
 *      int read(): 一次读取一个字符
 *      int read(char): 字符数组
 * */
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
public class FileReaderTest {
    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("b.txt");
        int ch;
//        int ch = fr.read();
//        System.out.println((char) ch);
        while ((ch = fr.read()) != -1) {
            System.out.print((char) ch);
        }
        System.out.print("\r\n");
//      读数据
        FileReader fr1 = new FileReader("fr.txt");

        char[] chs = new char[5];
//      第一次读取
//        int len = fr1.read(chs);
//        System.out.println(len);
//        System.out.println(new String(chs));
//      第二次读取
//        len = fr1.read(chs);
//        System.out.println(len);
//        System.out.println(new String(chs));
//      第三次读取
//        len = fr1.read(chs);
//        System.out.println(len);
//        System.out.println(new String(chs));
//
        int len;
        while ((len = fr1.read(chs)) != -1) {
            System.out.print(new String(chs, 0, len));
        }
    }
}
