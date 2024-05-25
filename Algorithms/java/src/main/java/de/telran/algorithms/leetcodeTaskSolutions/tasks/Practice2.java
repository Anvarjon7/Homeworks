package de.telran.algorithms.leetcodeTaskSolutions.tasks;

public class Practice2 {
    public static void main(String[] args) {

        int[] nums = {1,3,4,3,1,1,8,1};
        int candidate = majorityElement(nums);
        System.out.println(candidate);
    }

//    TASK - Majority Element

    private static int majorityElement(int[] nums) {
        int count = 0;
        int candidate = nums[0];
        for (int num : nums) {
            if (count == 0){
                candidate = num;
            }
            count += (num == candidate) ? 1 : -1;
        }
        return candidate;
    }
}
