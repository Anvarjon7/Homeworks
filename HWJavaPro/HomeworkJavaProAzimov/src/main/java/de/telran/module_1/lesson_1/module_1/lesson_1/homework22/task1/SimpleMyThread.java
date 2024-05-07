package de.telran.module_1.lesson_1.module_1.lesson_1.homework22.task1;

import java.util.Scanner;

public class SimpleMyThread {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter quantity of threads: ");
        int userInp = scanner.nextInt();

        new MyThread(1).start();
        for (int i = 1; i <= userInp; i++) {
            Thread thread = new MyThread(i);
            thread.start();
        }
    }
}
class MyThread extends Thread{

    private final int thNum;

    public MyThread(int thNum) {
        this.thNum = thNum;
    }

    @Override
    public void run(){
        for (int i = 0; i < 100; i++) {
            System.out.println("Thread " + thNum + " - Iteration " + (i + 1));
            try {
                Thread.sleep(100);
            }catch (InterruptedException e){
                throw new RuntimeException(e);
            }
        }
    }
}