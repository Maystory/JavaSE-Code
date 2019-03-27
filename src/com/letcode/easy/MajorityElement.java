package com.letcode.easy;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * @author mf
 * @since 2019-03-27 16:07
 *
 * Given an array of size n, find the majority element. The majority element is the element that appears more than ⌊ n/2 ⌋ times.
 *
 * You may assume that the array is non-empty and the majority element always exist in the array.
 *
 * Example 1:
 *
 * Input: [3,2,3]
 * Output: 3
 * Example 2:
 *
 * Input: [2,2,1,1,1,2,2]
 * Output: 2
 */
public class MajorityElement {

    public static void main(String[] args) {
        int nums[] = {3,2,3};
        System.out.println(new MajorityElement().majorityElement(nums));

    }

    public int majorityElement(int[] nums) {

        Arrays.sort(nums);
        return nums[nums.length / 2];
    }


}