package de.telran.module_1.lesson_1.module_1.lesson_1.homework10.task1;

import java.util.LinkedHashSet;
import java.util.Set;

public class Restaurant {
    public static void main(String[] args) {
        Set<Order> orderSet = new LinkedHashSet<>();

        orderSet.add(new Order( 1," Pizza-Pepperoni"));
        orderSet.add(new Order( 2," Pizza-Margherita"));
        orderSet.add(new Order( 3," CheeseBread"));

        processOrders(orderSet);

    }
    public static void processOrders(Set<Order> orderSet){
        System.out.println("Orders in the Kitchen:");
        for(Order order : orderSet){
            System.out.println(order);
        }
    }
}
