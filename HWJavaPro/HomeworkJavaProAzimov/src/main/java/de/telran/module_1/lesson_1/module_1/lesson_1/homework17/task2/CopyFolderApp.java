package de.telran.module_1.lesson_1.module_1.lesson_1.homework17.task2;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class CopyFolderApp {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the path to an exiting folder: ");
        String sourceFolderPath = scanner.nextLine();

        System.out.println("Enter the name for a new folder: ");
        String destinationFolderPath = scanner.nextLine();

        try {
            copyFolder(sourceFolderPath,destinationFolderPath);
            System.out.println("Copy completed successFully.");
        }catch (IOException ex){
            System.out.println("An error occurred while copying the folder: " + ex.getMessage());
        }finally {
            scanner.close();
        }
    }

    private static void copyFolder(String sourceFolderPath,String destinationFolderPath)throws IOException{
        File sourceFolder = new File(sourceFolderPath);
        File destinationFolder = new File(destinationFolderPath);

        FileUtils.copyDirectory(sourceFolder,destinationFolder);
    }
}
