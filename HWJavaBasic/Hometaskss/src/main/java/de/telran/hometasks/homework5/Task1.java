package Hometaskss.src.main.java.de.telran.hometasks.homework5;

import java.util.Arrays;
import java.util.Random;

public class Task1 {
    public static void main(String[] args) {

//        Создайте массив из 8 случайных целых чисел из интервала [1;50]
        int[] arr = new int[8];
        Random rand = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextInt(50) + 1;
        }

//        Выведите массив на консоль в строку.
        System.out.println(Arrays.toString(arr));

//        Замените каждый элемент с нечетным индексом на ноль.
        for (int i = 1; i < arr.length; i += 2) {
            arr[i] = 0;
        }
//        Снова выведете массив на консоль в отдельной строке.
        System.out.println(Arrays.toString(arr));
    }
}
