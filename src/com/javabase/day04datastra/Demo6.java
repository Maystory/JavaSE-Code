package com.javabase.day04datastra;

import java.util.*;

/**
 * @author Maven
 * @date 2018/9/26
 * Description:
 */
public class Demo6 {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("k1", "v1");
        map.put("k2", "v2");
        map.put("k3", "v3");
        map.put("k4", "v4");
        // System.out.println(map);

        // Set<String> keySet = map.keySet();
        // System.out.println(keySet);
        // Collection<String> values = map.values();
        // System.out.println(values);
        Set<Map.Entry<String, String>> entries = map.entrySet();
        System.out.println(entries);
        for (Map.Entry<String, String> entry : entries) {
            System.out.println(entry.getKey() + "->" + entry.getValue());
        }

        List<String> stringList = new ArrayList<>();
        Set<String> stringSet = new HashSet<>();
        //list 和 set  互相转换
        System.out.println(new ArrayList<>(stringSet));
        System.out.println(new HashSet<>(stringList));

    }
}