package de.telran.module_1.lesson_1.module_1.lesson_1.homework11.task2;

public class GasStationSimulation {
    public static void main(String[] args) {
        GasStation gasStation = new GasStation();
        gasStation.enqueueCar(new Car(TransportType.CAR,"B2323"));
        gasStation.enqueueCar(new Car(TransportType.BUS,"A189"));
        gasStation.enqueueCar(new Car(TransportType.AMBULANCE,"C103"));

        gasStation.serviceCars();
    }
}
