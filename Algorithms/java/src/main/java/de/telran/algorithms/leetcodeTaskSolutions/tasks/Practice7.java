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


    private static int numOfSpecialChars(String word) {

        int specialCount = 0;

        // Create a set of unique lowercase letters in the word
        Set<Character> uniqueLetters = new HashSet<>();
        for (char c : word.toCharArray()) {
            uniqueLetters.add(Character.toLowerCase(c));
        }

        // Check each letter in the unique set
        for (char letter : uniqueLetters) {
            char lower = Character.toLowerCase(letter);
            char upper = Character.toUpperCase(letter);

            // Check if both lowercase and uppercase exist in the word
            if (word.indexOf(lower) != -1 && word.indexOf(upper) != -1) {
                // Flag to ensure all lowercase occur before uppercase
                boolean isSpecial = true;

                boolean upperSeen = false;
                for (char c : word.toCharArray()) {
                    if (c == upper) {
                        upperSeen = true; // Mark uppercase occurrence
                    } else if (c == lower && upperSeen) {
                        isSpecial = false; // Lowercase occurs after uppercase
                        break;
                    }
                }

                if (isSpecial) {
                    specialCount++;
                }
            }
        }

        return specialCount;
    }
}
