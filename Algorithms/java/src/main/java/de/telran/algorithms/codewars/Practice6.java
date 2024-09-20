package de.telran.algorithms.codewars;

public class Practice6 {

    public static void main(String[] args) {

        System.out.println(triAngle(4,4,1));
    }

    private static boolean triAngle(int a, int b, int c) {
        if (a <= 0 || b <= 0 || c <= 0) return false;

        return (a + b > c) && (a + c > b) && (b + c > a);
    }
}
