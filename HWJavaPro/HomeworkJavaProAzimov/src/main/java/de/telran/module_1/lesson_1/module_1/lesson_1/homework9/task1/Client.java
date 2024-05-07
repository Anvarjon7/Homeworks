package de.telran.module_1.lesson_1.module_1.lesson_1.homework9.task1;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.sql.Timestamp;
@Getter
@Setter
@AllArgsConstructor
public class Client {
    private byte id;
    private int status;
    private int managerId;
    private String taxCode;
    private String firstName;
    private String lastNAme;
    private String email;
    private String address;
    private String phone;
    private Timestamp createdAt;
    private Timestamp updatedAt;
}
