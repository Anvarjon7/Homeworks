package de.telran.module_1.lesson_1.module_1.lesson_1.homework5.task2;

public class CoffeeMachineDemo {
    public static void main(String[] args) {
        CoffeeMachine coffeeMachine = CoffeeMachine.getInstance(250);
        CoffeeMachine coffeeMachine1 = CoffeeMachine.getInstance(150);

        System.out.println(coffeeMachine1 == coffeeMachine);
        System.out.println(coffeeMachine.equals(coffeeMachine1));

        coffeeMachine1.getCappuccino();
        coffeeMachine.GetLatte();
    }
}
