package de.telran.module_1.lesson_1.module_1.lesson_1.homework15.task2;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
class Employees {
    private String name, surname, middleName;
    private String profession;
    private String department;
    private Double salary;
}
