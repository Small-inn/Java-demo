package com.IODemo;

import java.io.*;

public class CopyFileDemo3 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("c.txt"));
        BufferedWriter bw = new BufferedWriter(new FileWriter("d.txt"));

        String st;
        while ((st = br.readLine()) != null) {
            bw.write(st);
            bw.newLine();
            bw.flush();
        }
        br.close();
        bw.close();
    }
}
