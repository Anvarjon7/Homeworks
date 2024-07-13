package de.telran.algorithms.codewars;

public class Practice3 {
    public static void main(String[] args) {

        String str = "Hello World";

        System.out.println(toAlternativeString(str));
    }

    private static String toAlternativeString(String str) {

        StringBuilder stringBuilder = new StringBuilder();

        char[] chars = str.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (Character.isUpperCase(chars[i])) {
                stringBuilder.append(Character.toLowerCase(chars[i]));
            } else {
                stringBuilder.append(Character.toUpperCase(chars[i]));
            }
        }

        return stringBuilder.toString();
    }

    private static int expressionsMatter(int a, int b, int c) {
        if (a < 0 || b < 0 || c < 0) {
            return 0;
        }
        int[] result = new int[6];
        result[0] = a + b + c;
        result[1] = a + b * c;
        result[2] = a * b + c;
        result[3] = a * b * c;
        result[4] = (a + b) * c;
        result[5] = a * (b + c);

        int max = result[0];
        for (int i = 1; i < result.length; i++) {
            if (result[i] > max) {
                max = result[i];
            }
        }
        return max;
    }
}
