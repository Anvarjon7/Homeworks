package de.telran.module_1.lesson_1.module_1.lesson_1.homework1;

public class Phone {

    int number;
    String model;
    double weight;

    public Phone( String model,int number, double weight) {
        this.number = number;
        this.model = model;
        this.weight = weight;
    }

    public void receiveCall(String callerName) {
        System.out.println("Calling: " + callerName);
    }

    public int setNumber(int number) {
        this.number = number;
        return number;
    }

}


//    Создайте класс Phone, который содержит переменные number, model и weight.
//        Создайте три экземпляра этого класса.
//        Выведите на консоль значения их переменных.
//        Добавить в класс Phone методы: receiveCall, имеет один параметр – имя звонящего.
//        Выводит на консоль сообщение “Звонит {name}”. Метод getNumber – возвращает номер телефона.
//        Вызвать эти методы для каждого из объектов.