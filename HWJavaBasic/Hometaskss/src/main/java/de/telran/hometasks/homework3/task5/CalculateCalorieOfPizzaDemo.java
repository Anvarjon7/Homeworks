package Hometaskss.src.main.java.de.telran.hometasks.homework3.task5;

import java.util.Scanner;

public class CalculateCalorieOfPizzaDemo {
    public static void main(String[] args) {
        // Создаем объект Scanner для считывания ввода с консоли
        Scanner scanner = new Scanner(System.in);

        // Вводим диаметр первой пиццы
        System.out.print("Введите диаметр первой пиццы (в см): ");
        double diameter1 = scanner.nextDouble();

        // Вводим диаметр второй пиццы
        System.out.print("Введите диаметр второй пиццы (в см): ");
        double diameter2 = scanner.nextDouble();

        // Площадь первой пиццы
        double area1 = calculatePizzaArea(diameter1);

        // Площадь второй пиццы
        double area2 = calculatePizzaArea(diameter2);

        // Количество лишних калорий
        double extraCalories = (area2 - area1) * 40;

        // Выводим результат
        System.out.println("Лишних калорий: " + (int)extraCalories);

    }

    // Метод для вычисления площади пиццы по диаметру
    private static double calculatePizzaArea(double diameter) {
        double radius = diameter / 2;
        return Math.PI * radius * radius;
    }
}
