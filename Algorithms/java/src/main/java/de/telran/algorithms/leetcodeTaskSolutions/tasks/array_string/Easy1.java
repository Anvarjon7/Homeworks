package de.telran.algorithms.leetcodeTaskSolutions.tasks.array_string;

import java.util.*;

public class Easy1 {
    public static void main(String[] args) {

        int[] nums1 = {1, 3, 5, 0, 0, 0};
        int[] nums2 = {2, 4, 8, 8, 8,};
//        merge(nums1, 3, nums2, 3);

        System.out.println(addBinary("11", "1"));

//        System.out.println(removeElement(nums1,3));
//        System.out.println(Arrays.toString(nums1));
        System.out.println(majorityElem(nums2));

        System.out.println(convertToTitle(28));

        String[] words = {"Alaska", "zmm", "qwert"};

        System.out.println(Arrays.toString(findWords(words)));

        List<Integer> arr = new ArrayList<>();
        arr.add(2);
        arr.add(3);
        arr.add(-1);
        arr.add(0);
        arr.add(-2);

        plusMinus(arr);

    }

    private static void merge(int[] num1, int n, int[] num2, int m) {
        int p1 = m - 1;
        int p2 = n - 1;
        int p = n + m - 1;

        while (p1 >= 0 && p2 >= 0) {
            if (num1[p1] > num2[p2]) {
                num1[p] = num1[p1];
                p1--;
            } else {
                num1[p] = num2[p2];
                p2--;
            }
            p--;
        }

        while (p2 >= 0) {
            num1[p] = num2[p2];
            p2--;
            p--;
        }
    }

    private static int removeElement(int[] nums, int val) {

        int k = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[k] = nums[i];
                k++;
            }
        }
        return k;
    }

    private static int removeDuplicates(int[] nums) {

        int k = 1;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[k - 1]) {
                nums[k] = nums[i];
                k++;
            }
        }
        return k;
    }

    private static int majorityElem(int[] nums) {
        int count = 0;
        int candidate = nums[0];
        for (int num : nums) {
            if (count == 0) {
                candidate = num;
            }
            count += (num == candidate) ? 1 : -1;
        }
        return candidate;
    }

    private static String addBinary(String a, String b) {
        StringBuilder result = new StringBuilder();

        int i = a.length() - 1;
        int j = b.length() - 1;
        int carry = 0;

        while (i >= 0 || j >= 0 || carry != 0) {
            int sum = carry;

            if (i >= 0) {
                sum += a.charAt(i) - '0';
                i--;
            }

            if (j >= 0) {
                sum += b.charAt(j) - '0';
                j--;
            }

            carry = sum / 2;
            result.append(sum % 2);

        }

        return result.reverse().toString();
    }

    private static String convertToTitle(int columnNumber) {

        StringBuilder columnTitle = new StringBuilder();

        while (columnNumber > 0) {

            int remainder = (columnNumber - 1) % 26;

            columnTitle.append((char) ('A' + remainder));

            columnNumber = (columnNumber - 1) / 26;
        }

        return columnTitle.reverse().toString();
    }

    private static String[] findWords(String[] words) {

        Set<Character> row1 = new HashSet<>(Arrays.asList('q', 'w', 'e', 'r', 't', 'y', 'u', 'i', 'o', 'p'));
        Set<Character> row2 = new HashSet<>(Arrays.asList('a', 's', 'd', 'f', 'g', 'h', 'j', 'k', 'l'));
        Set<Character> row3 = new HashSet<>(Arrays.asList('z', 'x', 'c', 'v', 'b', 'n', 'n', 'm'));

        List<String> result = new ArrayList<>();

        for (String word : words) {
            String lower = word.toLowerCase();

            Set<Character> targetRow = null;
            if (row1.contains(lower.charAt(0))) {
                targetRow = row1;
            } else if (row2.contains(lower.charAt(0))) {
                targetRow = row2;
            } else if (row3.contains(lower.charAt(0))) {
                targetRow = row3;
            }

            boolean isValid = true;
            for (char c : lower.toCharArray()) {
                if (!targetRow.contains(c)) {
                    isValid = false;
                    break;
                }
            }

            if (isValid) {
                result.add(word);
            }
        }
        return result.toArray(new String[0]);
    }

    private static void plusMinus(List<Integer> arr) {

        int n = arr.size();
        int pos = 0;
        int neg = 0;
        int zer = 0;

        for (int num : arr) {
            if (num > 0) {
                pos++;
            } else if (num < 0) {
                neg++;
            } else {
                zer++;
            }

            double positiveRation = (double) pos / n;
            double negativeRation = (double) neg / n;
            double zeroRation = (double) zer / n;


            System.out.printf("%.6f%n", positiveRation);
            System.out.printf("%.6f%n", negativeRation);
            System.out.printf("%.6f%n", zeroRation);
        }
    }


}
