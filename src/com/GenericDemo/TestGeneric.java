package com.GenericDemo;

public class TestGeneric {
    public static void main(String[] args) {
        // 1 泛型只能使用引用类型
        // 2 不同泛型类型对象之间不能相互赋值
        MyGeneric<String> myGeneric = new MyGeneric<String>();
        myGeneric.t = "hello";
        myGeneric.t = "world";
        myGeneric.show("大家好");
        String string = myGeneric.getT();

        // 泛型接口
        MyGenericInterfaceImpl myGenericInterface = new MyGenericInterfaceImpl();
        myGenericInterface.server("sss");

        // 泛型方法
        MyGenericMethod myGenericMethod = new MyGenericMethod();
        String str = myGenericMethod.show("哈哈哈");
        System.out.println(str);
    }
}
