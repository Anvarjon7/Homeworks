package de.telran.module_1.lesson_1.module_1.lesson_1.homework8.task2;

import java.util.*;

public class SimpleLinkedList {
    public static void main(String[] args) {
        List<Integer> list = new LinkedList<>();
        list.add(2);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);
        list.add(9);
        double num = 0;
        for (int val : list) {
            num += val;
        }
        double average = num / list.size();
        System.out.println("Среднее значение элементов -->> " + average);


        int maxElem = findMaxElem(list);
        System.out.println("Наибольший элемент --->>> " + maxElem);


        System.out.println("========================================================================");


//  ======================================================================


        LinkedList<String> stringLinkedList = new LinkedList<>();
        stringLinkedList.add("Hello");
        stringLinkedList.add("What's up?");
        stringLinkedList.add("Where are you from?");
        stringLinkedList.add("This is the longest String");
        stringLinkedList.add("Apple");
        stringLinkedList.add("Ananas");

        String longestString = findLongestString(stringLinkedList);
        System.out.println(longestString);

        System.out.println("========================================================================");

        int count = countElemStartingWith(stringLinkedList, 'A');
        System.out.println("Кол-во элементов, начинающихся с буквы А -->> " + count);




        System.out.println("========================================================================");


        String targetStr = "Apple";

        int ind = findFirstOccurrence(stringLinkedList, targetStr);

        if (ind != -1) {
            System.out.println("Первое вхождение строки '" + targetStr + "' находится по индексу: " + ind);
        } else {
            System.out.println("Cтрока " + targetStr + " не найдена в списке");
        }
    }


//    ===============================================================================

    private static String findLongestString(List<String> list) {
        if (list.isEmpty()) {
            return null;
        }
        String longestStr = list.get(0);

        for (String text : list) {
            if (text.length() > longestStr.length()) {
                longestStr = text;
            }
        }
        return longestStr;
    }
//  ========================================================================

    private static int findMaxElem(List<Integer> list) {
        if (list.isEmpty())
            return 0;
        int max = list.get(0);
        for (int val : list) {
            if (val > max) {
                max = val;
            }
        }
        return max;
    }

//================================================================================

    private static int countElemStartingWith(List<String> list, char letter) {
        int count = 0;

        for (String str : list) {
            if (!str.isEmpty() && Character.toUpperCase(str.charAt(0)) == Character.toUpperCase(letter))
                count++;
        }
        return count;
    }

//================================================================================


    private static int findFirstOccurrence(List<String> list, String targetElem) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).equals(targetElem)) {
                return i;
            }
        }
        return -1;
    }

//================================================================================

    private static void removeElem(List<Person> list, int conditionAge) {
        Iterator<Person> iterator = list.iterator();
        while (iterator.hasNext()) {
            Person person = iterator.next();
            if (person.getAge() > conditionAge) {
                iterator.remove();
            }
        }
    }

//================================================================================


    private static void changeValue(List<Integer> list, int num) {
        ListIterator<Integer> iterator = list.listIterator();

        while (iterator.hasNext()) {
            int elem = iterator.next();
            if (elem % 3 == 0) {
                iterator.set(0);
            }
        }
    }


//================================Перебрать ArrayList и объединить все элементы в одну строку.==============================================

    private static String combineElements(List<String> list) {
        return String.join("", list);
    }


//=====================================================================================

    private static void removeSpecStr(List<String> list, String specStr) {
        ListIterator<String> listIterator = list.listIterator();
        while (listIterator.hasNext()) {
            String text = listIterator.next();
            if (text.contains(specStr)) {
                listIterator.remove();
            }
        }
    }

//========================================Перебрать LinkedList и вычислить произведение всех элементов=============================================

    private static int calculateElem(List<Integer> list) {
        ListIterator<Integer> listIterator = list.listIterator();

        int elem = 1;

        while (listIterator.hasNext()) {
            elem *= listIterator.next();
        }
        return elem;
    }


//=========================================Перебрать LinkedList и заменить все гласные буквы в каждой строке на символ '*'.==========================================================================

    private static void changeLetters(List<String> list) {
        ListIterator<String> listIterator = list.listIterator();

        while (listIterator.hasNext()) {
            String str = listIterator.next();
            String replaceLetters = str.replaceAll("[aeouiAEIOU]", "*");
            listIterator.set(replaceLetters);
        }
    }

//=========================================Перебрать LinkedList и вывести все элементы в обратном порядке.==================================================


    private static void printReverse(List<String> list) {
        ListIterator<String> listIterator = list.listIterator(list.size());

        while (listIterator.hasPrevious()) {
            String str = listIterator.previous();
            System.out.println(str);
        }
    }


//==========================================Перебрать LinkedList и найти самую длинную строку, не содержащую пробелов.===========================


    private static String findLargestStrWithoutSpaces(List<String> stringList) {
        String longestStr = "";

        ListIterator<String> listIterator = stringList.listIterator(stringList.size());
        while (listIterator.hasNext()) {
            String str = listIterator.next();

            if (!str.contains(" "))
                if (str.length() > longestStr.length()) {
                    longestStr = str;
                }
        }
        return longestStr;
    }


//=================================Перебрать LinkedList и удалить все дубликаты элементов.==============================

    private static void removeDuplicateElem(List<String> list){
        Set<String> set = new HashSet<>(list);
        ListIterator<String> listIterator = list.listIterator();

        while (listIterator.hasNext()){
            String str = listIterator.next();

            if (set.contains(str)){
                listIterator.remove();
            }else {
                set.add(str);
            }
        }
    }


//===========================================Перебрать LinkedList и объединить все строки в одну с использованием разделителя.===========

    private static String concatenateLinkedList(LinkedList<String> list,String separator){
        StringBuilder res = new StringBuilder();

        for (String str : list) {
            res.append(str);
            if (list.getLast() != str){
                res.append(separator);
            }
        }
        return res.toString();

    }



}

