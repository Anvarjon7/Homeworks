package de.telran.algorithms.patterns.creational.singletonEx;

public enum SingletonEnum {

    INSTANCE;

    public void showMessage(){
        System.out.println("Enum Singleton instance called!");
    }
}
