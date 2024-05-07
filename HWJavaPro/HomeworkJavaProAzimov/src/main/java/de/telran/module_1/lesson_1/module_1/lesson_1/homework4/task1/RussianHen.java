package de.telran.module_1.lesson_1.module_1.lesson_1.homework4.task1;

public class RussianHen extends Hen{
    @Override
    int getCountOfEggsPerMonth() {
        return 800;
    }
    @Override
    public String getDescription() {
        return super.getDescription() + "I'm from Russia "+ ". I lay " + getCountOfEggsPerMonth() + " eggs a month";
    }
}
