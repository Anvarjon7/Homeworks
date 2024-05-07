package de.telran.module_1.lesson_1.module_1.lesson_1.homework9.task1;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.sql.Timestamp;
@Getter
@Setter
@AllArgsConstructor
public class Agreement {
    private int id;
    private byte[] accountId;
    private int productId;
    private BigDecimal interestRate;
    private int status;
    private BigDecimal sum;
    private Timestamp createdAt;
    private Timestamp updatedAt;
}
