package de.telran.module_1.lesson_1.module_1.lesson_1.homework12.task2;

import java.util.HashMap;
import java.util.Map;

public class FindElement {

    public static void main(String[] args) {
        int[] arr = {1,3,4,1,7,8,4,9,2,2,3};
        int res = findFirstElemWithTwoOccurrences(arr);
        if (res != -1){
            System.out.println("First element occurring n times: " + res);
        }
        else {
            System.out.println("No elements occur twice");
        }
    }
    private static int findFirstElemWithTwoOccurrences(int[] arr){
        Map<Integer,Integer> integerMap = new HashMap<>();
        for (int num : arr){
            integerMap.put(num,integerMap.getOrDefault(num,0) + 1);

            if (integerMap.get(num) == 2){
                return num;
            }
        }
        return -1;
    }
}
