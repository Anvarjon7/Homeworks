package de.telran.module_1.lesson_1.module_1.lesson_1.homework4.task1;

public class HenFactory {

    public String getHen(String information) {
        switch (information.toLowerCase()) {
            case "russia":
                return new RussianHen().getDescription();
            case "ukraine":
                return new UkrainianHen().getDescription();
            case "belarus":
                return new BelarusianHen().getDescription();
            case "moldova":
                return new MoldovanHen().getDescription();
            default:
                return null;
        }


    }
}
