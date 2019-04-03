package com.letcode.easy;

import javax.xml.bind.SchemaOutputResolver;

/**
 * Created by Maven on 2018/8/31.
 * Description:
 * <p>
 * Example 1:
 * <p>
 * Input: 123
 * Output: 321
 * <p>
 * Example 2:
 * <p>
 * Input: -123
 * Output: -321
 * <p>
 * Example 3:
 * <p>
 * Input: 120
 * Output: 21
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

    public static int reverse2(int x) {
        //最终结果
        int rev = 0;
        while (x != 0) {
            int top = x % 10;
            //防止溢出
            if (rev > Integer.MAX_VALUE / 10 || (rev == Integer.MAX_VALUE / 10 && top > 7)) {
                return 0;
            }
            if (rev < Integer.MIN_VALUE / 10 || (rev == Integer.MIN_VALUE / 10 && top < -8)) {
                return 0;
            }
            //最后一位
            rev = rev * 10 + top;
            x = x / 10;
        }
        return rev;
    }

    public static void main(String[] args) {
        // System.out.println(Integer.MAX_VALUE);
        // System.out.println(reverse(1534236469));
        System.out.println(reverse2(123));
    }
}