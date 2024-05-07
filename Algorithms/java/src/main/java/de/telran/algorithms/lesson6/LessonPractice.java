package de.telran.algorithms.lesson6;

import java.util.Arrays;

public class LessonPractice {
    public static void main(String[] args) {
        int[] arr = {0, 1, 0, 1, 0, 0, 1, 1, 1, 1, 0};
        binarySortArr(arr);
        System.out.println(Arrays.toString(arr));

        int[] arr2 = {0, 1, 2, 2, 0, 2, 1, 0, 0, 2, 1, 1, 1, 2, 1, 0};
        binarySortArr2(arr2);
        System.out.println(Arrays.toString(arr2));
        System.out.println(arr.length);

        int[] arr3 = {1, 2, 3, 4, 5, 5, 6, 2, 6, 7};
        searchNonUniqueElem(arr3);
        binarySort(arr3);
        System.out.println(Arrays.toString(arr3));
    }

    private static int[] binarySortArr(int[] array) {
        int countZeros = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 0) countZeros++;
        }
        for (int j = 0; j < countZeros; j++) {
            array[j] = 0;
        }
        for (int k = countZeros; k < array.length; k++) {
            array[k] = 1;
        }
        return array;
    }

    private static int[] binarySortArr2(int[] arr) {
        int countZeros = 0;
        int countOnes = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) countZeros++;
            else if (arr[i] == 1) countOnes++;
        }
        for (int i = 0; i < countZeros; i++) {
            arr[i] = 0;
        }
        for (int i = countZeros; i < countZeros + countOnes; i++) {
            arr[i] = 1;
        }
        for (int i = countZeros + countOnes; i < arr.length; i++) {
            arr[i] = 2;
        }
        return arr;
    }

    private static void searchNonUniqueElem(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            boolean isNonUnique = false;
            for (int j = 0; j < arr.length; j++) {
                if (i != j && arr[i] == arr[j]) {
                    isNonUnique = true;
                    break;
                }
            }
            if (isNonUnique) {
                System.out.print(arr[i] + " ");
            }
        }
    }

    public static int binarySort(int[] arr) {
        int totalSum = 0;
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            totalSum += arr[i];
        }
        for (int i = 1; i < arr.length; i++) {
            sum += i;
        }
        return totalSum - sum;
    }
}
