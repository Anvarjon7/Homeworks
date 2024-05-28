package de.telran.algorithms.leetcodeTaskSolutions.tasks;

public class Practice2 {
    public static void main(String[] args) {

        int[] nums = {7,1,5,3,6,4};
        int candidate = maxProfit2(nums);
        System.out.println(candidate);

    }

//    TASK - Majority Element

    private static int majorityElement(int[] nums) {
        int count = 0;
        int candidate = nums[0];
        for (int num : nums) {
            if (count == 0) {
                candidate = num;
            }
            count += (num == candidate) ? 1 : -1;
        }
        return candidate;
    }

//    TASK - Rotate Array

    public static void rotate(int[] nums, int k) {
        k %= nums.length;
        reverse(nums, 0, nums.length - 1);
        reverse(nums, 0, k - 1);
        reverse(nums, k, nums.length - 1);
    }

    private static void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }

//    TASK - Best Time to Buy and Sell Stock

    public static int maxProfit(int[] prices) {
        int min_price = Integer.MAX_VALUE;
        int max_profit = 0;
        for (int price : prices) {
            if (price < min_price) {
                min_price = price;
            } else if (price - min_price > max_profit) {
                max_profit = price - min_price;
            }
        }
        return max_profit;
    }

    //    TASK - Best Time to Buy and Sell Stock ||

    public static int maxProfit2(int[] prices) {
        int maximum = 0;

        for (int i = 1; i < prices.length; i++) {
            if (prices[i] > prices[i - 1]) {
                maximum += prices[i] - prices[i - 1];
            }
        }
        return maximum;
    }

}
