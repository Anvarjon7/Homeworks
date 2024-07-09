package de.telran.algorithms.codewars;

import java.util.Arrays;

public class Practice2 {
    public static void main(String[] args) {

        int[] arr = {2334454, 5};
        System.out.println(Arrays.toString(minMax(arr)));

        int a = -1;
        int b = 2;
        System.out.println(getSum(a,b));

        double weight = 85.0;
        double height = 165.0;
        System.out.println(bmi(weight,height));

    }

    private static int[] minMax(int[] arr) {
        int min = arr[0];
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return new int[]{min, max};
    }

    private static int getSum(int a, int b) {

        int min = Math.min(a, b);
        int max = Math.max(a, b);

        int sum = 0;

        for (int i = min; i <= max; i++) {
            sum += i;
        }

        return sum;
    }

    private static String bmi(double weight, double height) {

        double result = weight/(height * height);

        if (result <= 18.5) {
            return "Underweight";
        }
        else if (result <= 25.0) {
            return "Normal";
        }
        else if (result <= 30.0) {
            return "Overweight";
        }

        return "Obese";
    }
}
