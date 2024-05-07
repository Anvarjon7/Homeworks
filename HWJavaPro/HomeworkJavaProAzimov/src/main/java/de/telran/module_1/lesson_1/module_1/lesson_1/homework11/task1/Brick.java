package de.telran.module_1.lesson_1.module_1.lesson_1.homework11.task1;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
@Getter
@Setter
public class Brick {
    private int id;
    private int quantity;
    private String location;

}
@Setter
@Getter
class Order{
    private int id;
    private String customerName;
    private List<Brick> products;
    private String status;

    public Order(int id, String customerName, List<Brick> products) {
        this.id = id;
        this.customerName = customerName;
        this.products = new ArrayList<>(products);
        this.status = "in process";
    }


}

class Warehouse{
    private List<Brick> products;
    private List<Order> orders;
    private List<String> eventLog;

    public Warehouse() {
        this.products = new ArrayList<>();
        this.orders = new ArrayList<>();
        this.eventLog = new ArrayList<>();
    }
    public void addProduct(Brick brick){
        products.add(brick);
        logEvent("New product arrival (ID: " + brick.getId() + ")");
    }

    public void processOrder(Order order){
        for (Brick orderedBrick : order.getProducts()){
            for (Brick warehouseBrick : products){
                if (orderedBrick.getId() == warehouseBrick.getId()){
                    if (orderedBrick.getQuantity() <= warehouseBrick.getQuantity()){
                        warehouseBrick.setQuantity(warehouseBrick.getQuantity() - orderedBrick.getQuantity());
                        order.setStatus("Shipped");
                        logEvent("Order shipment (order ID: " + order.getId() + ")");
                        return;
                    }else {
                        order.setStatus("not enough product in stock");
                        logEvent("Not enough product to order (Order ID: " + order.getId() + ")");
                        return;
                    }
                }
            }
        }
    }
    public void logEvent(String event){
        eventLog.add(event);
    }
    public List<String> getEventLog(){
        return new ArrayList<>(eventLog);
    }

}