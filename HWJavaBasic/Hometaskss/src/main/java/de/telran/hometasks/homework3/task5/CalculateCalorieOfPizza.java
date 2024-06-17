package de.telran.hometasks.homework3.task5;

import de.telran.hometasks.userinterface.UserInput;

public class CalculateCalorieOfPizza {
    UserInput ui = new UserInput();
    double diameter1 = ui.userDouble();
    double diameter2 = ui.userDouble();

    public double calculatePizzaCalorie(double diameter){
        double radius = diameter / 2;
        return Math.PI * radius * radius;
    }

}

//        Напишите программу, которая вычисляет, сколько лишних калорий будет,
//        если вместо пиццы диаметром 24 см вы купите пиццу диаметром 28 см.
//        Чтобы решить эту проблему, предположим, что каждый квадратный сантиметр пиццы содержит 40 калорий.