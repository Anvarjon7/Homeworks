package de.telran.algorithms.patterns.creational.factoryMethodEx;

public class CakeFactory extends FoodFactory{

    @Override
    public Factory createFood() {
        return new Cake();
    }

}
