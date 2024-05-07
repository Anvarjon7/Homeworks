package de.telran.algorithms.lesson1;

public class Task1 {
    public static void main(String[] args) {

        int[] num = {1, 2, 3, 4, 5};

        for (int i = 0; i < num.length; i++) {
            if (i % 2 != 0) {
                System.out.println("Число четное " + num[i]);
            } else {
                System.out.println("Число нечетное " + num[i]);
            }
        }
    }
}
