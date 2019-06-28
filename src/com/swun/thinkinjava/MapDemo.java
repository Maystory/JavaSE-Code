package com.swun.thinkinjava;

import com.google.common.collect.Lists;
import com.sun.xml.internal.ws.api.model.ExceptionType;
import com.taobao.api.ApiException;
import sun.jvm.hotspot.debugger.AddressException;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * 描述:
 *
 * @outhor my
 * @create 2018-06-25 20:42
 */
public class MapDemo {

    public static void main(String[] args) {
        // // HashMap<Object, Object> map  = new HashMap<>();
        // // map.put("k1","v1");
        // // System.out.println(map);
        // List<String> stringList = new ArrayList<>();
        // stringList.add("hello");
        // stringList.add("tr");
        // stringList.add("zz");
        // // stringList.add(null);
        // // stringList.forEach(s -> {
        // //     if (Objects.nonNull(s)) {
        // //         System.out.println(s);
        // //     }
        // // });
        // String result = stringList.stream().collect(Collectors.joining(","));
        //
        // System.out.println(result);

        // String str = "+8613548114049";
        //
        // str.matches("^((\\+86)|(86))?(13)\\d{9}$");
        //
        // System.out.println(str.matches("^((\\+86)|(86))?(13)\\d{9}$"));
        // System.out.println(str.charAt(str.indexOf("+86")));
        // System.out.println(str.substring(str.indexOf("+86")+3));

        // System.out.println("-123".);

        List<String> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add("i-" + i);
        }

        // List<List<String>> partition = Lists.partition(list, 4);
        // for (List<String> strings : partition) {
        //     System.out.println(strings);
        // }


//         List<List<String>> splitList = Stream.iterate(0, n -> n + 1).limit(limit).parallel().map(a -> {
//
//  List<String> sendList = list.stream().skip(a * MAX_SEND).limit(MAX_SEND).parallel().collect(Collectors.toList());
//
//         }).collect(Collectors.toList());

        // List<List<Integer>> splitList = Stream.iterate(0, n -> n + 1).limit(limit).parallel().map(a -> list.stream().skip(a * MAX_NUMBER).limit(MAX_NUMBER).parallel().collect(Collectors.toList())).collect(Collectors.toList());



    }

}