package com.CollectionDemo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionTest {
    public static void main(String[] args) {
        Collection collection = new ArrayList();
        collection.add("apple");
        collection.add("banana");
        collection.add("orange");
        // 1.0 for增强
        for (Object o : collection) {
            System.out.println(o);
        }
        System.out.println(collection.size());
        // 2.0 Iterator
        /**
         * 使用迭代器（迭代器专门用来遍历集合的一种方式）
         * hasNext(): 判断有没有下一个元素
         * next():获取下一个元素
         * remove():删除当前元素
         * */
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            String string = (String) it.next();
            System.out.println(string);
        }

        System.out.println(collection.contains("apple"));
        System.out.println(collection.isEmpty());
    }
}
