package de.telran.algorithms.leetcodeTaskSolutions.tasks;

public class Practice3 {
    public static void main(String[] args) {
        int[] nums = {1,3,2,4,5,1,53,5,6,1,8};
        boolean b = canJump(nums);
        System.out.println(b);
    }

//  TASK -  Jump Game

    private static boolean canJump(int[] nums) {

        int farthest = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i > farthest){
                return false;
            }
            farthest = Math.max(farthest,i + nums[i]);
            if (farthest >= nums.length - 1){
                return true;
            }
        }
        return false;
    }
}
