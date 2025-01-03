package de.telran.algorithms.leetcodeTaskSolutions.tasks.array_string;

import java.util.Map;

public class Easy4 {

    public static void main(String[] args) {

        String s = "abcd";
        String t = "abcde";
        System.out.println(findTheDifference(s,t));

//        System.out.println(judgeCircle("LL"));

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

//    private static boolean judgeCircle(String moves){
//
//        int upDown = 0;
//        int rightLeft = 0;
//
//        for (int i = 0; i < moves.length(); i++) {
//            if (moves.charAt(i) == 'U'){
//                upDown++;
//            }
//            if (moves.charAt(i) == 'D'){
//                upDown--;
//            }
//
//            if (moves.charAt(i) == 'L'){
//                rightLeft++;
//            }
//            if (moves.charAt(i) == 'R'){
//                rightLeft--;
//            }
//        }
//
//        return upDown == 0 || rightLeft == 0;
//    }

}


