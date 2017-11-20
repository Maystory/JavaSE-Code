package com.swun.Java8.chapter1;

import java.util.*;

public class AppleMain {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("hello","nima","cc","woca","hehe","aa","bb");
//        Collections.sort(names, new Comparator<String>() {
//            @Override
//            public int compare(String o1, String o2) {
//                return o1.compareTo(o2);
//            }
//        });
//        System.out.println(names);
        Collections.sort(names,(a,b)->b.compareTo(a));
        System.out.println(names);


    }
}
