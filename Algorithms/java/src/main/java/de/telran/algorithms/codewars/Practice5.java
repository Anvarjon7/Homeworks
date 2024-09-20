package de.telran.algorithms.codewars;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class Practice5 {
    public static void main(String[] args) {

        System.out.println(encode("Dini"));
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};
        System.out.println(binarySearch(arr, 5));
        int[] arr2 = {234, 435, 34, 2, 4, 532, 1};

        System.out.println(findSmallest(arr2));

        System.out.println(Arrays.toString(selectionSort(arr2)));

        System.out.println(recursiveSum(arr));
        System.out.println(findSum(arr));

        System.out.println(isPangramm("You shall not pass!"));

        double[] s = {1,1,1};
        System.out.println(Arrays.toString(tribonacci(s , 10)));

//        Listnode head = new Listnode(3);
//        head.next.next = new Listnode(2);
//        head.next.next.next = new Listnode(0);
//        head.next.next.next.next = new Listnode(-4);

//        System.out.println(Listnode.hasCycle(head));


    }

    private static String encode(String word) {

        String lowerCase = word.toLowerCase();

        HashMap<Character, Integer> charCountMap = new HashMap<>();

        for (char c : lowerCase.toCharArray()) {
            charCountMap.put(c, charCountMap.getOrDefault(c, 0) + 1);
        }

        StringBuilder result = new StringBuilder();

        for (char c : lowerCase.toCharArray()) {
            if (charCountMap.get(c) > 1) {
                result.append(")");
            } else {
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


    private static int binarySearch(int[] list, int item) {

        int low = 0;
        int high = list.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            int guess = list[mid];
            if (guess == item) {
                return mid;
            }
            if (guess > item) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return low;
    }

    private static int findSmallest(int[] arr) {

        int smm = arr[0];
        int ind = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < smm) {
                smm = arr[i];
                ind = i;
            }
        }
        return ind;
    }

    private static int[] selectionSort(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            int minInd = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minInd]) {
                    minInd = j;
                }
            }

            int temp = arr[minInd];
            arr[minInd] = arr[i];
            arr[i] = temp;
        }
        return arr;
    }

    private static int recursiveSum(int[] arr) {
        return recursiveSumHelp(arr, 0);
    }

    private static int recursiveSumHelp(int[] arr, int index) {

        if (index >= arr.length) {
            return 0;
        }

        return arr[index] + recursiveSumHelp(arr, index + 1);
    }

    private static int findSum(int[] arr) {

        int sum = arr[0];

        for (int i = 1; i < arr.length; i++) {
            sum += arr[i];
        }

        return sum;
    }

    private static int sum(int[] arr) {
        return recursiveMax(arr, 0, arr[0]);
    }

    private static int recursiveMax(int[] arr, int index, int max) {

        if (index >= arr.length) {
            return max;
        }

        if (arr[index] > max) {
            max = arr[index];
        }

        return recursiveMax(arr, index + 1, max);
    }

    private static int recursiveBinarySearch(int[] list, int item) {
        return binarySearchHelper(list, item, 0, list.length - 1);
    }


    private static int binarySearchHelper(int[] arr, int item, int low, int high) {

        if (low > high) {
            return low;
        }

        int mid = low + (high - low) / 2;
        int guess = arr[mid];

        if (guess == item) {
            return mid;
        } else if (guess > item) {
            return binarySearchHelper(arr, item, low, mid - 1);
        } else {
            return binarySearchHelper(arr, item, mid + 1, high);
        }
    }

    private static boolean solution(String str, String ending) {


        return str.endsWith(ending);
    }

    private static boolean isPangramm(String sentence) {

        return sentence.chars().map(Character::toLowerCase).filter(Character::isAlphabetic).distinct().count() == 26;
    }

    private static double[] tribonacci(double[] s, int n){
        if (n == 0) return new double[0];
        if (n <=3) return Arrays.copyOf(s,n);
        double[] tri = new double[n];
        System.arraycopy(s,0, tri,0,3);

        for (int i = 3; i < n; i++) {
            tri[i] = tri[i - 1] + tri[i - 2] + tri[i - 3];
        }

        return tri;
    }


}
