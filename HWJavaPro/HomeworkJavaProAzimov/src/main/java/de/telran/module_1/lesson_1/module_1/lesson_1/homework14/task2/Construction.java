package de.telran.module_1.lesson_1.module_1.lesson_1.homework14.task2;

public class Construction {
    public static void main(String[] args) {
        Worker worker = new Worker();

        worker.addTask(work -> work.doWork());
        worker.addTask(work -> System.out.println("Plastering buildings"));

        worker.doDailyWork();
    }
}
