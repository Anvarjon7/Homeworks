package de.telran.algorithms.patterns.creational.singletonEx;

import java.util.concurrent.atomic.AtomicReference;

public class Singleton2 {

    // Using AtomicReference to hold the Singleton instance
    private static final AtomicReference<Singleton2> instance = new AtomicReference<>();

    private String data;

    private Singleton2(String data){
        this.data = data;
    }

    public static Singleton2 getInstance(String data){
        Singleton2 current = instance.get();

        if (current == null) {
            current = new Singleton2(data);
            // Atomically set the instance if it's still null
            if (!instance.compareAndSet(null,current)){
                current = instance.get();
            }
        }
        return current;
    }

    public String getData(){
        return data;
    }
}
