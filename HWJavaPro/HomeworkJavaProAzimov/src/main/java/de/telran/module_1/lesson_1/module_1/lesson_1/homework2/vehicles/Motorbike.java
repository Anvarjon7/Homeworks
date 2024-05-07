package de.telran.module_1.lesson_1.module_1.lesson_1.homework2.vehicles;

public class Motorbike extends Bicycle {
    private String color;
    private String model;
    private int year;

    @Override
    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "Motorbike{" +
                "color='" + color + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                "} " + super.toString();
    }
}
