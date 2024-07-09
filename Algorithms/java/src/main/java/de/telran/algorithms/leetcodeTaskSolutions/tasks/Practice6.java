package de.telran.algorithms.leetcodeTaskSolutions.tasks;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

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

        System.out.println(isAnagram(sA, sB));

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
}
