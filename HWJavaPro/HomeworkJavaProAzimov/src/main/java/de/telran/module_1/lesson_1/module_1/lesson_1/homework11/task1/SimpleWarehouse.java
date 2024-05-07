package de.telran.module_1.lesson_1.module_1.lesson_1.homework11.task1;

import java.util.ArrayList;
import java.util.List;

public class SimpleWarehouse {
    public static void main(String[] args) {
        Warehouse warehouse = new Warehouse();
        warehouse.addProduct(new Brick(1,100,"A1"));
        warehouse.addProduct(new Brick(2,20,"B2"));
        warehouse.addProduct(new Brick(3,200,"C3"));

        List<Brick> brickList = new ArrayList<>();
        brickList.add(new Brick(1,20,""));
        brickList.add(new Brick(3,150,""));
        Order order = new Order(1,"John",brickList);

        warehouse.processOrder(order);
        List<String> eventLog = warehouse.getEventLog();
        for(String event : eventLog){
            System.out.println(event);
        }
    }
}
