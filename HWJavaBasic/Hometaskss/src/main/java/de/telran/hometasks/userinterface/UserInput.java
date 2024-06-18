package Hometaskss.src.main.java.de.telran.hometasks.userinterface;

import java.util.Scanner;

public class UserInput {
    public int userInput() {
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        return input;
    }
    public double userDouble(){
        Scanner scanner = new Scanner(System.in);
        double input2 = scanner.nextInt();
        return input2;
    }


}

