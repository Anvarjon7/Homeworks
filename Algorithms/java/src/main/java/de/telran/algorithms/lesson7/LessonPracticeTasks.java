package de.telran.algorithms.lesson7;

import java.util.ArrayList;
import java.util.Arrays;

public class LessonPracticeTasks {
    public static void main(String[] args) {

        int[] array = {4, 3, 6, 7, 0, 1, 8, 9, 5};
        int index = 0;
        int pivot = array[array.length - 1];
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] < pivot) {
                int temp = array[i];
                array[i] = array[index];
                array[index] = temp;
                index++;
            }
        }
        int temp = array[array.length - 1];
        array[array.length - 1] = array[index];
        array[index] = temp;
        System.out.println(Arrays.toString(array));

    }

    private static ArrayList<Integer> quickSortArr(ArrayList<Integer> arrayList) {
        if (arrayList.size() <= 1) return arrayList;
        int pivot = arrayList.get(arrayList.size() - 1);
        ArrayList<Integer> left = new ArrayList<>();
        ArrayList<Integer> right = new ArrayList<>();

        for (int i = 0; i < arrayList.size() - 1; i++) {
            if (arrayList.get(i) < pivot) left.add(arrayList.get(i));
            else right.add(arrayList.get(i));
        }

        ArrayList<Integer> temp = new ArrayList<>();
        temp.addAll(quickSortArr(left));
        temp.add(pivot);
        temp.addAll(quickSortArr(right));
        return temp;
    }
}


//{5,3,7,9,1,3,4}