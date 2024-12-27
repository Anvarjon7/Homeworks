package de.telran.algorithms.hackerRank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution1 {

    public static void main(String[] args) {

//        Scanner scanner = new Scanner(System.in);
//
//        int n = scanner.nextInt(); // Size of the square matrix
//        List<List<Integer>> arr = new ArrayList<>();
//
//        // Read the matrix into a List of Lists
//        for (int i = 0; i < n; i++) {
//            List<Integer> row = new ArrayList<>();
//            for (int j = 0; j < n; j++) {
//                row.add(scanner.nextInt());
//            }
//            arr.add(row);
//        }
//
//        // Compute and print the absolute diagonal difference
//        System.out.println(miniMaxSum(arr));
//
//        scanner.close();

        List<String> ans = fizzBuzz(15);
        System.out.println(Arrays.toString(new List[]{ans}));


    }

    private static int miniMaxSum(List<List<Integer>> arr) {

        int n = arr.size();
        int primary = 0;
        int secondary = 0;

        for (int i = 0; i < n; i++) {
            primary += arr.get(i).get(i);
            secondary += arr.get(i).get(n - 1 - i);
        }

        return Math.abs(primary - secondary);
    }


    private static List<String> fizzBuzz(int n) {

        List<String> answer = new ArrayList<>(n);

        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                answer.add("FizzBuzz");
            } else if (i % 3 == 0) {
                answer.add("Fizz");
            } else if (i % 5 == 0) {
                answer.add("Buzz");
            } else {
                answer.add(Integer.toString(i));
            }
        }

        return answer;
    }

}
