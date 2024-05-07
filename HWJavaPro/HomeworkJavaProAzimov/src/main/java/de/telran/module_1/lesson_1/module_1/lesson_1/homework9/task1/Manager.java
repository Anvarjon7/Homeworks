package de.telran.module_1.lesson_1.module_1.lesson_1.homework9.task1;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.sql.Timestamp;
@Getter
@Setter
@AllArgsConstructor
public class Manager {
    private int id;
    private String firstName;
    private String lastName;
    private int status;
    private Timestamp createdAt;
    private Timestamp updatedAt;
}
