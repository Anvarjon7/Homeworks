package de.telran.module_1.lesson_1.module_1.lesson_1.homework22.task2;

import lombok.SneakyThrows;

import java.util.Scanner;

public class RobotTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of details: ");
        int inputTotalDet = scanner.nextInt();

        Table table = new Table();
        Thread robotThread1 = new Thread(new Robot(table,inputTotalDet));
        Thread robotThread2 = new Thread(new Robot(table,inputTotalDet));

        robotThread1.start();
        robotThread2.start();

        try {
            robotThread1.join();
            robotThread2.join();
        }catch (InterruptedException e){
            throw new RuntimeException(e);
        }

        System.out.println("The work is completed");
    }
}


class Table {
    private int detailCount = 0;

    public synchronized void putDetail() {
        try {
            while (detailCount > 0) {
                wait();
            }
            Thread.sleep(1000);
            System.out.println("Robot 1 put detail on the table");
            detailCount++;
            notify();

        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public synchronized void takeDetail() {
        try {
            while (detailCount == 0) {
                wait();
            }
            Thread.sleep(1000);
            System.out.println("Robot 2 got the detail from the table");
            detailCount--;
            notify();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}

class Robot extends Thread {
    private final Table table;
    private final int totalDet;

    public Robot(Table table, int totalDet) {
        this.table = table;
        this.totalDet = totalDet;
    }

    @SneakyThrows
    @Override
    public void run(){
        for (int i = 0; i < totalDet; i++) {
            table.putDetail();
            table.takeDetail();
        }
    }
}


//У вас есть стол, на который один робоманипулятор ложит деталь, а второй забирает эту деталь забирает.
//Когда Робот1 положит деталь на стол, он должен обязательно ждать, пока Робот2 заберет эту деталь
//и только тогда ложить следующую. Постройте программу, которая автоматизирует эту работу.
//Количество деталей, которые должны обработать манипуляторы, пользователь задает с клавиатуры.