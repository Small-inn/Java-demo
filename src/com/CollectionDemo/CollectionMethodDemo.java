package com.CollectionDemo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CollectionMethodDemo {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(5);
        list.add(8);
        list.add(20);
        list.add(100);
        System.out.println(list.toString());

        // sort排序
        Collections.sort(list);
        System.out.println(list.toString());
        // binarySearch二分查找
        int i = Collections.binarySearch(list, 10);
        int i2 = Collections.binarySearch(list, 12);
        System.out.println(i);
        System.out.println(i2);

        // copy
        List<Integer> dest = new ArrayList<>();
        for (int k = 0; k < list.size(); k++){
            dest.add(0);
        }
        Collections.copy(dest, list);
        System.out.println(dest);


        // list to array
        Integer[] arr = list.toArray(new Integer[0]);
        System.out.println(Arrays.toString(arr));
        
        // list to set
        String[] str = { "z", "x", "e" };
        List<String> strings = Arrays.asList(str);
        System.out.println(strings);

        // 基本数据类型数组转成集合时，需要修改为包装类型
        Integer[] nums =  {1, 2, 3, 45, 6, 3, 66};
        List<Integer> list2 = Arrays.asList(nums);
        System.out.println(list2);

    }
}
