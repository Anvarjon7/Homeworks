package de.telran.module_1.lesson_1.module_1.lesson_1.homework2.vehicles;

public class Car {

    private String model;
    private String color;

    public void setModel(String model) {
        this.model = model;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
