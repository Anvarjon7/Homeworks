package de.telran.hometasks.homework6;

public class Task1 {
    public static void main(String[] args) {
//      TASK-1
//        Напишите программу, которая меняет местами элементы одномерного массива из String в обратном порядке.
//        Не используйте дополнительный массив для хранения результатов.
        String[] arr = {"apple","banana","cherry","strawberry","mango"};

        System.out.println("Исходный массив");
        printArray(arr);

        int length = arr.length;
        for (int i = 0; i < length / 2; i++) {
            String temp = arr[i];
            arr[i] = arr[length - i - 1];
            arr[length - i - 1] = temp;
        }

        printArray(arr);

    }

    public static void printArray(String[] arr){
        for(String elem : arr){
            System.out.println(elem + " ");
        }
        System.out.println();
    }
}
