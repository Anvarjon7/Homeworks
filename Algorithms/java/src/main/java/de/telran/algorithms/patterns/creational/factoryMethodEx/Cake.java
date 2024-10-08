package de.telran.algorithms.patterns.creational.factoryMethodEx;

public class Cake implements Factory{

    @Override
    public void create() {
        System.out.println("Cake is produced...");
    }
}
