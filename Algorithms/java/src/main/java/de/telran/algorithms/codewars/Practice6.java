package de.telran.algorithms.codewars;

import java.util.Arrays;

public class Practice6 {

    public static void main(String[] args) {

        System.out.println(triAngle(4,4,1));

        String[] result = towerBuilder(8);
        for (String floor : result){
            System.out.println(floor);
        }

        System.out.println(Arrays.toString(towerBuilder(7)));

        System.out.println(binary(1,1));
    }

    private static boolean triAngle(int a, int b, int c) {
        if (a <= 0 || b <= 0 || c <= 0) return false;

        return (a + b > c) && (a + c > b) && (b + c > a);
    }

    private static String[] towerBuilder(int floors){

        String[] tower = new String[floors];

        int maxWidth = 2 * floors - 1;

        for (int i = 1; i <= floors; i++) {
            int stars = 2 * i - 1;
            int padding = (maxWidth - stars) / 2;

            String floor = " ".repeat(padding) + "*".repeat(stars) + " ".repeat(padding);

            tower[i - 1] = floor;
        }

        return tower;
    }

    private static String binary(int a, int b){
        int sum = a + b;
        StringBuilder result = new StringBuilder();

        while (sum > 0){

            int remainder = sum % 2;
            result.insert(0,remainder);

            sum = sum / 2;
        }

        return result.toString();
    }

    private static String decimalToBinary(int a,int b){
        int sum = a + b;
        return Integer.toBinaryString(sum);
    }


}
