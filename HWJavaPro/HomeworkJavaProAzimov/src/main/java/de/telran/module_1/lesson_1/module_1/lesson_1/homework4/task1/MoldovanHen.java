package de.telran.module_1.lesson_1.module_1.lesson_1.homework4.task1;

public class MoldovanHen extends Hen{
    @Override
    int getCountOfEggsPerMonth() {
        return 500;
    }
    @Override
    public String getDescription() {
        return super.getDescription() + "I'm from Moldova "+ ". I lay " + getCountOfEggsPerMonth() + " eggs a month";
    }
}
