package de.telran.module_1.lesson_1.module_1.lesson_1.homework8.task2;

import java.util.*;
//===================================Найти сумму всех элементов ArrayList.===============================


public class SimpleArrayList {
    public static void main(String[] args) {
        List<Integer> arrayList = new ArrayList<>();
        arrayList.add(2);
        arrayList.add(4);
        arrayList.add(5);
        arrayList.add(6);
        arrayList.add(7);
        arrayList.add(8);
        arrayList.add(9);

        int sum = 0;
        for (int value : arrayList) {
            sum += value;
        }
        System.out.println("Сумма элементов Arraylist");
        System.out.println(sum);
        System.out.println("==================================================");



// 2 ==============================Перебрать ArrayList и вывести все элементы на экран.============================================


        Iterator<Integer> iterator = arrayList.iterator();

        while (iterator.hasNext()) {
            int value = iterator.next();
            System.out.println(value);
        }

//3================================Перебрать ArrayList и найти наименьший элемент.================================================
        System.out.println("==============Наименьший элемент в Arraylist=====================");

        int findMinElemFromList = findMinElem(arrayList);
        System.out.println(findMinElemFromList);

    }

    private static int findMinElem(List<Integer> list) {
        if (list.isEmpty()) {
            return 0;
        }
        int minElem = list.get(0);

        for (int num : list) {
            if (num < minElem) {
                minElem = num;
            }
        }
        return minElem;
    }


//========================================Перебрать ArrayList и удалить все четные числа.==================================================


    private static void removeEvenNum(List<Integer> list) {
        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()) {
            int elem = iterator.next();
            if (elem % 2 == 0) {
                iterator.remove();
            }
        }
    }

//===================================Перебрать ArrayList и найти сумму квадратов всех элементов.=========================


    private static int calcSumOfSquare(List<Integer> list) {
        int sum = 0;
        for (int num : list) {
            sum += num * num;
        }
        return sum;
    }


// ================================Перебрать ArrayList и найти самую короткую строку.====================================


    private static String findShortestStr(List<String> list) {
        if (list.isEmpty()) {
            return null;
        }
        String shortestStr = list.get(0);

        for (String s : list) {
            if (s.length() < shortestStr.length()) {
                shortestStr = s;
            }
        }
        return shortestStr;
    }

//===================================Перебрать ArrayList и найти второй по величине элемент.==============================================================

    private static int findSecondLargestElem(List<Integer> list){
        if (list.size() < 2){
            System.out.println("The List must contain at least 2 elements!!!");
        }

        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int i : list) {
            if (i > largest){
                secondLargest = largest;
                largest = i;
            }
            if (i > secondLargest && i < largest){
                secondLargest = i;
            }
        }
        return secondLargest;
    }

// ================================================Перебрать ArrayList и вывести все строки, содержащие только буквы.======================================

    private static void printStrContainingOnlyLetter(List<String>list){
        for (String str : list) {
            if (containsOnlyLetters(str)){
                System.out.println(str);
            }
        }
    }

    private static boolean containsOnlyLetters(String str){
        for (char ch : str.toCharArray()) {
            if (!Character.isLetter(ch)){
                return false;
            }
        }
        return true;
    }


// ============================Перебрать ArrayList и найти наибольшую возрастающую последовательность элементов==============================================

    private static List<Integer> findLongestIncreasingSequence(List<Integer> list){
        List<Integer>  currentSeq = new ArrayList<>();
        List<Integer> longestSeq = new ArrayList<>();

        for (int i = 0; i < list.size(); i++) {
            if (i == 0 || list.get(i) > list.get(-1)) {
                currentSeq.add(list.get(i));
            }else {
                currentSeq = new ArrayList<>();
                currentSeq.add(list.get(i));
            }
            if (currentSeq.size() > longestSeq.size()){
                longestSeq = new ArrayList<>(currentSeq);
            }
        }
        return longestSeq;
    }

//=========================Перебрать ArrayList и создать новый список, содержащий только уникальные строки.==================

}
