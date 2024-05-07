package de.telran.algorithms.lesson5;

import java.util.Arrays;

public class LessonPractice {
    public static void main(String[] args) {
        System.out.println(H(3, "A", "B", "C"));
        int[] arr1 = {1, 3, 4, 5, 7, 8};
        int[] arr2 = {2, 6, 8, 9, 11, 13, 14};
        int[] array = {9, 7, 6, 5, 4, 3, 2, 0};
        System.out.println(Arrays.toString(merge(arr1, arr2)));
        System.out.println(Arrays.toString(mergeSort(array)));
    }

    public static String H(int n, String A, String C, String B) {
        if (n == 1) return A + C + " ";
        return H(n - 1, A, B, C) + A + C + " " + H(n - 1, B, C, A);
    }

    public static int[] merge(int[] arr1, int[] arr2) {
        int n = arr1.length;
        int m = arr2.length;
        int[] mergedArr = new int[n + m];
        int i = 0, j = 0, k = 0;
        while (i < n && j < m) {
            if (arr1[i] <= arr2[j]) {
                mergedArr[k++] = arr1[i++];
            } else {
                mergedArr[k++] = arr2[j++];
            }
        }
        while (i < n) {
            mergedArr[k++] = arr1[i++];
        }
        while (j < m) {
            mergedArr[k++] = arr2[j++];
        }
        return mergedArr;
    }

    public static int[] mergeSort(int[] arr) {
        if (arr.length <= 1) return arr;
        int[] left = Arrays.copyOfRange(arr, 0, arr.length / 2);
        int[] right = Arrays.copyOfRange(arr, arr.length / 2, arr.length);
        return merge(mergeSort(left), mergeSort(right));
    }
}
