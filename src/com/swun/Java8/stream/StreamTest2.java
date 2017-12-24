package com.swun.Java8.stream;

import org.junit.Test;

import java.util.Arrays;

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

    @Test
    public void test2() {

    }
}
