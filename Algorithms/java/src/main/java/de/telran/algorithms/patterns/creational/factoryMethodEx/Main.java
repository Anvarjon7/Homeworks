package de.telran.algorithms.patterns.creational.factoryMethodEx;

public class Main {
    public static void main(String[] args) {

        FoodFactory chocoFactory = new ChocolateFactory();
        chocoFactory.test();


        FoodFactory cakeFactory = new CakeFactory();
        cakeFactory.test();
    }
}
