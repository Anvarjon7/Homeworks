package de.telran.module_1.lesson_1.module_1.lesson_1.homework15.task1;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class PracticeTasks {

    //     1) Дан лист строк "BigBen", "BigBob", "Big", "Ben", "Big Bob".
//    Сколько раз объект «Big» встречается в коллекции?
    List<String> stringList = Arrays.asList("BigBen", "BigBob", "Big", "Ben", "Big Bob");
    long count = stringList.stream()
            .filter(s -> s.equals("Big"))
            .count();

    //    2) Найти самый маленький элемент: Arrays.asList("a1", "b5", "a2", "b4")
    List<String> list = Arrays.asList("a1,b5,a2, b4");
    Optional<String> minElem = list.stream()
            .min(String::compareTo);

//    3) Выполнить сортировку в обратном алфавитном порядке и удалить дубликаты.
//            Arrays.asList("a1", "b5", "c1", "a2", "b4", "c1", "a1");
    List<String> list2 = Arrays.asList("a1", "b5", "c1", "a2", "b4", "c1", "a1");

    List<String>  reversedList = list2.stream()
            .sorted()
            .distinct()
            .collect(Collectors.toList());
}
