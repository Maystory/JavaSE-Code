package com.swun.duoxiancheng.demo;

import com.swun.Java8.stream.User;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 描述:
 *
 * @outhor my
 * @create 2018-03-30 17:37
 */
public class DemoStr {
    public static void main(String[] args) {
        String str = "[\"247900001\",\"247900002\"]";
//        parse(str);

        System.out.println(Integer.parseInt(System.currentTimeMillis()/1000+""));

    }

    public static void parse(String string) {
        String replace = string.replace("\"", "").
                                replace("[","").
                                replace("]","");

        String[] split = replace.split(",");
        for (String s : split) {
            System.out.println(s);
        }
    }
}