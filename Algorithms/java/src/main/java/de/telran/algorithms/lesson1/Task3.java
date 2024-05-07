package de.telran.algorithms.lesson1;

public class Task3 {
    public static void main(String[] args) {
        int[] arr = {0, 10, 20, 30, 40, 50};
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == 50) {
                    System.out.println("i = " + arr[i]);
                    System.out.println(" j = " + arr[j]);
                }
            }
        }
    }
}
