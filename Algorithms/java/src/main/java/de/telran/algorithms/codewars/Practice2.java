package de.telran.algorithms.codewars;

import java.util.Arrays;

public class Practice2 {
    public static void main(String[] args) {

        int[] arr = {2334454, 5};
        System.out.println(Arrays.toString(minMax(arr)));

        int a = -1;
        int b = 2;
        System.out.println(getSum(a,b));

    }

    private static int[] minMax(int[] arr) {
        int min = arr[0];
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return new int[]{min, max};
    }

    private static int getSum(int a, int b) {

        int min = Math.min(a, b);
        int max = Math.max(a, b);

        int sum = 0;

        for (int i = min; i <= max; i++) {
            sum += i;
        }

        return sum;
    }
}
