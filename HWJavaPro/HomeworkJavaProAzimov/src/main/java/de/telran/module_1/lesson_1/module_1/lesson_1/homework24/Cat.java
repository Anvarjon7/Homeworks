package de.telran.module_1.lesson_1.module_1.lesson_1.homework24;

import lombok.*;
import org.w3c.dom.ls.LSOutput;

@Getter
@Setter
public class Cat {
    private String name;
    private double weight;
    private double eatenFood;
    private static int count = 0;
    private String color;

    public Cat(String name, double weight, double eatenFood, String color) {
        this.name = name;
        this.weight = weight;
        this.eatenFood = eatenFood;
        this.color = color;
        count++;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public static final int NUMBER_OF_EYES = 2;
    public static final double MIN_WEIGHT = 1.0;
    public static final double MAX_WEIGHT = 10.0;

    public Cat(double weight) {
        this.weight = weight;
        count++;
    }

    public Cat(String name, double weight) {
        this.name = name;
        this.weight = weight;
        count++;
    }

    public void printInformation() {
        System.out.println("Вес кошки " + name + " -> " + weight);
    }

    public void overFeed() {
        while (isAlive() && weight < 10) {
            weight += 0.5;
            eatenFood += 0.5;
        }
        if (isAlive()) {
            System.out.println(name + " покормлена. Вес: " + weight + " кг");
        } else {
            System.out.println(name + " мертва,её нельзя перекармливать!");
        }
    }

    public void meow() {
        if (isAlive()) {
            weight -= 0.5;
            System.out.println(name + " замяукал. Вес: " + weight + " кг");
        } else {
            System.out.println(name + " мертва!");
        }
    }

    boolean isAlive() {
        return weight > 0;
    }

    void meowToDeath() {
        while (isAlive()) {
            meow();
        }
        System.out.println(name + " мертва!");
        count--;
    }

    private double getSumOfEatenFood() {
        return eatenFood;
    }

    public void pee() {
        if (isAlive()) {
            double newWeight = weight - 0.2;
            System.out.println(name + " сходила в туалет.Новый вес кошки -> " + newWeight + " кг");
        } else {
            System.out.println(name + " мертва!");
        }
    }

    public boolean hasTail() {
        if (isAlive()) {
            return true;
        } else {
            return false;
        }
    }

    public static int getCount() {
        return count;
    }

//  Создать у кошки метод создания её “глубокой” копии.
//  Для создания копии кошки вы можете использовать метод копирования или конструктор копирования
    public Cat copy(){
        return new Cat(this.name,this.weight,this.eatenFood,this.color);
    }
}

enum CatColor{
        BLACK,
        WHITE,
        YELLOW,
        GREY
}

class Loader{
        public static Cat getKitten(){
            return new Cat(1100.00);
        }
}



class SimpleCat {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Мура", 2.5);
        Cat cat2 = new Cat("Киса", 5);
        Cat cat3 = new Cat("Алмаз", 3.0);
        Cat cat4 = new Cat("Бакстер", 4.0);
        Cat cat5 = new Cat("Гарфильд", 4.5);
        Cat cat6 = new Cat("Зевс", 3.5);

//      напечатайте в консоль вес созданных кошек
        cat1.printInformation();
        cat2.printInformation();
        cat3.printInformation();
        cat4.printInformation();
        cat5.printInformation();
        cat6.printInformation();

//      покормите 2 кошки и после этого распечатать их вес (убедитесь что вес изменился)
        cat2.overFeed();
        cat4.overFeed();

//      "замяукайте" кошку до смерти
        cat2.meowToDeath();

//      Создать в классе Cat метод, который будет возвращать сумму съеденной еды текущей кошки
        cat5.overFeed();
        double sumOfEatenFood = cat5.getEatenFood();
        System.out.println("Общее количество съеденной еды: " + sumOfEatenFood);

//      Создать в классе Cat метод “сходить в туалет” pee(), который будет уменьшать вес кошки и что-нибудь печатать.
        cat4.pee();

//      Создать у класса Cat статическую переменную count, которая будет увеличиваться, если кошку создали
//      и убывать, если кошка взорвалась или умерла
//      Создать статический метод getCount(), который будет возвращать количество кошек
        System.out.println("Текущее количество кошек: " + Cat.getCount());
        cat6.meowToDeath();
        System.out.println("Текущее количество кошек: " + Cat.getCount());


//      Создать в главном классе Loader метод генерации котенка private static Cat getKitten(),
//      который будет возвращать кошку с весом 1100.00, используя конструктор в который передаем вес кошки.
        Cat cat = Loader.getKitten();
        cat.printInformation();

        System.out.println("Есть ли у кошки хвост? : "+cat4.hasTail());




    }
}