package de.telran.module_1.lesson_1.module_1.lesson_1.homework17.task2;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class CreateFolderApp {
    public static void main(String[] args) {
        String folderPath = "C:\\Users\\Win-10\\IdeaProjects\\HomeworkJavaProAzimov\\newFolder";
//        File folder = new File(folderPath);
//        if (folder.mkdir()){
//            System.out.println("The folder was created successfully");
//        }else {
//            System.out.println("Could not create folder.");
//        }

        String fileName = "file.txt";
        String textToWrite = "This is a newFile";
        try {
            createFileAndWriteText(folderPath,fileName,textToWrite);
            System.out.println("The file was successfully created and text was written to it.");
        }catch (IOException e){
            System.out.println("An error occurred while creating the file and writing text: " + e.getMessage());
        }

    }

    private static void createFileAndWriteText(String folderPath,String fileName,String textToWrite) throws IOException{
        File folder = new File(folderPath);
        if (!folder.exists()){
            folder.mkdir();
        }
        File file = new File(folder,fileName);
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file))){
            writer.write(textToWrite);
        }

    }
}
