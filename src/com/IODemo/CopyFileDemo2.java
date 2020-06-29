package com.IODemo;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CopyFileDemo2 {
    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("src/com/IODemo/IODemo.java");
        FileWriter fw = new FileWriter("src/com/IODemo/Copy.java");
        char[] chs =  new char[1024];
        int len;
        while ((len = fr.read(chs)) != -1) {
            fw.write(chs, 0, len);
        }
        fr.close();
        fw.close();
    }
}
