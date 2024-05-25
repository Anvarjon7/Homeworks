package de.telran.algorithms.leetcodeTaskSolutions.tasks;

public class Solution {
    public static void main(String[] args) {

        int[] nums = {0, 1, 2, 4, 3, 2, 4, 2};
//        System.out.println(removeElement(nums,2));

//        ============================================

        int k = removeDuplicates2(nums);
        System.out.println(k);

    }

    // TASK - remove element

    public static int removeElement(int[] nums, int val) {
        int k = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[k] = nums[i];
                k++;
            }
        }
        return k;
    }

    // TASK - remove duplicates from sorted array

    public static int removeDuplicates(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        int k = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[k - 1]) {
                nums[k] = nums[i];
                k++;
            }
        }
        return k;
    }

    // TASK - remove duplicates from sorted array ||

    public static int removeDuplicates2(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        int k = 1;
        int count = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i - 1]) {
                count++;
            } else {
                count = 1;
            }

            if (count <= 2) {
                nums[k] = nums[i];
                k++;
            }
        }
        return k;
    }

}
