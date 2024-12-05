package de.telran.algorithms.leetcodeTaskSolutions.tasks.array_string;

import java.util.Arrays;

public class EasyTasks {
    public static void main(String[] args) {

        int[] nums1 = {1, 3, 5, 0, 0, 0};
        int[] nums2 = {2, 4, 8, 8, 8,};
//        merge(nums1, 3, nums2, 3);



//        System.out.println(removeElement(nums1,3));
//        System.out.println(Arrays.toString(nums1));
        System.out.println(majorityElem(nums2));

    }

    private static void merge(int[] num1, int n, int[] num2, int m) {
        int p1 = m - 1;
        int p2 = n - 1;
        int p = n + m - 1;

        while (p1 >= 0 && p2 >= 0) {
            if (num1[p1] > num2[p2]) {
                num1[p] = num1[p1];
                p1--;
            } else {
                num1[p] = num2[p2];
                p2--;
            }
            p--;
        }

        while (p2 >= 0) {
            num1[p] = num2[p2];
            p2--;
            p--;
        }
    }

    private static int removeElement(int[] nums, int val){

        int k = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val){
                nums[k] = nums[i];
                k++;
            }
        }
        return k;
    }

    private static int removeDuplicates(int[] nums){

        int k = 1;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[k - 1]){
                nums[k] = nums[i];
                k++;
            }
        }
        return k;
    }

    private static int majorityElem(int[] nums){
        int count = 0;
        int candidate = nums[0];
        for (int num : nums){
            if (count == 0){
                candidate = num;
            }
            count += (num == candidate) ? 1 : -1;
        }
        return candidate;
    }


}
