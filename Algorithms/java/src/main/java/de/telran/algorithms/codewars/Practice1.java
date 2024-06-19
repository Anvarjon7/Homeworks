package de.telran.algorithms.codewars;

import java.util.List;

public class Practice1 {

    public static void main(String[] args) {
        System.out.println(convertBinaryArrayToInt(List.of(0,0,0,1)));

    }

    private static int convertBinaryArrayToInt(List<Integer> binaryArray) {

        int result = 0;
        for (int i = 0; i < binaryArray.size(); i++) {
            result = (result << 1) | binaryArray.get(i);
        }

        return result;
    }
}
