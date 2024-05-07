package de.telran.algorithms.lesson1;

public class Task2 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 5, 4, 1, 1, 1, 2, 0, -5, 6};
        System.out.println("Max element");
        System.out.println(maxElement(array));
        System.out.println("Min element");
        System.out.println(minElem(array));
    }
    public static int maxElement(int[] array){
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) max = array[i];
        }
        return max;
    }
    public static int minElem(int[] array){
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > min)min = array[i];
        }
        return min;
    }

}
