package com.GenericDemo;

/***
 *
 * 泛型方法
 * 语法：<T> 返回值类型
 * */
public class MyGenericMethod {
    public <T> T show(T t) {
        System.out.println("test:" + t);
        return t;
    }
}
