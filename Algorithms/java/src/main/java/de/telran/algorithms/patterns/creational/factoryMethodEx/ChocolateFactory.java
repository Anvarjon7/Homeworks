package de.telran.algorithms.patterns.creational.factoryMethodEx;

public class ChocolateFactory extends FoodFactory{

    @Override
    public Factory createFood() {
        return new Chocolate();
    }

}
