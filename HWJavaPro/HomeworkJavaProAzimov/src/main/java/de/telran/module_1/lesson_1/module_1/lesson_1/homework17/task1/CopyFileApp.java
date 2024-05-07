package de.telran.module_1.lesson_1.module_1.lesson_1.homework17.task1;

import java.io.*;
import java.util.Scanner;

public class CopyFileApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the path to an existing file: ");
        String sourceFilePath = scanner.nextLine();

        System.out.println("Enter a name for the new file: ");
        String destinationFilePath = scanner.nextLine();

        try {
            copyFile(sourceFilePath, destinationFilePath);
            System.out.println("Copy completed successfully.");
        } catch (IOException ex) {
            System.out.println("An error occurred while copying the file: " + ex.getMessage());
        } finally {
            scanner.close();
        }
    }

    private static void copyFile(String sourceFile, String destinationFile) throws IOException {
        try (BufferedReader reader = new BufferedReader(new FileReader(sourceFile));
             BufferedWriter writer = new BufferedWriter(new FileWriter(destinationFile))) {
            String line;
            while ((line = String.valueOf(reader.readLine())) != null)
                writer.write(line);
                writer.newLine();
        }
    }
}
