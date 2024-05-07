package de.telran.module_1.lesson_1.module_1.lesson_1.homework1;

import de.telran.module_1.lesson_1.module_1.lesson_1.homework1.Person;

public class PersonDemo {
    public static void main(String[] args) {
        Person person1 = new Person();
        System.out.println("First object: " + person1.fullName + ", age: " + person1.age);

        Person person2 = new Person("Jony",30);
        System.out.println("Second object: " + person2.getFullName() + ", age: " + person2.getAge());

        person1.move();
        person2.talk();
    }
}
