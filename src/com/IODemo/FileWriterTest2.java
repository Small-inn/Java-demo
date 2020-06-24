package com.IODemo;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterTest2 {
    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("c.txt");
        for (int i = 0; i < 10; i++) {
            fw.write("hello" + i);
            fw.write("\r\n");
        }
//      释放资源
        fw.close();
    }
}
