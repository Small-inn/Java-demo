package com.ObjectDemo;


public class ObjectTest {
    public static void main(String[] args) {
        ObjectDemo[] od = new ObjectDemo[3];

        ObjectDemo od1 = new ObjectDemo("lx", 20);
        ObjectDemo od2 = new ObjectDemo("hh", 18);
        ObjectDemo od3 = new ObjectDemo("xx", 22);

        od[0] = od1;
        od[1] = od2;
        od[2] = od3;

        for (int i = 0; i < od.length; i++) {
            ObjectDemo obj = od[i];
            System.out.println(obj.getAge() + "---" + obj.getName());
        }
    }
}
