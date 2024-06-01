package de.telran.algorithms.leetcodeTaskSolutions.tasks;

import java.util.HashMap;
import java.util.Map;

public class Practice3 {
    public static void main(String[] args) {
        int[] nums = {1, 3, 7, 2, 1};
        int b = canJump2(nums);
        System.out.println(b);

        System.out.println(intToRoman(2001));
    }

//  TASK -  Jump Game

    private static boolean canJump(int[] nums) {

        int farthest = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i > farthest) {
                return false;
            }
            farthest = Math.max(farthest, i + nums[i]);
            if (farthest >= nums.length - 1) {
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
            if (i == cur) {
                jumps++;
                cur = max;
            }
        }
        return jumps;
    }

//    TASK - Roman to Integer

    private static int romanToInt(String s) {
        Map<Character, Integer> romanToVal = new HashMap<>();
        romanToVal.put('I', 1);
        romanToVal.put('V', 5);
        romanToVal.put('X', 10);
        romanToVal.put('L', 50);
        romanToVal.put('C', 100);
        romanToVal.put('D', 500);
        romanToVal.put('M', 1000);

        int result = 0;
        int prevVal = 0;

        for (int i = s.length() - 1; i >= 0; i--) {
            char c = s.charAt(i);
            int val = romanToVal.get(c);

            if (val < prevVal) {
                result -= val;
            } else {
                result += val;
            }
            prevVal = val;
        }
        return result;
    }

//     TASK - Integer to Roman

    private static String intToRoman(int num) {

        String[] symb = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        int[] values = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < values.length && num > 0; i++) {

            while (num >= values[i]) {
                sb.append(symb[i]);
                num -= values[i];
            }
        }
        return sb.toString();
    }
}
