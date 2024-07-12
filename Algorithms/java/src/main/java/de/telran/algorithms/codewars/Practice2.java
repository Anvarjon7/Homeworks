package de.telran.algorithms.codewars;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Practice2 {
    public static void main(String[] args) {

        int[] arr = {2334454, 5};
        System.out.println(Arrays.toString(minMax(arr)));

        int a = -1;
        int b = 2;
        System.out.println(getSum(a,b));

        double weight = 95.0;
        double height = 172.0;
        System.out.println(bmi(weight,height));

        System.out.println(nbYear(1000,0.02,50,2000));

        System.out.println(isHappy(22));

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

    private static boolean isSquare(int n) {
        if(n < 0 ) return false;

        int sqrt =(int) Math.sqrt(n);

        return sqrt * sqrt == n;
    }

    private static int nbYear(int p0, double percent, int aug, int p){

        if(p0 < 0 || percent < 0.0 || p < 0) return -1;

        int years = 0;
        while (p0 <= p){
            p0 += (int) (p0 * percent / 100.0 + aug);
            years++;
        }

        return years;
    }

    private static boolean isHappy(int n){

        Set<Integer> seen = new HashSet<>();

        while (n != 1 && !seen.contains(n)){
            seen.add(n);
            n = getNext(n);
        }
        return n == 1;
    }

    private static int getNext(int n) {

        int total = 0;

        while (n > 0){
            int digit = n % 10;
            total += digit * digit;
            n /= 10;
        }
        return total;
    }


}
