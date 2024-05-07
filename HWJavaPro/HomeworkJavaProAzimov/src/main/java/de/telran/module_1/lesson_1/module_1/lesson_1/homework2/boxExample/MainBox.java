package de.telran.module_1.lesson_1.module_1.lesson_1.homework2.boxExample;

public class MainBox {
    public static void main(String[] args) {
        Box box = new Box(5.5, 2.5, 3.0);

        double boxVolume = box.calculate();
        double boxNeeds = box.boxNeeds(85.5, boxVolume);


        System.out.println("Volume of Box = " + boxVolume);

        System.out.println("Need: " + boxNeeds + " more boxes");
    }
}
//
//        Характеристики: ширина, длина, высота.
//        Поведение: Рассчитать объем коробки, Подсчитать сколько таких коробок нужно
//        чтобы разместить определенный объем сыпучего товара. ;)
//        Инкапсулировать характеристики и поведение в классе.