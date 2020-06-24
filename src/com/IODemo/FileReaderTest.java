package com.IODemo;
/**
 * FileReader: 读数据
 *
 * 方法:
 *      int read(): 一次读取一个字符
 * */
import java.io.FileReader;
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

    }
}
