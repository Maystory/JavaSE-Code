package com.javabase.day05commonclass;

/**
 * <p>
 *
 *   使用递归的方式 翻转一个字符串
 * </p>
 *
 * @author mf
 * @date 2019-10-16 16:29
 */
public class ReverDemo {

    public static void main(String[] args) {
        String cnm = "hello world";

        System.out.println(reverseStr(cnm));
    }


    private static String reverseStr(String cnm) {

        if (cnm == null || cnm.length() == 1) {
            return cnm;
        }

        return reverseStr(cnm.substring(1)) + cnm.charAt(0);
    }
}
