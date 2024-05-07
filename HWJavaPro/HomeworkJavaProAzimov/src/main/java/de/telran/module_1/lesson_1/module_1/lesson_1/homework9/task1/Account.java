package de.telran.module_1.lesson_1.module_1.lesson_1.homework9.task1;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.security.Timestamp;
@Getter
@Setter
@AllArgsConstructor
public class Account {
    private byte id;
    private byte[] clientId;
    private String name;
    private int type;
    private int status;
    private BigDecimal balance;
    private int currencyNode;
    private Timestamp createdAt;
    private Timestamp updatedAt;
}
