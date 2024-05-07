package de.telran.module_1.lesson_1.module_1.lesson_1.homework2;

public class Engineer extends Employee{

    private String experience;

    public void setExperience(String experience) {
        this.experience = experience;
    }

    @Override
    public String toString() {
        return "Engineer {" +
                "experience='" + experience + '\'' +
                "} " + super.toString();
    }
}
