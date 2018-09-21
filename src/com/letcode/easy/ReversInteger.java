package com.letcode.easy;

import javax.xml.bind.SchemaOutputResolver;

/**
 * Created by Maven on 2018/8/31.
 * Description:
 * <p>
 * <p>
 * Given a 32-bit signed integer, reverse digits of an integer.
 * <p>
 * Example 1:
 * <p>
 * Input: 123
 * Output: 321
 */
public class ReversInteger {

    public static int reverse(int x) {
        if (x > Integer.MAX_VALUE || x < Integer.MIN_VALUE) {
            return 0;
        }
        String origin = x + "";
        if (origin.startsWith("-")) {
            origin = origin.substring(1);
            StringBuilder str = new StringBuilder(origin);
            String reverse = str.reverse().toString();
            while (reverse.startsWith("0")) {
                reverse = reverse.substring(1);
            }
            try {
                int i = Integer.parseInt(reverse);
                return -i;
            } catch (NumberFormatException e) {
                return 0;
            }

        } else if (origin.equals("0")) {
            return 0;
        } else {
            StringBuilder str = new StringBuilder(origin);
            String reverse = str.reverse().toString();
            while (reverse.startsWith("0")) {
                reverse = reverse.substring(1);
            }
            try {
                int i = Integer.parseInt(reverse);
                return -i;
            } catch (NumberFormatException e) {
                return 0;
            }

        }
    }

    public static void main(String[] args) {
        System.out.println(Integer.MAX_VALUE);
        System.out.println(reverse(1534236469));
    }
}