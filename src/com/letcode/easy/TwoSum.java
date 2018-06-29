package com.letcode.easy;

import java.util.Arrays;

/**
 * 描述:
 * 给定一个整数数组和一个目标值，找出数组中和为目标值的两个数。
 * 你可以假设每个输入只对应一种答案，且同样的元素不能被重复利用
 * 给定 nums = [2, 7, 11, 15], target = 9
 * 因为 nums[0] + nums[1] = 2 + 7 = 9
 * 所以返回 [0, 1]
 *
 * @outhor mf
 * @create 2018-06-29 20:19
 */
public class TwoSum {

    public static void main(String[] args) {
        int[] nums = new int[]{2, 5, 11, 7, 15};
        int target = 20;
        System.out.println(Arrays.toString(twoSum(nums, target)));
    }

    /**
     * 暴力法 时间复杂度为O2
     * 简化方式请使用         HashMap
     *
     * @param nums
     * @param target
     * @return
     */
    public static int[] twoSum(int[] nums, int target) {
        int[] datas = new int[2];
        for (int i = 0; i < nums.length; i++) {
            int j = i + 1;
            while (j < nums.length) {
                if (nums[i] + nums[j] == target) {
                    datas[0] = i;
                    datas[1] = j;
                }
                j++;
            }
        }
        return datas;
    }
}