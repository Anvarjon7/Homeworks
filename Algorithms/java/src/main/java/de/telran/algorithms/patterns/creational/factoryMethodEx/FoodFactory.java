package de.telran.algorithms.patterns.creational.factoryMethodEx;

public abstract class FoodFactory {

    public abstract Factory createFood();

    public void test(){
        Factory factory = createFood();
        factory.create();
    }
}
