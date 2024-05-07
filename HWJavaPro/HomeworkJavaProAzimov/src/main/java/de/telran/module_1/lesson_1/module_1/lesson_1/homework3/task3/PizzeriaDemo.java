package de.telran.module_1.lesson_1.module_1.lesson_1.homework3.task3;

import de.telran.module_1.lesson_1.module_1.lesson_1.homework3.task3.interfacePizzeria.Pizzeria;

public class PizzeriaDemo {
    public static void main(String[] args) {
        Pizzeria pizzeria = new Pizzeria();


        pizzeria.takeOrder();
        pizzeria.prepareOrder();
        pizzeria.servesOrder();
        pizzeria.clean();
        pizzeria.washDishes();
        pizzeria.calculatePayments();
        pizzeria.raisesAnInvoice();
    }
}
