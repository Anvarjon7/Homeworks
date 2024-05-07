package de.telran.module_1.lesson_1.module_1.lesson_1.homework17.task1;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class CreateNewFileEX {
    public static void main(String[] args) {

//        создание нового файла
//        String filePath = "newFile.txt";
//        try{
//            createFile(filePath);
//            System.out.println("The file was created successfully");
//        }catch (IOException ex){
//            System.out.println("An error occurred while creating the file: " + ex.getMessage());
//        }

//        путь к файлу
//        File newFile = new File(filePath);
//        String absPath = newFile.getAbsolutePath();
//        System.out.println(absPath);

//        удаление содержимое в файле
        String clearFile = "C:\\Users\\Win-10\\IdeaProjects\\HomeworkJavaProAzimov\\test.txt";
        try {
            clearFile(clearFile);
            System.out.println("The file was cleared successfully!");
        }catch (IOException e){
            System.out.println(e.getMessage());
        }
    }
    private static void createFile(String path) throws IOException {
        File file = new File(path);
        if (file.createNewFile()){
            System.out.println("The file was created at the path: " + file.getAbsolutePath());
        }else {
            System.out.println("The file already exists");
        }
    }
    private static void clearFile(String filePath) throws IOException{
        FileWriter writer = new FileWriter(filePath,false);
        BufferedWriter bufferedWriter = new BufferedWriter(writer);
        bufferedWriter.close();
        writer.close();
    }
}
