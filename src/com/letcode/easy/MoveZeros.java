package com.letcode.easy;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

/**
 * @author mf
 * @since 2019-03-26 16:42
 * <p>
 * Given an array nums, write a function to move all 0's to the end of it while maintaining the relative order of the non-zero elements.
 * <p>
 * Example:
 * <p>
 * Input: [0,1,0,3,12]
 * Output: [1,3,12,0,0]
 * Note:
 * <p>
 * You must do this in-place without making a copy of the array.
 * Minimize the total number of operations.
 */
public class MoveZeros {

    public static void main(String[] args) {
        int[] nums = {0, 1, 0, 3, 12, 1, 4, 7, 0};
        new MoveZeros().moveZeroes(nums);
        System.out.println(Arrays.toString(nums));


    }

    public void moveZeroes(int[] nums) {
        Queue<Integer> queue = new LinkedList();
        for (int num : nums) {
            if (num != 0) {
                queue.add(num);
            }
        }

        for (int i = 0; i < nums.length; i++) {
            if (queue.peek() != null) {
                nums[i] = queue.poll();
            } else {
                nums[i] = 0;
            }
        }


    }


}