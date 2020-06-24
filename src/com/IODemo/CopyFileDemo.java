package com.IODemo;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CopyFileDemo {
    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("src/com/IODemo/IODemo.java");
        FileWriter fw = new FileWriter("src/com/IODemo/Copy.java");

        int ch;
        while ((ch = fr.read()) != -1) {
            fw.write(ch);
        }
        fr.close();
        fw.close();
    }
}
