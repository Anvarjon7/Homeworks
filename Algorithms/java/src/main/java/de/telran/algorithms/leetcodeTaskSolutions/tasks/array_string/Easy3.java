package de.telran.algorithms.leetcodeTaskSolutions.tasks.array_string;

import javax.xml.stream.events.Characters;
import java.lang.reflect.Array;
import java.util.*;

public class Easy3 {

    public static void main(String[] args) {

        char[] s = {'h','e','l','l','o'};

        reverseString(s);

        System.out.println(String.copyValueOf(s));
        System.out.println(reverseVowels("Abror"));
        System.out.println(firstUniqChar("leetcode"));
    }


    private static void reverseString(char[] s){

        int left = 0;
        int right = s.length - 1;

        while (left < right){
            char temp = s[left];
            s[left] = s[right];
            s[right] = temp;

            left++;
            right--;
        }
    }

    private static String reverseVowels(String s){


        Set<Character> vowels = new HashSet<>(
                Arrays.asList('a','o','u','e','i','A','O','U','E','I')
        );
        char[] chars =  s.toCharArray();
        int left = 0, right = chars.length - 1;

        while (left < right){
            while (left < right && !vowels.contains(chars[left])){
                left++;
            }

            while (left < right && !vowels.contains(chars[right])){
                right--;
            }

            char temp = chars[left];
            chars[left] = chars[right];
            chars[right] = temp;

            left++;
            right--;
        }

        return new String(chars);
    }

    private static int firstUniqChar(String s){

        Map<Character,Integer> countChar = new HashMap<>();

        for (char c : s.toCharArray()){
            countChar.put(c, countChar.getOrDefault(c, 0) + 1);
        }
        for (int i = 0; i < s.length(); i++) {
            if (countChar.get(s.charAt(i)) == 1){
                return i;
            }
        }
        return -1;
    }
}
