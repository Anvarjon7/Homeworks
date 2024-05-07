package de.telran.module_1.lesson_1.module_1.lesson_1.homework1;

import java.security.PublicKey;

public class Person {
    String fullName;
    int age;

    public Person(){
        this.fullName = "Jack";
        this.age = 22;
    }


    public Person(String fullName, int age) {
        this.fullName = fullName;
        this.age = age;


    }

    public String getFullName() {
        return fullName;
    }

    public int getAge() {
        return age;
    }

    public void move(){
        System.out.println(fullName + " идёт");
    }
    public void talk(){
        System.out.println(fullName + " говорит");
    }


}


//    Класс module1.lecture1.module1.lecture1.Person
//        Создать класс module1.lecture1.module1.lecture1.Person, который содержит:
//        переменные fullName, age;
//        методы move() и talk(), в которых просто вывести на консоль сообщение -"Такой-то  module1.lecture1.module1.lecture1.Person говорит".
//        Добавьте два конструктора  - module1.lecture1.module1.lecture1.Person() и module1.lecture1.module1.lecture1.Person(fullName, age).
//        Создайте два объекта этого класса. Один объект инициализируется конструктором module1.lecture1.module1.lecture1.Person(),
//        другой - module1.lecture1.module1.lecture1.Person(fullName, age)
