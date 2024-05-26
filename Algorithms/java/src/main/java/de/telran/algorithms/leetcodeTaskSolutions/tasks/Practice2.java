package de.telran.algorithms.leetcodeTaskSolutions.tasks;

public class Practice2 {
    public static void main(String[] args) {

        int[] nums = {1, 0, 0, 1, 5};
        int candidate = majorityElement(nums);
        System.out.println(candidate);

        rotate(nums, 2);
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
}
