package de.telran.algorithms.leetcodeTaskSolutions.tasks.array_string;

import java.time.LocalDateTime;
import java.util.*;

public class Easy4 {

    public static void main(String[] args) {

        String s = "abcd";
        String t = "abcde";
        System.out.println(findTheDifference(s, t));

        System.out.println(judgeCircle("LL"));
        String[] list1 = {"Shogun", "Tapioca Express", "Burger King", "KFC"};
        String[] list2 = {"KFC", "Shogun", "Burger King"};


        System.out.println(Arrays.toString(findRestaurant(list1, list2)));

        System.out.println(countBinarySubstrings("00110011"));
        String[] words = {"step", "steps", "stripe", "stepple"};

        System.out.println(shortestCompletingWord("1s3 PSt", words));

        System.out.println(reverseWords("Mr Ding"));


        System.out.println(Arrays.toString(shortestToChar("loveleetcode", 'e')));

        System.out.println(dayOfYear("2019-03-09"));


    }

    private static char findTheDifference(String s, String t) {

        int result = 0;

        for (char c : s.toCharArray()) {
            result ^= c;
        }

        for (char c : t.toCharArray()) {
            result ^= c;
        }

        return (char) result;
    }

    private static boolean judgeCircle(String moves) {

        int x = 0;
        int y = 0;

        for (char c : moves.toCharArray()) {
            if (c == 'R') {
                x++;
            }
            if (c == 'L') {
                x--;
            }
            if (c == 'U') {
                y++;
            }
            if (c == 'D') {
                y--;
            }
        }

        return x == 0 && y == 0;
    }

    private static String[] findRestaurant(String[] list1, String[] list2) {

        Map<String, Integer> map = new HashMap<>();
        List<String> res = new ArrayList<>();
        int minIndexSum = Integer.MAX_VALUE;

        for (int i = 0; i < list1.length; i++) {
            map.put(list1[i], i);
        }

        for (int j = 0; j < list2.length; j++) {
            if (map.containsKey(list2[j])) {
                int indexSum = j + map.get(list2[j]);
                if (indexSum < minIndexSum) {
                    res.clear();
                    ;
                    res.add(list2[j]);
                    minIndexSum = indexSum;
                } else if (indexSum == minIndexSum) {
                    res.add(list2[j]);
                }
            }
        }
        return res.toArray(new String[0]);
    }

    private static int countBinarySubstrings(String s) {

        int cur = 1, pre = 0, res = 0;
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == s.charAt(i - 1)) cur++;
            else {
                res += Math.min(cur, pre);
                pre = cur;
                cur = 1;
            }
        }
        return res + Math.min(cur, pre);
    }

    private static String toLowerCase(String s) {

        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) >= 65 || s.charAt(i) <= 90) {
                builder.append((char) (s.charAt(i) + 32));
            } else {
                builder.append(s.charAt(i));
            }
        }

        return builder.toString();
    }

    private static String shortestCompletingWord(String licensePlate, String[] words) {

        Map<Character, Integer> plateLetterCount = new HashMap<>();

        for (char c : licensePlate.toCharArray()) {
            if (Character.isLetter(c)) {
                char lower = Character.toLowerCase(c);
                plateLetterCount.put(lower, plateLetterCount.getOrDefault(lower, 0) + 1);
            }
        }
        String result = "";

        for (String word : words) {
            if (isCompletingWord(word, plateLetterCount)) {
                if (result.isEmpty() || word.length() < result.length()) {
                    result = word;
                }
            }
        }
        return result;
    }

    private static boolean isCompletingWord(String word, Map<Character, Integer> plateLetterCount) {

        Map<Character, Integer> wordLetterCount = new HashMap<>();

        for (char c : word.toCharArray()) {
            char lowerChar = Character.toLowerCase(c);
            if (Character.isLetter(lowerChar)) {
                wordLetterCount.put(lowerChar, wordLetterCount.getOrDefault(lowerChar, 0) + 1);
            }
        }

        for (Map.Entry<Character, Integer> entry : plateLetterCount.entrySet()) {
            char letter = entry.getKey();
            int requiredCount = entry.getValue();
            if (wordLetterCount.getOrDefault(letter, 0) < requiredCount) {
                return false;
            }
        }

        return true;
    }

    private static String reverseWords(String s) {

        String[] words = s.split(" ");
        StringBuilder result = new StringBuilder();

        for (String word : words) {
            StringBuilder reversedWord = new StringBuilder(word).reverse();
            result.append(reversedWord).append(" ");
        }

        return result.toString().trim();
    }

    private static int[] shortestToChar(String s, char c) {

        int ind = s.length();
        int[] answer = new int[ind];
        Arrays.fill(answer, Integer.MAX_VALUE);

        int prev = Integer.MIN_VALUE / 2;
        ;
        for (int i = 0; i < ind; i++) {
            if (s.charAt(i) == c) {
                prev = i;
            }
            answer[i] = Math.abs(i - prev);
        }

        prev = Integer.MAX_VALUE / 2;
        for (int i = ind - 1; i >= 0; i--) {
            if (s.charAt(i) == c) {
                prev = i;
            }
            answer[i] = Math.min(answer[i], Math.abs(i - prev));
        }

        return answer;
    }

    private static int dayOfYear(String date) {

        int[] daysInMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};


        String[] parts = date.split("-");
        int day = Integer.parseInt(parts[2]);
        int month = Integer.parseInt(parts[1]);
        int year = Integer.parseInt(parts[0]);

        boolean isLeap = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);

        if (isLeap){
            daysInMonth[1] = 29;
        }

        int dayOfYear = 0;
        for (int i = 0; i < month - 1; i++) {
            dayOfYear += daysInMonth[i];
        }

        dayOfYear += day;

        return dayOfYear;
    }

}


