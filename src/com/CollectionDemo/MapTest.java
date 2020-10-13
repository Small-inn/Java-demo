package com.CollectionDemo;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapTest {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("CN", "中国");
        map.put("USA", "美国");
        map.put("UK", "英国");

        // 遍历
        Set<String> keySet = map.keySet();
        for (String s : keySet) {
            System.out.println(s + "==" + map.get(s));
        }


        Set<Map.Entry<String, String>> entries = map.entrySet();
        for (Map.Entry<String, String> entry : entries) {
            System.out.println(entry.getKey() + "===" + entry.getValue());
//            System.out.println(entry);
        }
    }
}
