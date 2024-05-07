package de.telran.module_1.lesson_1.module_1.lesson_1.homework10.task3;

import lombok.Getter;

@Getter
public class Bus {
    private String  busNumber;
    private String vehicleNumber;
    private double latitude;
    private double longitude;

    public Bus(String busNumber, String vehicleNumber) {
        this.busNumber = busNumber;
        this.vehicleNumber = vehicleNumber;
        this.latitude = 0.0;
        this.longitude = 0.0;
    }

    public void updateCoordinates(double newLatitude, double newLongitude){
        this.latitude = newLatitude;
        this.longitude = newLongitude;
    }
}
