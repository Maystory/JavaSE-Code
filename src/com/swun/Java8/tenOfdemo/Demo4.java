package com.swun.Java8.tenOfdemo;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Demo4 {
    public static void main(String[] args){
        List<String> names = new ArrayList<>();
        names.add("meifan");
        names.add("hen");
        names.add("mshuai");

        Predicate<String> p1 = (s)->s.startsWith("m");
        Predicate<String> p2 = (s)->s.length()>2;

        names.stream().filter(p1.and(p2)).forEach((name)->System.out.println("yes is --"+name));
    }
}
