package de.telran.algorithms.leetcodeTaskSolutions.tasks;

public class Practice3 {
    public static void main(String[] args) {
        int[] nums = {1,3,2,2,1};
        int b = canJump2(nums);
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

//    TASK - Jump Game ||

    private static int canJump2(int[] nums) {

        int jumps = 0;
        int max = 0;
        int cur = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            max = Math.max(max, i + nums[i]);
            if (i == cur){
                jumps++;
                cur = max;
            }
        }
        return jumps;
    }
}
