package de.telran.module_1.lesson_1.module_1.lesson_1.homework10.task3;

import java.util.HashMap;
import java.util.Map;

public class BusSystem {
    public static void main(String[] args) {
        Map<String, Bus> busMap = new HashMap<>();

        registerBus(busMap,new Bus("129","WWW279"));
        registerBus(busMap,new Bus("189","XXX888"));

        updateCoordinates(busMap,"129", 112.232,222.333);
        updateCoordinates(busMap,"189",223.345,567.676);
        getBusCoordinates(busMap,"129");
        getBusCoordinates(busMap,"189");
        getBusCoordinates(busMap,"100");

    }

    private static void registerBus(Map <String,Bus> busMap, Bus bus){
        busMap.put(bus.getBusNumber(),bus);
    }

    private static void updateCoordinates(Map<String,Bus> busMap,String busNumber, double latitude, double longitude){
        Bus bus = busMap.get(busNumber);

        if (bus != null){
           bus.updateCoordinates(latitude,longitude);
        }
        else{
            System.out.println("Bus with a number " + busNumber + " not registered");
        }
    }

    private static void getBusCoordinates(Map <String, Bus> busStringMap, String busNumber){
        Bus bus = busStringMap.get(busNumber);
        if (bus != null){
            System.out.println("Coordinate of the bus " + busNumber + ": " + " Latitude -->> " + bus.getLatitude()
                                + ", Longitude -->>" + bus.getLongitude());
        }
        else {
            System.out.println("Bus with a number " + busNumber + " not found!");
        }
    }
}
