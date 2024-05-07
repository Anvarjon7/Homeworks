package de.telran.module_1.lesson_1.module_1.lesson_1.homework3.task1;

public class Telegram implements Messenger{

    private String receiveMessage;
    @Override
    public void sendMessage(String message) {
        System.out.println("I can send Message from " + message);
    }

    @Override
    public String getMessage() {
        return receiveMessage;
    }
}
