package de.telran.algorithms.leetcodeTaskSolutions.tasks.array_string;

import javax.xml.stream.events.Characters;
import java.lang.reflect.Array;
import java.util.Arrays;

public class Easy3 {

    public static void main(String[] args) {

        char[] s = {'h','e','l','l','o'};

        reverseString(s);

        System.out.println(String.copyValueOf(s));
    }


    private static void reverseString(char[] s){

        int left = 0;
        int right = s.length - 1;

        while (left < right){
            char temp = s[left];
            s[left] = s[right];
            s[right] = temp;

            left++;
            right--;
        }
    }
}
