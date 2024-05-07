package de.telran.module_1.lesson_1.module_1.lesson_1.homework18.task2;

import java.util.Scanner;

public class SimpleRegularExpression {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a new password:");
        String test = scanner.nextLine();

        if (isValid(test)){
            System.out.println("The password meet all criteria");
        }else {
            System.out.println("The password does not meet all criteria ");
        }

    }
    private static boolean isValid(String test){
        String regex = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[!@#$%^&*_+\\-=])[a-zA-Z\\d!@#$%^&*_+\\-=]{8,}$";
        return test.matches(regex);
    }
}
