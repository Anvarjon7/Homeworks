package de.telran.algorithms.leetcodeTaskSolutions.tasks;

import java.util.List;

public class Practice5 {
    public static void main(String[] args) {

        String[] words = {"flower", "flow", "flight"};
        System.out.println(lengthOfLastWord("Hello World"));
        System.out.println(longestCommonPrefix(words));

        System.out.println(strStr("leetcode", "o"));

        System.out.println(isPalindrome("A man, a plan, a canal: Panama"));

        System.out.println(isSubsequence("abc","ahbgdc"));

        System.out.println(canConstruct("ab","ahbgdc"));

        System.out.println(getCount("abracadabra"));
    }

    private static int lengthOfLastWord(String s) {

        s = s.trim();
        String[] words = s.split("\\s+");
        String lastWord = words[words.length - 1];

        return lastWord.length();
    }

    private static String longestCommonPrefix(String[] words) {
        if (words == null || words.length == 0) {
            return "";
        }
        String prefix = words[0];
        for (int i = 1; i < words.length; i++) {
            while (words[i].indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length() - 1);
                if (prefix.isEmpty()) {
                    return "";
                }
            }
        }
        return prefix;
    }

    private static int strStr(String haystack, String needle) {
        if (haystack == null || needle == null) {
            return 0;
        }
        if (needle.isEmpty()) {
            return 0;
        }

        for (int i = 0; i <= haystack.length() - needle.length(); i++) {
            int j;
            for (j = 0; j < needle.length(); j++) {
                if (haystack.charAt(i + j) != needle.charAt(j)) {
                    break;
                }
            }
            if (j == needle.length()) {
                return i;
            }
        }
        return -1;
    }

    private static boolean isPalindrome(String s) {
        if (s == null || s.isEmpty()) {
            return true;
        }

        StringBuilder builder = new StringBuilder();

        for (char c : s.toCharArray()) {
            if (Character.isLetterOrDigit(c)) {
                builder.append(Character.toLowerCase(c));
            }
        }

        String filteredStr = builder.toString();

        return filteredStr.contentEquals(builder.reverse());
    }

    private static boolean isSubsequence(String a, String b) {
        if (a == null || b == null) {
            return false;
        }
        int aIndex = 0;
        int bIndex = 0;

        while(aIndex < a.length() && bIndex < b.length()) {
            if (a.charAt(aIndex) == b.charAt(bIndex)){
                aIndex++;
            }
            bIndex++;
        }
        return aIndex == a.length();
    }


    private static boolean canConstruct(String ransomNote, String magazine) {

        int[] magazineCount = new int[26];
        for (char c : magazine.toCharArray()){
            magazineCount[c - 'a']++;
        }

        for (char c : ransomNote.toCharArray()){
            if (magazineCount[c - 'a'] == 0){
                return false;
            }
            magazineCount[c - 'a']--;
        }
        return true;
    }

    private static int getCount(String str){

        int count = 0;

        String vowels = "aeiou";

        for (char c : str.toCharArray()){
            if (vowels.contains(String.valueOf(c))){
                count++;
            }
        }
        return count;
    }



}



























