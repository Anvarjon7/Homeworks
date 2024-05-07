package de.telran.module_1.lesson_1.module_1.lesson_1.homework9.task1;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.sql.Timestamp;
@Getter
@Setter
@AllArgsConstructor
public class Transaction {
    private byte[] debitAccountId;
    private byte[] creditAccountId;
    private byte id;
    private int type;
    private BigDecimal amount;
    private String description;
    private Timestamp createdAt;
}
