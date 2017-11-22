package com.swun.Java8.tenOfdemo;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Demo3 {
    //    public static void filter(String str, Predicate p){
//        if (p.test(str)){
//            System.out.println(str);
//        }
//
//    }
    public static void filter(List<String> names, Predicate predicate) {
        names.stream().filter((name) -> (predicate.test(name))).forEach((name) -> {
            System.out.println("the str is " + name);
        });

    }

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("meifan");
        list.add("hen");
        list.add("shuai");
        System.out.println("-----------华丽的分割线-------");

        filter(list, (s) -> s.equals("shuai"));

    }
}
