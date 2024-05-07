package de.telran.module_1.lesson_1.module_1.lesson_1.homework23.task1;

public class HotelSimulation{
    public static void main(String[] args) {

        Hotel hotel = new Hotel();

        Thread administration = new Thread(new Administrator(hotel));
        administration.start();

        for (int i = 1; i <= 5; i++) {
            System.out.println("----------------- " + i + " ------------------");
            Thread guest = new Thread(new Guest(hotel));
            guest.start();

            try{
                Thread.sleep(1500);
            }catch (InterruptedException e){
                throw new RuntimeException(e);
            }
        }


    }
}

 class Hotel {

    boolean isGuestArrived = false;

    public synchronized void ringBell(){
        System.out.println("Guest call. Preparing for service...");
        isGuestArrived = true;
        notify();
    }

    public synchronized void serveGuest(){
        while (!isGuestArrived){
            try{
                System.out.println("The administrator is waiting for a new guest...");
                wait();
            }catch (InterruptedException e){
                throw new RuntimeException(e);
            }
        }
        System.out.println("The administrator is serving for a guest");
        isGuestArrived = false;
    }
}

class Guest implements Runnable {

    private Hotel hotel;

    public Guest(Hotel hotel) {
        this.hotel = hotel;
    }

    @Override
    public void run() {
        System.out.println("The guest enters the hotel. ");
        hotel.ringBell();
        System.out.println("The guest receives service.");
    }
}

class Administrator implements Runnable{

    private Hotel hotel;

    public Administrator(Hotel hotel) {
        this.hotel = hotel;
    }

    @Override
    public void run() {
        while (true){
            hotel.serveGuest();
        }
    }
}



//1. Вы въезжаете в отель и подходите к стойке администратора. За стойкой никого нет, но на ней стоит звоночек,
// используя который Вы можете позвать администратора. Т.к. наплыв гостей очень редко бывает большим,
// чтобы организовывалась очередь, администратор обычно "уходит по своим делам", обслужив Вас и ждет следующего звонка.
// Напишите программу, которая автоматизирует данный процесс обслуживания.
// Гость и Администратор - отдельные потоки приложения.
// Используйте wait / notify механизм многопоточности