package de.telran.algorithms.leetcodeTaskSolutions.tasks;


import java.util.*;

public class Practice4 {
    public static void main(String[] args) {

        int[] nums = {1, 2, 3, 4 };
        System.out.println(Arrays.toString(productExceptSelf(nums)));


    }

    private static Map<Integer, Integer> valToIndex;
    private static List<Integer> values;
    private static Random rand;

    public Practice4() {
        valToIndex = new HashMap<>();
        values = new ArrayList<>();
        rand = new Random();
    }

    public static boolean insert(int val) {
        if (valToIndex.containsKey(val)) {
            return false;
        }
        valToIndex.put(val, values.size());
        values.add(val);
        return true;

    }

    public static boolean remove(int val) {
        if (!valToIndex.containsKey(val)) {
            return false;
        }
        int lastElement = values.getLast();
        int idxToReplace = valToIndex.get(val);
        values.set(idxToReplace, lastElement);
        valToIndex.put(lastElement, idxToReplace);
        values.removeLast();
        valToIndex.remove(val);
        return true;
    }

    public static int getRandom() {
        return values.get(rand.nextInt(values.size()));
    }

    private static int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] left = new int[n];
        int[] right = new int[n];
        int[] result = new int[n];

        // Initialize left and right arrays
        left[0] = 1;
        right[n - 1] = 1;

        // Calculate left products
        for (int i = 1; i < n; i++) {
            left[i] = left[i - 1] * nums[i - 1];
        }

        // Calculate right products
        for (int i = n - 2; i >= 0; i--) {
            right[i] = right[i + 1] * nums[i + 1];
        }

        // Calculate the result
        for (int i = 0; i < n; i++) {
            result[i] = left[i] * right[i];
        }

        return result;
    }

}


