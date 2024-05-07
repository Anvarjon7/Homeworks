package de.telran.module_1.lesson_1.module_1.lesson_1.homework9.task1;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.sql.Timestamp;
@Getter
@Setter
@AllArgsConstructor
public class Product {
    private int id;
    private int managerId;
    private String name;
    private int status;
    private int currencyNode;
    private BigDecimal interestRate;
    private int limit;
    private Timestamp createdAt;
    private Timestamp updatedAt;
}
