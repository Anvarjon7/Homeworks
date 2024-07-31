package de.telran.algorithms.codewars;

import java.util.HashMap;

public class Practice5 {
    public static void main(String[] args) {

        System.out.println(encode("Dini"));


    }

    private static String encode(String word){

        String lowerCase = word.toLowerCase();

        HashMap<Character, Integer> charCountMap = new HashMap<>();

        for (char c : lowerCase.toCharArray()){
            charCountMap.put(c,charCountMap.getOrDefault(c, 0) + 1);
        }

        StringBuilder result = new StringBuilder();

        for (char c : lowerCase.toCharArray()){
            if (charCountMap.get(c) > 1){
                result.append(")");
            }else {
                result.append("(");
            }
        }

        return result.toString();
    }

    public static String encode2(String word) {

        String lowerCaseWord = word.toLowerCase();

        int[] charCount = new int[256];

        for (int i = 0; i < lowerCaseWord.length(); i++) {
            char c = lowerCaseWord.charAt(i);
            charCount[c]++;
        }

        StringBuilder result = new StringBuilder();
        for (int i = 0; i < lowerCaseWord.length(); i++) {
            char c = lowerCaseWord.charAt(i);
            if (charCount[c] > 1) {
                result.append(")");
            } else {
                result.append("(");
            }
        }

        return result.toString();
    }

}
