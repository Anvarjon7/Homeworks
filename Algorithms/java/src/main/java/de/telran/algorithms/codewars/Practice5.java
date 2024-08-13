package de.telran.algorithms.codewars;

import java.util.Arrays;
import java.util.HashMap;

public class Practice5 {
    public static void main(String[] args) {

        System.out.println(encode("Dini"));
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};
        System.out.println(binarySearch(arr,5));
        int[] arr2 = {234,435,34,2,4,532,1};

        System.out.println(findSmallest(arr2));

        System.out.println(Arrays.toString(selectionSort(arr2)));


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


//    private static boolean s(String s){
//
//        Stack<Character>
//    }

    private static int binarySearch(int[] list, int item){

        int low = 0;
        int high = list.length - 1;

        while (low <= high){
            int mid = low + (high - low) / 2;
            int guess = list[mid];
            if (guess == item){
                return mid;
            }
            if (guess > item){
                high = mid - 1;
            }
            else {
                low = mid + 1;
            }
        }
        return low;
    }

    private static int findSmallest(int[] arr){

        int smm = arr[0];
        int ind = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < smm){
                smm = arr[i];
                ind = i;
            }
        }
        return ind;
    }

    private static int[] selectionSort(int[] arr){

        for (int i = 0; i < arr.length; i++) {
            int minInd = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minInd]){
                    minInd = j;
                }
            }

            int temp = arr[minInd];
            arr[minInd] = arr[i];
            arr[i] = temp;
        }
        return arr;
    }
 

























}
