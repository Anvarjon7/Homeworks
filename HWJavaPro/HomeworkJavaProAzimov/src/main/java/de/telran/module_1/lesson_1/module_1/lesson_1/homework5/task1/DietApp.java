package de.telran.module_1.lesson_1.module_1.lesson_1.homework5.task1;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class DietApp {
    public static void main(String[] args) {
        Month month = Month.DECEMBER;
        Month month1 = Month.JULY;

        System.out.println(month1.getRussianName());
        System.out.println(month1.recommendDiet());
        System.out.println();
        System.out.println("Текущий месяц: " + month.getRussianName());
        System.out.println(month.recommendDiet());

    }
}
