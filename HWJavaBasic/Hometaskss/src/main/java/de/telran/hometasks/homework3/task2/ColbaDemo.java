package Hometaskss.src.main.java.de.telran.hometasks.homework3.task2;

import Hometaskss.src.main.java.de.telran.hometasks.userinterface.UserInput;

public class ColbaDemo {
    public static void main(String[] args) {
        UserInput ui = new UserInput();
        CheckColba checkColba = new CheckColba();
        System.out.println("Please enter temp. for first colba: ");
        double resultTemp1 = ui.userDouble();
        System.out.println("Please enter temp. for second colba: ");
        double resultTemp2 = ui.userDouble();
        System.out.println("Does your device works correctly? -->> " + checkColba.checkColba(resultTemp1,resultTemp2));
    }
}
