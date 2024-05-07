package de.telran.module_1.lesson_1.module_1.lesson_1.homework11.task2;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.PriorityQueue;
import java.util.Queue;

public enum TransportType {
    CAR,
    BUS,
    AMBULANCE
}
@Getter
@Setter
class Car implements Comparable<Car> {
    private TransportType type;
    private String licensePlate;

    public Car(TransportType type, String licensePlate) {
        this.type = type;
        this.licensePlate = licensePlate;
    }

    @Override
    public int compareTo(Car o) {
        return Integer.compare(this.getType().ordinal(), o.getType().ordinal());
    }
}

class GasStation{
        private final Queue<Car> carQueue;

    public GasStation() {
        this.carQueue = new PriorityQueue<>();
    }
    public void refuelCar(Car car){
        System.out.println("Car " + car.getLicensePlate() + " type " + car.getType() + " fueled");
    }
    public void enqueueCar(Car car){
        carQueue.add(car);
    }
    public void serviceCars(){
        while (!carQueue.isEmpty()){
            Car car = carQueue.poll();
            refuelCar(car);
        }
    }
}
