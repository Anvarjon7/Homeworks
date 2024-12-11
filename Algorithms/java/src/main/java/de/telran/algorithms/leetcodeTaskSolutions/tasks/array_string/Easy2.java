package de.telran.algorithms.leetcodeTaskSolutions.tasks.array_string;

import java.util.*;

public class Easy2 {
    public static void main(String[] args) {

//        String word = "HelloO";
//
//        System.out.println(detect(word));
//
//        System.out.println(numberOfSpecialChars(word));
//
//        List<Integer> selfDividingNums = selfDividingNums(4, 20);
//
//        System.out.println(selfDividingNums);

        int[] heights = {1,1,4,2,1,3};

        System.out.println(heightChecker(heights));
    }


    private static boolean detectCapitalUse(String word) {
        if (word.equals(word.toUpperCase())) {
            return true;
        } else if (word.equals(word.toLowerCase())) {
            return true;
        } else return Character.isUpperCase(word.charAt(0))
                && word.substring(1).equals(word.substring(1).toLowerCase());
    }

    private static boolean detect(String word) {

        String capLetters = word.toUpperCase();
        String lowerCaseLetters = word.toLowerCase();
        String firstCap = word.substring(0, 1).toUpperCase() + word.substring(1).toLowerCase();

        return (word.equals(capLetters) || word.equals(lowerCaseLetters) || word.equals(firstCap));
    }


    private static int numberOfSpecialChars(String word) {

        Set<Character> lower = new HashSet<>();
        Set<Character> upper = new HashSet<>();

        int count = 0;

        for (char c : word.toCharArray()) {
            if (Character.isLowerCase(c)) {
                lower.add(c);
            } else if (Character.isUpperCase(c)) {
                upper.add(Character.toLowerCase(c));
            }
        }

        for (char c : lower) {
            if (upper.contains(c)) {
                count++;
            }
        }

        return count;
    }


    private static List<Integer> selfDividingNums(int left, int right) {

        List<Integer> listNums = new ArrayList<>();

        for (int i = left; i <= right; i++) {
            if (isSelfDividing(i)){
                listNums.add(i);
            }
        }

        return listNums;
    }

    private static boolean isSelfDividing(int num) {

        int temp = num;

        while (temp > 0) {
            int digit = temp % 10;

            if (digit == 0 || num % digit != 0) {
                return false;
            }

            temp /= 10;
        }

        return true;
    }

    private static int heightChecker(int[] heights){

        int nums = 0;

        int[] expected = Arrays.copyOf(heights,heights.length);
        Arrays.sort(expected);

        for (int i = 0; i < heights.length; i++) {
            if (heights[i] != expected[i]){
                nums++;
            }
        }

        return nums;
    }


}
