package de.telran.module_1.lesson_1.module_1.lesson_1.homework2;

public class Human extends Earthling{

    private String country;

    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public String toString() {
        return "Human {" +
                "country='" + country + '\'' +
                "} " + super.toString();
    }
}
