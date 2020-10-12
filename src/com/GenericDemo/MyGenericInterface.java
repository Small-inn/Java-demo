package com.GenericDemo;

/***
 *
 * 泛型接口
 * 语法：接口名<T>
 * 注意：不能泛型静态常量
 *
 * */
public interface MyGenericInterface<T> {
    T server(T t);
}
