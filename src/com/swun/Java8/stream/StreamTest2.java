package com.swun.Java8.stream;

import org.junit.Test;

import java.util.Arrays;
import java.util.stream.Stream;

/**
 * Stream的常用方法
 */
public class StreamTest2 {
    /**
     * filter()   distinc()
     */
    @Test
    public void test1() {
        //过滤出长度大于2的字符串
        String[] strings = new String[]{"ewr", "543", "1", "5", "teret"};
        Arrays.stream(strings).filter(s -> s.length() > 2).forEach(System.out::println);
        System.out.println("------------");


        //过滤出所有以数字开头的字符串
        String[] string2 = new String[]{"2ewr", "gz43", "1", "5", "teret"};
        Arrays.stream(string2).filter(x -> Character.isDigit(x.charAt(0))).forEach(System.out::println);
        System.out.println("------------");

        //过滤重复的数据(把流中的重复数据合并)
        String[] string3 = new String[]{"1", "5", "1", "5", "1", "5", "5"};
        Arrays.stream(string3).distinct().forEach(System.out::println);

    }

    /**
     * map 把一种类型的流转换成另一种类型的流
     */
    @Test
    public void test2() {
        String[] strs = new String[]{"Yes", "yEs", "no", "sf", "yi"};
        Arrays.stream(strs).map(String::toUpperCase).forEach(System.out::println);

        User[] users = new User[]{new User("A", 34), new User("B", 35), new User("C", 33)};
        System.out.println("------------");
        //将User对象流转换成了Int 对象流
        Arrays.stream(users).map(User::getAge).forEach(System.out::println);
    }

    /**
     * flatMap
     */
    @Test
    public void test3() {
        String[] arr1 = new String[]{"a", "b", "c"};
        String[] arr2 = new String[]{"j", "e", "f"};
        String[] arr3 = new String[]{"i", "a", "g"};
        /**
         * 把数组流 转换成了一个字符串流
         */
        Stream.of(arr1, arr2, arr3).flatMap(arr -> Arrays.stream(arr)).forEach(System.out::println);

    }
}
