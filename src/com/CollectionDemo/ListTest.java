package com.CollectionDemo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ListTest {
    public static void main(String[] args) {
        List list = new ArrayList();

        list.add(0, "Apple");
        list.add(1, "小米");
        list.add(2, "华为");
        list.add(3, "中兴");

        System.out.println(list.size());
        System.out.println(list.toString());
//        for (Object o : list) {
//            System.out.println(o);
//        }
//
//        Iterator it = list.iterator();
//        while (it.hasNext()) {
//            System.out.println(it.next());
//        }

        // 列表迭代器, ListIterator可以向前或者向后遍历、添加、删除、修改
        ListIterator lit = list.listIterator();
        while (lit.hasNext()) {
            System.out.println(lit.nextIndex() + ":" + lit.next());
        }
        System.out.println(lit.hasPrevious());
        while (lit.hasPrevious()) {
            System.out.println(lit.previousIndex() + ":" + lit.previous());
        }
    }
}
