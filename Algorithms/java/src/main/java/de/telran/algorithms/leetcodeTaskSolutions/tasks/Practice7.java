package de.telran.algorithms.leetcodeTaskSolutions.tasks;

import java.util.HashSet;
import java.util.Set;

public class Practice7 {
    public static void main(String[] args) {

        String word = "Cc";


        System.out.println(detect(word));

        System.out.println(numberOfSpecialChars(word));
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
        String firstCap = word.substring(0, 1).toUpperCase() + word.substring(1);

        return (word.equals(capLetters) || word.equals(lowerCaseLetters) || word.equals(firstCap));
    }


    private static int numberOfSpecialChars(String word) {

        Set<Character> lower = new HashSet<>();
        Set<Character> upper = new HashSet<>();

        int count = 0;

        for (char c : word.toCharArray()){
            if (Character.isLowerCase(c)){
                lower.add(c);
            } else if (Character.isUpperCase(c)) {
                upper.add(Character.toLowerCase(c));
            }
        }

        for (char c : lower){
            if (upper.contains(c)){
                count++;
            }
        }

        return count;
    }
}
