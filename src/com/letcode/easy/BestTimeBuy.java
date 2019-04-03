package com.letcode.easy;

/**
 * @author mf
 * @since 2019-03-27 21:19
 * <p>
 * Say you have an array for which the ith element is the price of a given stock on day i.
 * <p>
 * If you were only permitted to complete at most one transaction (i.e., buy one and sell one share of the stock), design an algorithm to find the maximum profit.
 * <p>
 * Note that you cannot sell a stock before you buy one.
 * <p>
 * Example 1:
 * <p>
 * Input: [7,1,5,3,6,4]
 * Output: 5
 * Explanation: Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = 6-1 = 5.
 * Not 7-1 = 6, as selling price needs to be larger than buying price.
 * Example 2:
 * <p>
 * Input: [7,6,4,3,1]
 * Output: 0
 * Explanation: In this case, no transaction is done, i.e. max profit = 0.
 */
public class BestTimeBuy {


    public static void main(String[] args) {
        int[] prices = {7, 1, 5, 3, 6, 4};
        int[] price2 = {1,4,2};
        System.out.println(new BestTimeBuy().maxProfit(prices));

    }

    public int maxProfit(int[] prices) {
        int left = 0;
        int right = prices.length - 1;

        int maxProfit = 0;

        while (right - left > 0) {
            int ret = prices[right] - prices[left];
            if (ret > maxProfit) {
                maxProfit = ret;
            }
            right--;
        }
        return maxProfit;


    }
}