package de.telran.algorithms.leetcodeTaskSolutions.tasks;

public class Practice7 {
    public static void main(String[] args) {

        String word = "usa";


        System.out.println(detect(word));
    }


    private static boolean detectCapitalUse(String word) {
        if (word.equals(word.toUpperCase())) {
            return true;
        } else if (word.equals(word.toLowerCase())) {
            return true;
        } else if (Character.isUpperCase(word.charAt(0))
                && word.substring(1).equals(word.substring(1).toLowerCase())) {
            return true;
        }
        return false;
    }

    private static boolean detect(String word) {

        String capLetters = word.toUpperCase();
        String lowerCaseLetters = word.toLowerCase();
        String firstCap = word.substring(0, 1).toUpperCase() + word.substring(1);

        return (word.equals(capLetters) || word.equals(lowerCaseLetters) || word.equals(firstCap));
    }

}
