package de.telran.algorithms.intPrep.arrays;

import java.util.*;

public class EasyArr {

    public static void main(String[] args) {
        int[] arr = {4,3,2,7,8,2,3,1};

        findDisappearedEl(arr);
        System.out.println(flippingBits(9));
    }

    static long flippingBits(long n){
        return ~n & 0XFFFFFFFFL;
    }

    static List<Integer> findDisappearedEl(int[] nums) {
        List<Integer> res = new ArrayList<>();
        boolean[] seen = new boolean[nums.length];
        for (int num : nums) {
            seen[num - 1] = true;
        }

        for (int i = 0; i < nums.length; i++) {
            if (!seen[i]) {
                res.add(i + 1);
            }
        }
        return res;
    }

    static int countPairsWithDiff(int[] arr, int k) {
        Set<Integer> set = new HashSet<>();
        int counter = 0;
        for (int num : arr) {
            set.add(num);
        }
        for (int num : arr) {
            if (set.contains(num + k)) {
                counter++;
            }
        }
        return counter;
    }

    static int thirdMax(int[] arr) {
        TreeSet<Integer> set = new TreeSet<>();

        for (int num : arr) {
            set.add(num);
            if (set.size() > 3) {
                set.pollLast();
            }
        }

        if (set.size() < 3) {
            return set.first();
        }

        return set.last();
    }
}
