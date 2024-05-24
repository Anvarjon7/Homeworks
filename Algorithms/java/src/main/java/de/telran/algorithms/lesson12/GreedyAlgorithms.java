package de.telran.algorithms.lesson12;

import java.util.ArrayList;
import java.util.Arrays;

public class GreedyAlgorithms {
    public static void main(String[] args) {
        int[] arr = {25, 25, 20, 3, 5, 6};
        int num = 63;

        if (greedy(arr, num) == -1) {
            System.out.println("Couldn't get " + num + " coins using " + Arrays.toString(arr) + " combo");
        } else
            System.out.println(greedy(arr, num));

        int[][] arr2 = {{3, 4}, {2, 5}, {0, 2}, {6, 5}, {7, 9}, {12, 15}};
        for (int i = 0; i < activities(arr2).size(); i++) {
            System.out.println(Arrays.toString(activities(arr2).get(i)));
        }

        int[] arr3 = {1, 2, 5, 6, -3, 8, -1, 34, -9};
        System.out.println(maxMult(arr3));

        System.out.println(noBoring(-1450));
    }


    private static int greedy(int[] arr, int num) {
        int remaining = num;
        int count = 0;
        for (int x : arr) {
            while (remaining >= x) {
                remaining = remaining - x;
                count++;
            }
        }
        if (remaining > 0) return -1;
        return count;
    }

    private static ArrayList<int[]> activities(int[][] arr) {
        Arrays.sort(arr, (a, b) -> Integer.compare(a[1], b[1]));
        ArrayList<int[]> picked = new ArrayList<>();
        picked.add(arr[0]);
        int end = arr[0][1];
        for (int i = 1; i < arr.length; i++) {
            if (end <= arr[i][0]) {
                picked.add(arr[i]);
                end = arr[i][1];
            }
        }
        return picked;
    }

    private static int maxMult(int[] arr) {
        int mult = 1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) mult = mult * arr[i];
        }
        if (mult > 0) return mult;

        int min = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0 && arr[i] > min) min = arr[i];
        }
        return mult / min;
    }

    public static int noBoring(int n) {
        boolean isNegative = n < 0;
        if (isNegative) {
            n = -n;
        }
        while (n % 10 == 0 && n != 0) {
            n /= 10;
        }

        if (isNegative) {
            n = -n;
        }
        return n;
    }
}
