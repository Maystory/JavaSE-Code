package com.swun.Java8.chapter1;

public class ConvertTest {
    public static void main(String[] args) {
//        Converter<String,Integer> converter = (from)->Integer.parseInt(from);
//        Integer i  = converter.convert("5435");
//        System.out.println(i);
        Converter<String,Integer> converter = Integer::valueOf;
        Integer i = converter.convert("5435");
        System.out.println(i);
        /**
         * ------------华丽的分割线------------
         */
        SomeThing someThing = new SomeThing();

        Converter<String,String> c = someThing::getSomeThing;
        System.out.println(c.convert("hello"));

    }
}

