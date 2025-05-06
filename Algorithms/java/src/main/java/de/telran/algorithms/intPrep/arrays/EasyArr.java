package de.telran.algorithms.intPrep.arrays;

import java.util.TreeSet;

public class EasyArr {

    public static void main(String[] args) {
        int[] arr = {1,23,5,6,7,3};
        System.out.println(thirdMax(arr));

    }

    static int thirdMax(int[] arr){
        TreeSet<Integer> set = new TreeSet<>();

        for (int num : arr){
            set.add(num);
            if (set.size() > 3){
                set.pollLast();
            }
        }

        if (set.size() < 3){
            return set.first();
        }

        return set.last();
    }
}
