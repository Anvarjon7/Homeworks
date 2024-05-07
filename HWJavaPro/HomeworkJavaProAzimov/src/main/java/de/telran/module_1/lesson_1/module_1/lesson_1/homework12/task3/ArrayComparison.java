package de.telran.module_1.lesson_1.module_1.lesson_1.homework12.task3;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ArrayComparison {
    private static boolean areArrEquals(int[] arr1, int[] arr2){
        if (arr1.length != arr2.length){
            return false;
        }
        Set<Integer>  set1 = new HashSet<>();
        Set<Integer>  set2 = new HashSet<>();

        for (int num : arr1){
            set1.add(num);
        }
        for (int num : arr2){
            set2.add(num);
        }

        return set1.equals(set2);
    }

    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4,5,6};
        int[] arr2 = {6,5,4,3,2,1};
        boolean result = areArrEquals(arr1,arr2);

        if (result){
            System.out.println("Массивы равны с точки зрения набора значений.");
        }
        else {
            System.out.println("Массивы не равны с точки зрения набора значений.");
        }
    }
}
