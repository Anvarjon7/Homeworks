package de.telran.algorithms.leetcodeTaskSolutions.tasks.array_string;

import java.util.Arrays;

public class MediumTasks {

    public static void main(String[] args) {

        int[] nums1 = {1,1,1,2,3,4,5,5,5,5};
//        System.out.println(removeDuplicates2(nums1));

        rotate(nums1,5);
        System.out.println(Arrays.toString(nums1));



    }

    private static int removeDuplicates2(int[] num) {

        int k = 1;
        int count = 1;

        for (int i = 1; i < num.length; i++) {
            if (num[i] == num[i - 1]) {
                count++;
            } else {
                count = 1;
            }

            if (count <= 2) {
                num[k] = num[i];
                k++;
            }
        }

        return k;
    }

    private static void rotate(int[] nums,int k){
        k %= nums.length;
        reverse(nums,0,nums.length - 1);
        reverse(nums,0,k-1);
        reverse(nums,k,nums.length - 1);
    }

    private static void reverse(int[] nums, int start, int end){
        while (start < end){
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
}
