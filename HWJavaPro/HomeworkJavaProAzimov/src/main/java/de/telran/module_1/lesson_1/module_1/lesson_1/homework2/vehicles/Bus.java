package de.telran.module_1.lesson_1.module_1.lesson_1.homework2.vehicles;

public class Bus extends Car{
    private String maxSpeed;

    public void setMaxSpeed(String maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    @Override
    public String toString() {
        return "Bus{" +
                "maxSpeed='" + maxSpeed + '\'' +
                "} " + super.toString();
    }
}
