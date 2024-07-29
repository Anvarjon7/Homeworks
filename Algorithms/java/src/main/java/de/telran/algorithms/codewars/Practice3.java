package de.telran.algorithms.codewars;

import java.util.*;

public class Practice3 {
    public static void main(String[] args) {

        String str = "Hello World";

        System.out.println(toAlternativeString(str));

        System.out.println(isPlural(1f));

        final String name = "Anwar";

        System.out.println(reverseLetter(name));

        int[] a = {1, 2, 2, 2, 3};

        System.out.println(Arrays.toString(arrayDiff(a, new int[]{2})));
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

    private static boolean isPlural(float f) {
        return f == 1 ? false : true;
    }

    private static int countPeoples(ArrayList<int[]> stops) {
        int count = 0;
        for (int[] stop : stops) {
            count += stop[0];
            count -= stop[1];
        }
        return Math.max(count, 0);
    }

    private static String reverseLetter(final String str) {

        StringBuilder reversed = new StringBuilder();
        for (char c : str.toCharArray()) {
            if (Character.isLetter(c)) {
                reversed.append(c);
            }
        }

        return reversed.reverse().toString();
    }

    public static int[] arrayDiff(int[] a, int[] b) {

        Set<Integer> setB = new HashSet<>();
        for (int num : b) {
            setB.add(num);
        }

        List<Integer> resultList = new ArrayList<>();

        for (int num : a) {
            if (!setB.contains(num)) {
                resultList.add(num);
            }
        }

        int[] result = new int[resultList.size()];
        for (int i = 0; i < result.length; i++) {
            result[i] = resultList.get(i);
        }

        return result;
    }


}
