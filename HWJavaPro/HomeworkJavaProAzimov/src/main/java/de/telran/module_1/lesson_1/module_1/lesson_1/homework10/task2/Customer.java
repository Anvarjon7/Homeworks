package de.telran.module_1.lesson_1.module_1.lesson_1.homework10.task2;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public class Customer {
    private String fullName;
    private int birthYear;
    private String operationType;
    private int ticketNumber;

    public Customer(String fullName, int birthYear, String operationType) {
        this.fullName = fullName;
        this.birthYear = birthYear;
        this.operationType = operationType;
        this.ticketNumber = counter++;
    }

    private static int counter = 1;
}

