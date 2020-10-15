package com.CollectionDemo;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
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

        // 2.0
        /***
         *
         * 使用key hashcode和equals作为重复
         * */
        HashMap<Immortal, String> immortals = new HashMap<>();
        Immortal s1 = new Immortal("s", 100);
        Immortal s2 = new Immortal("z", 101);
        Immortal s3 = new Immortal("w", 102);

        immortals.put(s1, "北京");
        immortals.put(s2, "上海");
        immortals.put(s3, "南京");

        immortals.put(new Immortal("w", 102), "南京");

        System.out.println(immortals.size());
        System.out.println(immortals.toString());

        // 删除
//        immortals.remove(s1);

        for (Immortal immortal : immortals.keySet()) {
            System.out.println(immortal);
        }

        for (Map.Entry<Immortal, String> immortalStringEntry : immortals.entrySet()) {
            System.out.println(immortalStringEntry);
        }

    }
}

class Immortal {
    private String name;
    private int id;

    public Immortal(String s, int i) {
        this.name = s;
        this.id = i;
    }

    @Override
    public String toString() {
        return "Immortal{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Immortal immortal = (Immortal) o;
        return id == immortal.id &&
                Objects.equals(name, immortal.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, id);
    }
}


