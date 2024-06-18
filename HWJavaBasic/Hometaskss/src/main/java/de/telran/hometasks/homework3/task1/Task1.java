package Hometaskss.src.main.java.de.telran.hometasks.homework3.task1;

public class Task1 {


        public static void main(String[] args) {
            boolean isWeekend = true;
            boolean isRain = false;


            boolean canWalk = isWeekend && !isRain;


            if (canWalk) {
                System.out.println("Можно прогуляться.");
            } else {
                System.out.println("Лучше остаться дома.");
            }
        }
    }


