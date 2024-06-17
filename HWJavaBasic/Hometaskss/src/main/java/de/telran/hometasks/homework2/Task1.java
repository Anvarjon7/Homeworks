package de.telran.hometasks.homework2;

public class Task1 {

    public static void main(String[] args) {
        String myString = "I study Basic Java!";
        System.out.println(myString);

        int txtLenght = myString.length();
        System.out.println("Распечатать пред-последний символ строки:");
        System.out.println(myString.charAt(txtLenght - 2));
        System.out.println(" Содержит ли ваша строка подстроку “Java”?");
        System.out.println(myString.contains("Java"));

        System.out.println(myString.substring(14));
        System.out.println(myString.replace("a","o"));
        System.out.println(myString.toLowerCase());
        System.out.println(myString.toUpperCase());


    }
    }



//Создайте строку через new - I study Basic Java!
//
//Напишите метод, который принимает в качестве параметра строку, передайте в
//этот метод строку, которую создали в п.1
//
//Распечатать пред-последний символ строки. Используем метод String.charAt().
//
//Проверить, содержит ли ваша строка подстроку “Java”. Используем метод
//String.contains().
//
//Вырезать строку Java c помощью метода String.substring().
//
//Заменить все символы “а” на “о”.
//
//Преобразуйте строку к верхнему регистру.
//
//Преобразуйте строку к нижнему регистру.
//
//
