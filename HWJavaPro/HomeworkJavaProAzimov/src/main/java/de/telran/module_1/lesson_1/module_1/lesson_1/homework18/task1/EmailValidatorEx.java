package de.telran.module_1.lesson_1.module_1.lesson_1.homework18.task1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailValidatorEx {
    public static void main(String[] args) {

        String email = "my_25@domen-38.de";
        if (isValid(email)){
            System.out.println("Email is valid");
        }
        else {
            System.out.println("Email is not valid");
        }

    }
    private static boolean isValid(String email){
        String regex = "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    }
}
