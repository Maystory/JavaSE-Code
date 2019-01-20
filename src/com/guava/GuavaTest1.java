package com.guava;

import com.google.common.base.Joiner;
import com.google.common.base.Preconditions;
import com.google.common.base.Strings;
import com.google.common.collect.ArrayListMultimap;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.*;

/**
 * @author Maven
 * @since 2018-11-15 20:54
 */
public class GuavaTest1 {
    public static void main(String[] args) {
        //1，创建不可变的集合
        System.err.println(LocalDate.now());
        ImmutableList<String> strList = ImmutableList.of("a", "b", "c");
        ImmutableList<Integer> integers = ImmutableList.of(1, 2, 3);
        strList.forEach(System.out::println);
        integers.forEach(System.out::println);
        System.out.println("-----------分割线------------------");

        //2.集合转换
        HashMap<Object, Object> map = Maps.newHashMapWithExpectedSize(4);
        map.put("key1", "value1");
        map.put("key2", "value2");
        map.put("key3", "value3");
        map.put("key4", "value4");
        map.put("key5", "value5");
        map.put("key6", "value6");
        map.put("key7", null);
        System.err.println(map);
        //将map 的value 全都改变
        Map<Object, String> newMap = Maps.transformValues(map, value -> value + "添加上内容");
        System.out.println(newMap);
        System.out.println("-----------分割线------------------");

        //3,当我们需要一个map中包含key为String value为List<Integer>类型的时候
        ArrayListMultimap<String, Integer> multimap = ArrayListMultimap.create();
        multimap.put("aa", 1);
        multimap.put("aa", 2);
        multimap.put("bb", 3);
        multimap.put("bb", 4);
        System.out.println(multimap);
        Map<String, Collection<Integer>> toMap = multimap.asMap();
        System.out.println(toMap);
        Collection<Integer> values = multimap.values();
        System.out.println(values);
        //连接器 按指定的格式连接
        String joinMap = Joiner.on(",").withKeyValueSeparator(":").useForNull("null").join(map);
        System.out.println(joinMap);
        System.out.println("-----------分割线------------------");

        //4,将集合连接成指定的字符串
        ArrayList<String> nihaoList = Lists.newArrayList("ni",null, "hao", "mf");
        String joinList = Joiner.on("-").useForNull("null").join(nihaoList);
        System.out.println(joinList);
        System.out.println("-----------分割线------------------");


        //5,检查参数
        String ex1 = "";
        String ex2 = null;
        String ex3 = "    ";
        System.out.println(Strings.isNullOrEmpty(ex1));
        System.out.println(Strings.isNullOrEmpty(ex2));
        System.out.println(Strings.isNullOrEmpty(ex3));
        System.out.println(Strings.nullToEmpty(ex2));
        int count = 10;
        // Preconditions.checkArgument(count>30,"cont不大于30！");
        Preconditions.checkNotNull(ex2);

       //6 JDK 1.8 遍历Map
        Map<String, Integer> hashMap = new HashMap<>(16);
        hashMap.put("k1", 1);
        hashMap.put("k2", 2);
        hashMap.put("k3", 3);
        hashMap.forEach((k,v)->{
            System.out.println(k);
            System.out.println(v);
        });


    }
}