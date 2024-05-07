package de.telran.algorithms.lesson1;

import java.util.Arrays;

public class Task4 {
    public static void main(String[] args) {
        int[] arr1 = {0, 10, 20, 30, 40, 50};
        int num = 50;
        sum(arr1,num);

        int a = 5;
        int b = 6;

        int c= a;
        a = b;
        b = c;
        int[] arr2 = {50,40,30,20,10};
        for (int i = 0; i < arr2.length; i++) {
            for (int j = 0; j < arr2.length - 1 - i; j++) {
                if (arr2[j] > arr2[i] + 1) {
                    int temp = arr2[j];
                    arr2[j] = arr2[j + 1];
                    arr2[j + 1] = temp;
                }
            }
            System.out.println(Arrays.toString(arr2));
        }

    }
    public static void sum(int[] array, int num){
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] + array[j] == num)
                    System.out.println("i=" + array[i] + " j=" + array[j]);
            }
        }

    }
}
