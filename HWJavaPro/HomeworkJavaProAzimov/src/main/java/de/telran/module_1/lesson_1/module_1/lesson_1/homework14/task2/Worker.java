package de.telran.module_1.lesson_1.module_1.lesson_1.homework14.task2;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class Worker {
    List<Consumer<Work>> consumerList = new ArrayList<>();

    public void addTask(Consumer<Work> workConsumer){
        consumerList.add(workConsumer);
    }
    public void doDailyWork(){
        System.out.println("The laborer begins his working day:");
        for (Consumer<Work> task : consumerList){
            Work work = () -> {
                System.out.println("Task in progress:");
                task.accept(() -> System.out.println("Low skilled work."));
            };
            task.accept(work);
        }
    }
}
