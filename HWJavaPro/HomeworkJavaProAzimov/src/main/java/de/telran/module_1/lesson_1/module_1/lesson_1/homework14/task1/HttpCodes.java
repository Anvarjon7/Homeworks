package de.telran.module_1.lesson_1.module_1.lesson_1.homework14.task1;

import java.util.function.BiFunction;
import java.util.function.Consumer;


public enum HttpCodes {

    INFORMATIONAL(100, 199,
            ((code) -> System.out.println(code + " принадлежит INFORMATIONAL группе в перечислении HttpCodes."))), //100-199
    SUCCESS(200, 299,
            ((code) -> System.out.println(code + " принадлежит SUCCESS группе в перечислении HttpCodes." ))), //200-299
    REDIRECTION(300, 399,
            ((code) -> System.out.println(code + " принадлежит REDIRECTION группе в перечислении HttpCodes." ))), //300-399
    CLIENT_ERROR(400, 499,
            ((code) -> System.out.println(code + " принадлежит CLIENT_ERROR группе в перечислении HttpCodes." ))), //400-499
    SERVER_ERROR(500, 599,
            ((code) -> System.out.println(code + " принадлежит SERVER_ERROR группе в перечислении HttpCodes." ))); //500-599

    int minCode;
    int maxCode;
    Consumer<HttpCodes> valConsumer;

    HttpCodes(int minCode, int maxCode, Consumer<HttpCodes> consumer) {
        this.minCode = minCode;
        this.maxCode = maxCode;
        this.valConsumer = consumer;
    }

    public static void findValueByCode(int code) {
        for (HttpCodes v : HttpCodes.values()) {
            if (code >= v.minCode && code <= v.maxCode) {
                v.doRunConsumer();
                break;
            }
        }
    }

    public void doRunConsumer() {
        if (valConsumer != null)
            valConsumer.accept(this);
    }



}
