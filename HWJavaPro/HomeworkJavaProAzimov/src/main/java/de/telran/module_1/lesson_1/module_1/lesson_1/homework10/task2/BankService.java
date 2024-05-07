package de.telran.module_1.lesson_1.module_1.lesson_1.homework10.task2;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class BankService {
    public static void main(String[] args) {
        Set<Customer> customerSet = new TreeSet<>(Comparator.comparingInt(Customer::getTicketNumber));
        simulateWorkingDay(customerSet);
        printResult(customerSet);

    }
    public static void simulateWorkingDay(Set<Customer>customers){
        Customer customer1 = new Customer("John Wick",1988,"Consultation");
        Customer customer2 = new Customer("Sara Smith",1993,"Open Deposit");
        Customer customer3 = new Customer("Artur Doe",1955,"Investing");

        customers.add(customer1);
        customers.add(customer2);
        customers.add(customer3);

        simulateHours(customers);

        Customer customer4 = new Customer("Anna Brown",1960,"Receive funds");
        Customer customer5 = new Customer("Jason White",2001,"Communal payments");
        customers.add(customer4);
        customers.add(customer5);
    }

    private static void simulateHours(Set<Customer> customers) {
        int currentTime = 11;

        if (currentTime >=10 && currentTime <= 12){
            Customer customerPensioner1 = new Customer("First-Pensioner",1950,"Consultation");
            Customer customerPensioner2 = new Customer("Second-Pensioner",1955,"Receive funds");
            customers.add(customerPensioner1);
            customers.add(customerPensioner2);
        }
    }

    private static void printResult(Set<Customer> customers){
        System.out.println("Service result: ");
        for(Customer customer : customers){
            System.out.println("Ticket: " + customer.getTicketNumber() + ": " + customer.getFullName() + ", Operation type:  " + customer.getOperationType());
        }
    }

}
