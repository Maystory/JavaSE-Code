package com.letcode.easy;

import java.util.*;

/**
 * Given a non-empty array of integers, return the k most frequent elements.
 * <p>
 * Example 1:
 * <p>
 * Input: nums = [1,1,1,2,2,3], k = 2
 * Output: [1,2]
 * Example 2:
 * <p>
 * Input: nums = [1], k = 1
 * Output: [1]
 *
 * @author mf
 * @since 2019-03-25 21:57
 */
public class TheTopKFrequentElements {

    public static void main(String[] args) {
        int[] nums = {1, 1, 1, 1, 1, 1, 3, 5, 5, 4, 6, 7};
        System.out.println(new TheTopKFrequentElements().topKFrequent(nums, 2));
        ;

        // int[] nums2 = {1, 3, 4, 5, 6, 7};
        // System.out.println(new TheTopKFrequentElements().get(nums2));
    }

    public List<Integer> topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> count = new HashMap<>();
        for (int num : nums) {
            count.put(num, count.getOrDefault(num, 0) + 1);
        }

        PriorityQueue<Integer> heap = new PriorityQueue<>((o1, o2) -> count.get(o2) - count.get(o1));

        for (int n : count.keySet()) {
            heap.add(n);
            // if (heap.size() > k) {
            //     heap.poll();
            // }
        }
        List<Integer> result = new LinkedList<>();
        // while (heap.peek() != null) {
        //     System.out.println(heap.poll());
        // }

        // while (heap.peek() != null) {
        //     result.add(heap.poll());
        // }
        // Collections.reverse(result);
        System.out.println(heap);
        return result;

    }


}