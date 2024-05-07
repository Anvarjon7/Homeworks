package de.telran.module_1.lesson_1.module_1.lesson_1.homework19;

import java.util.Scanner;

public class AuthorizationApp {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your login:");
        String login = scanner.nextLine();
        System.out.println("Enter your password:");
        String password = scanner.nextLine();
        System.out.println("Confirm your password: ");
        String confirmPassword = scanner.nextLine();

        if (register(login, password, confirmPassword)) {
            System.out.println("User registered successfully");
        } else {
            System.out.println("User registration failed");
        }

    }


    private static boolean register(String login, String password, String confirmPassword) {
        try {
            validateLogin(login);
            validatePassword(password, confirmPassword);
            return true;
        } catch (WrongPasswordEx | WrongLoginEx e) {
            System.err.println("Exception: " + e.getMessage());
            return false;
        }
    }

    private static void validateLogin(String login) throws WrongLoginEx {
        String regexLog = "[a-zA-Z0-9_]+";
        if (login.length() >= 20 || !login.matches(regexLog)) {
            throw new WrongLoginEx("Login should contain only Latin letters, digits, and underscores, and its length should be less than 20 characters.");
        }
    }

    private static void validatePassword(String password, String confirmPassword) throws WrongPasswordEx {
        String passwordRegex = "[a-zA-Z0-9_]+";
        if (password.length() >= 20 || !password.matches(passwordRegex) || !password.equals(confirmPassword)) {
            throw new WrongPasswordEx("Password should contain only Latin letters, digits, and underscores, its length should be less than 20 characters, and it should match the confirmed password.");
        }
    }
}

class WrongLoginEx extends Exception {
    public WrongLoginEx() {
        super("Wrong login");
    }

    public WrongLoginEx(String message) {
        super(message);
    }
}

class WrongPasswordEx extends Exception {
    public WrongPasswordEx() {
        super("Wrong password");
    }

    public WrongPasswordEx(String message) {
        super(message);
    }
}