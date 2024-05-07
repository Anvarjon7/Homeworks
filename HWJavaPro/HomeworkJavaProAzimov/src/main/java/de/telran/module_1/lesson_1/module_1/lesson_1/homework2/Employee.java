package de.telran.module_1.lesson_1.module_1.lesson_1.homework2;

public class Employee extends Human{
    private int age;

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Employee {" +
                "age=" + age +
                "} " + super.toString();
    }
}
