package de.telran.algorithms.leetcodeTaskSolutions.tasks.array_string;

import java.util.Map;

public class Easy4 {

    public static void main(String[] args) {

        String s = "abcd";
        String t = "abcde";
        System.out.println(findTheDifference(s,t));

        System.out.println(judgeCircle("LL"));

    }

    private static char findTheDifference(String s, String t){

        int result = 0;

        for (char c : s.toCharArray()){
            result ^= c;
        }

        for (char c : t.toCharArray()){
            result ^= c;
        }

        return (char) result;
    }

    private static boolean judgeCircle(String moves){

        int x = 0;
        int y = 0;

        for (char c : moves.toCharArray()){
            if (c == 'R'){
                x++;
            }
            if (c == 'L'){
                x--;
            }
            if (c == 'U'){
                y++;
            }
            if (c == 'D'){
                y--;
            }
        }

        return x == 0 && y == 0;
    }

}


