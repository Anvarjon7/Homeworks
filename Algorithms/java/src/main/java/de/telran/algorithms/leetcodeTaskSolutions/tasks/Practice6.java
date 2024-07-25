package de.telran.algorithms.leetcodeTaskSolutions.tasks;

import java.util.*;

public class Practice6 {
    public static void main(String[] args) {

        String s = "egg";
        String t = "add";

        System.out.println(isIsomorphic(s, t));

        String pattern = "abba";
        String str = "dog cat cat dog";

        System.out.println(wordPattern(pattern, str));

        String sA = "anagram";
        String sB = "nagaram";

        System.out.println(isAnagram( sA, sB));

        int[] nums = {0,1,2,4,5,7};
        System.out.println(summaryRanges(nums));

    }

    private static boolean isIsomorphic(String s, String t) {
        if (s.length() != t.length()) return false;

        Map<Character, Character> mapST = new HashMap<>();
        Map<Character, Character> mapTS = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char c1 = s.charAt(i);
            char c2 = t.charAt(i);
            if (mapST.containsKey(c1)) {
                if (mapST.get(c1) != c2) {
                    return false;
                }

            } else {
                mapST.put(c1, c2);
            }
            if (mapTS.containsKey(c2)) {
                if (mapTS.get(c2) != c1) {
                    return false;
                }
            } else {
                mapTS.put(c2, c1);
            }
        }
        return true;
    }

    private static boolean wordPattern(String pattern, String s) {

        String[] words = s.split(" ");
        if (pattern.length() != words.length) return false;

        Map<Character, String> patternToWord = new HashMap<>();
        Map<String, Character> wordToPattern = new HashMap<>();

        for (int i = 0; i < pattern.length(); i++) {
            char c = pattern.charAt(i);
            String w = words[i];

            if (patternToWord.containsKey(c)) {
                if (!patternToWord.get(c).equals(w)) {
                    return false;
                }
            } else {
                if (wordToPattern.containsKey(w)) {
                    return false;
                }
            }
            patternToWord.put(c, w);
            wordToPattern.put(w, c);
        }
        return true;
    }

    private static boolean isAnagram(String s, String t) {

        if (s.length() != t.length()) return false;
        char[] sArr = s.toCharArray();
        char[] tArr = t.toCharArray();

        Arrays.sort(sArr);
        Arrays.sort(tArr);

        return Arrays.equals(sArr,tArr);
    }

    private static int[] twoSum(int[] nums, int target){

        Map<Integer,Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int comp = target - nums[i];
            if (map.containsKey(comp)){
                return new int[] {map.get(comp), i};
            }
            map.put(nums[i],i);
        }
        throw new IllegalArgumentException("No two sum solution");
    }

    private static boolean containsNearbyDuplicate(int[] nums,int k) {
        if (nums.length < 2) return false;

        Map<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                int lastIndex = map.get(nums[i]);
                if (i - lastIndex <= k) return true;
            }
            map.put(nums[i],i);
        }
        return false;
    }

    private static List<String> summaryRanges(int[] nums){

//        Arrays.sort(nums);
        List<String> result = new ArrayList<>();

        if (nums.length == 0) {
            return result;
        }

        int start = nums[0];

        for (int i = 1; i <= nums.length; i++) {
            if (i == nums.length || nums[i] != nums[i - 1] + 1) {
                if (start == nums[i - 1]) {
                    result.add(String.valueOf(start));
                } else {
                    result.add(start + "->" + nums[i - 1]);
                }
                if (i < nums.length) {
                    start = nums[i];
                }
            }
        }

        return result;
    }
}
