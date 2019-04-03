package com.letcode.easy;

import java.util.Objects;

/**
 * @author Maven
 * @since 2019-01-25 14:33
 * <p>
 * <p>
 * Determine whether an integer is a palindrome. An integer is a palindrome when it reads the same backward as forward.
 * <p>
 * Example 1:
 * <p>
 * Input: 121
 * Output: true
 * Example 2:
 * <p>
 * Input: -121
 * Output: false
 * Explanation: From left to right, it reads -121. From right to left, it becomes 121-. Therefore it is not a palindrome.
 * Example 3:
 * <p>
 * Input: 10
 * Output: false
 * Explanation: Reads 01 from right to left. Therefore it is not a palindrome.
 */
public class NumberIsPalindrome {

    public static boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }
        StringBuilder reverse = new StringBuilder(String.valueOf(x)).reverse();
        return String.valueOf(x).equals(reverse.toString());

    }

    public static void main(String[] args) {
        System.out.println(isPalindrome(123));

    }
}