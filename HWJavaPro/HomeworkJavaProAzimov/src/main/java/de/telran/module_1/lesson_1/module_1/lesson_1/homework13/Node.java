package de.telran.module_1.lesson_1.module_1.lesson_1.homework13;

import lombok.*;

@Setter
@Getter
@AllArgsConstructor
@EqualsAndHashCode
@NoArgsConstructor
@ToString
public class Node {
    private int key;
    private String value;
    private Node left;
    private Node right;

    public void printNode() {
        System.out.println(value);
    }
}
