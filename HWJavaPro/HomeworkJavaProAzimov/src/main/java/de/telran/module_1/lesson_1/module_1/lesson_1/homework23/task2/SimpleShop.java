package de.telran.module_1.lesson_1.module_1.lesson_1.homework23.task2;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class SimpleShop {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter max quantity of products in the shop: ");
        int maxCapacity = scanner.nextInt();

        Shop shop = new Shop(maxCapacity);

        Thread supplierThr = new Thread(new Supplier(shop));
        supplierThr.start();
        for (int i = 1; i <= 5 ; i++) {
            Thread customerThr = new Thread(new Customer(shop));
            customerThr.start();
        }
    }
}

class Shop {

    private final int maxCapacity;
    private int current;
    private final Queue<Object> queueStock;

    public Shop(int maxCapacity) {
        this.maxCapacity = maxCapacity;
        this.current = 0;
        this.queueStock = new LinkedList<>();
    }

    public synchronized void bringProduct() {
        while (current >= maxCapacity) {
            try {
                System.out.println("The shop is full.Supplier is waiting....");
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        queueStock.offer(new Object());
        current++;
        System.out.println("Supplier put 1 product.Quantity of products -> " + current);
        notify();
    }

    public synchronized void purchaseProduct() {
        while (current <= 0) {
            try {
                System.out.println("The shop is empty. The customer is waiting for a product....");
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);

            }
            queueStock.poll();
            current--;
            System.out.println("The customer got 1 product from the shop. Quantity of products -> " + current);
            notify();
        }
    }
}

class Supplier implements Runnable {

    private Shop shop;

    public Supplier(Shop shop) {
        this.shop = shop;
    }

    @Override
    public void run() {
        while (true) {
            shop.bringProduct();
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class Customer implements Runnable {

    private Shop shop;

    public Customer(Shop shop) {
        this.shop = shop;
    }

    @Override
    public void run() {
        while (true) {
            shop.purchaseProduct();
            try {
                Thread.sleep(1500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}


//    Есть Магазин, на котором может одновременно разместиться ограниченное количество товара (для примера можно взять 3 единицы,
// а лучше попросить пользователя ввести количество).
// За один раз Поставщик может привезти 1 шт. товара.
// Покупатель тоже может приобрести только 1 шт. товара.
// Напишите программу, которая позволит Покупателям приобретать товар и нужно сделать так, чтобы полки магазина не пустовали ;)
// Используйте wait / notify механизм многопоточности. Поставщик и Покупатель/ли - это разные потоки.