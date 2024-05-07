package de.telran.module_1.lesson_1.module_1.lesson_1.homework4.task1;

public class HenFactoryDemo {
    public static void main(String[] args) {
        HenFactory henFactory = new HenFactory();

        String russianHen = henFactory.getHen("russia");
        System.out.println(russianHen);
        System.out.println();

        String ukrainianHen = henFactory.getHen("ukraine");
        System.out.println(ukrainianHen);
        System.out.println();

        String moldovanHen = henFactory.getHen("moldova");
        System.out.println(moldovanHen);
        System.out.println();

        String belarusianHen = henFactory.getHen("belarus");
        System.out.println(belarusianHen);
        System.out.println();

    }

}
