package de.telran.algorithms.patterns.creational.singletonEx;

public class Main {

    public static void main(String[] args) {

        SingletonEnum singleton = SingletonEnum.INSTANCE;
        singleton.showMessage();

        Singleton2 singleton1 = Singleton2.getInstance("First example");
        Singleton2 singleton2 = Singleton2.getInstance("Second example");

        System.out.println(singleton1.getData());
        System.out.println(singleton2.getData());
    }
}
