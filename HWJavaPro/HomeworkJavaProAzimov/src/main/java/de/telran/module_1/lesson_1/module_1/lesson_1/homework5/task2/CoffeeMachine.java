package de.telran.module_1.lesson_1.module_1.lesson_1.homework5.task2;

public class CoffeeMachine {
    private static CoffeeMachine instance;
    private double mL;

    public void getCappuccino(){
        System.out.println("Coffee Cappuccino");
    }
    public void getAmericano(){
        System.out.println("Coffee Americano");
    }
    public void GetLatte(){
        System.out.println("Coffee Latte");
    }

    private CoffeeMachine(double mL) {
        this.mL = mL;
    }
    public static CoffeeMachine getInstance(double mL){
        if (instance == null){
            instance = new CoffeeMachine(mL);
        }
        return instance;
    }
}
