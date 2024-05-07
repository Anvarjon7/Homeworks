package de.telran.module_1.lesson_1.module_1.lesson_1.homework5.task1;

import lombok.Getter;

@Getter
public enum Month {
    JANUARY ("Январь", "Зима"),
    FEBRUARY("Февраль", "Зима"),
    MARCH("Март","Весна"),
    APRIL("Апрель","Весна"),
    MAY("Май","Весна"),
    JUNE("Июнь","Лето"),
    JULY("Июль","Лето"),
    AUGUST("Август","Лето"),
    SEPTEMBER("Сентябрь","Осень"),
    OCTOBER("Октябь","Осень"),
    NOVEMBER("Ноябрь","Осень"),
    DECEMBER("Декабрь", "Зима");

    private final String russianName;
    private final String season;

    Month(String russianName, String season) {
        this.russianName = russianName;
        this.season = season;
    }

    public  String recommendDiet(){
        switch (season){
        case "Зима":
        return "Рекомендуется употребление питательных блюд, богатых витаминами и минералами, чтобы поддержать иммунитет в холодное время года.";
        case "Весна":
        return "Весной рекомендуется включить в рацион свежие фрукты и овощи, а также легкие белки.";
        case "Лето":
        return "В летний период рекомендуется употребление свежих фруктов, овощей и легких блюд для поддержания гидратации и легкости.";
        case "Осень":
        return "Осенью рекомендуется включить в рацион питательные продукты, богатые витаминами, чтобы подготовить организм к холодному сезону.";
        default:
        return "Некорректный сезон";
        }
    }


}
