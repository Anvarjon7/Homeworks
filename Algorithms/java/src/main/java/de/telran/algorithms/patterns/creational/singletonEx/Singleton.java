package de.telran.algorithms.patterns.creational.singletonEx;

public class Singleton {

//    private constructor to prevent instantiation
    private Singleton() {
    }

//    static inner class responsible for holding the Singleton instance
    private static class SingletonHelper{

//        inner class is loaded only when getInstance() is called
        private static final Singleton INSTANCE = new Singleton();
    }

//    Global access point for the Singleton instance
    public static Singleton getInstance() {
        return SingletonHelper.INSTANCE;
    }

    public void showMessage(){
        System.out.println("Singleton instance called!");
    }
}