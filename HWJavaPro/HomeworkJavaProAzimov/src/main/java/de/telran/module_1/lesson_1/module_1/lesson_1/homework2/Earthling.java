package de.telran.module_1.lesson_1.module_1.lesson_1.homework2;

public class Earthling{

    private String name;

    private double weight;


    public void setName(String name) {
        this.name = name;
    }




    public void setWeight(double weight) {
        this.weight = weight;
    }

    public Earthling() {
    }

    @Override
    public String toString() {
        return "Earthling {" +
                "name='" + name + '\'' +
                ", weight=" + weight +
                '}';
    }
}
