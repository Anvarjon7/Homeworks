package de.telran.module_1.lesson_1.module_1.lesson_1.homework6.task1;

import lombok.Getter;

@Getter
public class Transport {
    private String type;
    private double cost;
    private double time;

    public Transport(String type, double cost, double time) {
        this.type = type;
        this.cost = cost;
        this.time = time;
    }
}
//        1) Вы строите предприятие по перевозке пассажиров.
//        Постройте приложение, которое позволит пассажиру находить более удобный транспорт (Самолет, Автобус, Поезд и т.п.)
//        для поездки исходя из 2-х пожеланий: более низкой стоимости и более быстрого времени доставки.