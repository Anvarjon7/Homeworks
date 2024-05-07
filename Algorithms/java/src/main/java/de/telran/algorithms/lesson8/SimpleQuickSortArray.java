package de.telran.algorithms.lesson8;

import java.util.ArrayList;
import java.util.Arrays;

public class SimpleQuickSortArray {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(3);
        arrayList.add(1);
        arrayList.add(4);
        arrayList.add(6);
        arrayList.add(7);
        arrayList.add(4);
        arrayList.add(9);
        arrayList.add(0);
        arrayList.add(2);
        arrayList.add(6);
        arrayList.add(8);
        arrayList.add(10);

        System.out.println(quickSortArr(arrayList));

        int[] arr = {1,9,8,4,3,6,2,0,7};
        quickSort(arr,0,arr.length -1);
        System.out.println(Arrays.toString(arr));

    }

    public static ArrayList<Integer> quickSortArr(ArrayList<Integer> arr){
        if (arr.size() <= 1) return arr;
        ArrayList<Integer> left = new ArrayList<>();
        int pivot = arr.getLast();
        ArrayList<Integer> right = new ArrayList<>();

        for (int i = 0; i < arr.size() - 1; i++) {
            if (arr.get(i) < pivot) left.add(arr.get(i));
            else right.add(arr.get(i));
        }
        ArrayList<Integer> updatedArray = new ArrayList<>();
        updatedArray.addAll(quickSortArr(left));
        updatedArray.add(pivot);
        updatedArray.addAll(quickSortArr(right));

        return updatedArray;
    }
    public static int arrange(int[] arr, int start, int end) {
        int pivot = arr[end];
        int index = start;
        for (int i = start; i < end; i++) {
            if (arr[i] < pivot) {
                int temp = arr[index];
                arr[index] = arr[i];
                arr[i] = temp;
                index++;
            }
        }
        int temp = arr[index];
        arr[index] = arr[end];
        arr[end] = temp;

        return index;
    }
    public static void quickSort(int[] arr, int start, int end) {
        if (end<=start) return;
        int index = arrange(arr, start, end);
        quickSort(arr, start, index-1);
        quickSort(arr, index+1, end);
    }

    public static int maxSubArray(int[] arr) {
        int maxSoFar = arr[0];
        int maxEnding = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (maxEnding < 0) maxEnding = arr[i];
            else maxEnding = maxEnding + arr[i];
            if (maxEnding > maxSoFar) maxSoFar = maxEnding;
        }
        return maxSoFar;
    }
}
