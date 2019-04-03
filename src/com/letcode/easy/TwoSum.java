package com.letcode.easy;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

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
 *
 * b1 提交 test
 */
public class TwoSum {

    public static void main(String[] args) {
        int[] nums = new int[]{2, 5, 11, 7, 15};
        int target = 20;
        System.out.println(Arrays.toString(twoSum(nums, target)));
        System.out.println(Arrays.toString(twoSum2(nums, target)));
    }

    /**
     * 暴力法 时间复杂度为O2
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

    /**
     * 网上大师的解法  一次遍历map即可
     *
     * @param nums
     * @param target
     * @return
     */
    public static int[] twoSum2(int[] nums, int target) {
        Map<Integer, Integer> resultMap = new HashMap<>(16);
        for (int i = 0; i < nums.length; i++) {
            int theCome = target - nums[i];
            if (resultMap.containsKey(theCome)) {
                return new int[]{resultMap.get(theCome), i};
            }
            resultMap.put(nums[i], i);
        }
        return null;
    }
}