package de.telran.algorithms.patterns.creational.factoryMethodEx;

public class Chocolate implements Factory{

    @Override
    public void create() {
        System.out.println("Chocolate is produced...");
    }
}
