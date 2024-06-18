package Hometaskss.src.main.java.de.telran.hometasks.homework5;

import java.util.Random;

public class Task2 {
    public static void main(String[] args) {

//        Создайте массив из 5 случайных целых чисел из интервала [10;99]
        int[] array = new int[5];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(99) + 10;
        }

//        Выведите его на консоль в строку.
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if (i != array.length - 1) {
                System.out.print(", ");
            }
        }

        System.out.println();

//      Определите и выведите на экран сообщение о том, является ли
//      массив строго возрастающей последовательностью.
        boolean isTrue = true;
        for (int i = 1; i < array.length; i++) {
            if (array[i] <= array[i - 1]) {
                isTrue = false;
                break;
            }
        }
        if (isTrue) {
            System.out.println("Массив является строго возрастающей последовательностью.");
        } else {
            System.out.println("Массив не является строго возрастающей последовательностью.");
        }
    }
}
