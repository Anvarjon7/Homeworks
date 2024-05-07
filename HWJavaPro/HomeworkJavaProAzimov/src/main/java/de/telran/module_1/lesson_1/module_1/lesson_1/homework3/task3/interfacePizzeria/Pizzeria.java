package de.telran.module_1.lesson_1.module_1.lesson_1.homework3.task3.interfacePizzeria;

public class Pizzeria implements Cleaner,Cashier,Cook,Waiter {


    @Override
    public void raisesAnInvoice() {
        System.out.println("Raises an invoices");
    }

    @Override
    public void calculatePayments() {
        System.out.println("Calculate payments");
    }

    @Override
    public void clean() {
        System.out.println("Clean the restaurant");
    }

    @Override
    public void washDishes() {
        System.out.println("Washing a dishes");
    }

    @Override
    public void prepareOrder() {
        System.out.println("Prepares the order");
    }

    @Override
    public void servesOrder() {
        System.out.println("Serves the order");
    }

    @Override
    public void takeOrder() {
        System.out.println("Takes the order");
    }
}
