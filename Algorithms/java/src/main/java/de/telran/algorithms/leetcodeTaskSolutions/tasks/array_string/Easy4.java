package de.telran.algorithms.leetcodeTaskSolutions.tasks.array_string;

import java.util.*;

public class Easy4 {

    public static void main(String[] args) {

        String s = "abcd";
        String t = "abcde";
        System.out.println(findTheDifference(s,t));

        System.out.println(judgeCircle("LL"));
        String[] list1 = {"Shogun","Tapioca Express","Burger King","KFC"};
        String[] list2 = {"KFC","Shogun","Burger King"};


        System.out.println(Arrays.toString(findRestaurant(list1, list2)));

        System.out.println(countBinarySubstrings("00110011"));

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

    private static String[] findRestaurant(String[] list1,String[] list2){

        Map<String, Integer> map = new HashMap<>();
        List<String> res = new ArrayList<>();
        int minIndexSum = Integer.MAX_VALUE;

        for (int i = 0; i < list1.length; i++) {
            map.put(list1[i],i);
        }

        for (int j = 0; j < list2.length; j++) {
            if (map.containsKey(list2[j])){
                int indexSum = j + map.get(list2[j]);
                if (indexSum < minIndexSum){
                    res.clear();;
                    res.add(list2[j]);
                    minIndexSum = indexSum;
                } else if (indexSum == minIndexSum) {
                    res.add(list2[j]);
                }
            }
        }
        return res.toArray(new String[0]);
    }

    private static int countBinarySubstrings(String s) {

        int cur = 1, pre = 0, res = 0;
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == s.charAt(i - 1)) cur++;
            else {
                res += Math.min(cur, pre);
                pre = cur;
                cur = 1;
            }
        }
        return res + Math.min(cur, pre);
    }

    private static String toLowerCase(String s){

        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) >= 65 || s.charAt(i) <= 90){
                builder.append((char)(s.charAt(i)+32));
            }
            else {
                builder.append(s.charAt(i));
            }
        }

        return builder.toString();
    }

}


