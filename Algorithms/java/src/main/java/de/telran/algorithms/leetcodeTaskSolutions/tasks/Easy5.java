package de.telran.algorithms.leetcodeTaskSolutions.tasks;

import java.util.*;

public class Easy5 {
    public static void main(String[] args) {

    int[] arr = {1,2,3,4,5,6};
    reverse(arr);
    String w = "ABC";
    permutation(w,"");

    }

    static void permutation(String str, String prefix){
        if(str.length() == 0){
            System.out.println(prefix);
        }else {
            for (int i = 0; i < str.length(); i++) {
                String rem = (str.substring(0,i) + str.substring(i + 1));
                permutation(rem,prefix+str.charAt(i));
            }
        }
    }

    private static  void reverse(int[] arr){
        for (int i = 0; i < arr.length / 2; i++) {
            int other = arr.length - i - 1;
            int temp = arr[i];
            arr[i] = arr[other];
            arr[other] = temp;
        }
    }

    private static void verify(int i) {
        if (i != -1) {
            System.out.println("Target found at index :" + i);
        } else {
            System.out.println("Target not found in the list");
        }

    }

    private static String freqAlphabet(String s) {

        StringBuilder result = new StringBuilder();
        int i = s.length() - 1;

        while (i >= 0) {
            if (s.charAt(i) == '#') {
                int num = Integer.parseInt(s.substring(i - 2, i));
                result.append((char) ('a' + num - 1));
                i -= 3;
            } else {
                int num = s.charAt(i) - '0';
                result.append((char) ('a' + num - 1));
                i--;
            }
        }

        return result.reverse().toString();
    }

    private static String addStrings(String num1, String num2) {
        int i = num1.length() - 1;
        int j = num2.length() - 1;
        int carry = 0;
        StringBuilder result = new StringBuilder();

        while (i >= 0 || j >= 0 || carry > 0) {
            int digit1 = (i >= 0) ? num1.charAt(i) - '0' : 0;
            int digit2 = (j >= 0) ? num2.charAt(j) - '0' : 0;

            int total = digit1 + digit2 + carry;
            carry = total / 10;
            result.append(total % 10);

            i--;
            j--;
        }

        return result.reverse().toString();
    }

    private static String mostCommonWord(String paragraph, String[] banned) {
        String[] words = paragraph.toLowerCase().split("\\W+");
        Set<String> bannedSet = new HashSet<>(Arrays.asList(banned));
        Map<String, Integer> map = new HashMap<>();

        for (String word : words) {
            if (!bannedSet.contains(word)) {
                map.put(word, map.getOrDefault(word, 0) + 1);
            }
        }

        return Collections.max(
                map.entrySet(),
                (entry1, entry2) -> entry1.getValue().compareTo(entry2.getValue())
        ).getKey();
    }

    private static int numJewelsInStones(String jewels, String stones) {

        Map<Character, Integer> map = new HashMap<>();
        char[] chars = jewels.toCharArray();
        int res = 0;

        for (int i = 0; i < chars.length; i++) {
            for (char c : stones.toCharArray()) {
                if (chars[i] == c) {
                    map.put(c, map.getOrDefault(c, 0) + 1);
                    res++;
                }
            }
        }
        return res;
    }

    private static boolean rotateString(String s, String goal) {
        int i = s.length();
        int j = goal.length();

        if (i != j) {
            return false;
        }

        return (s + s).contains(goal);
    }

//    private static boolean repeatedSubstr(String s){
//
//        int n = s.length();
//
//        for (int i = 1; i <= n / 2; i++) {
//            if (n % i == 0){
//                String sub = s.substring(0,i);
//                int repeatCount = n / i;
//                StringBuilder sb = new StringBuilder();
//
//                for (int j = 0; j < repeatCount; j++) {
//                    sb.append(sub);
//                }
//
//                if (sb.toString().equals(s)){
//                    return true;
//                }
//            }
//        }
//
//        return false;
//    }


    private static boolean repeatedSubstr(String s) {
        String doubled = s + s;

        return doubled.substring(1, doubled.length() - 1).contains(s);
    }

    private static boolean buddyString(String s, String goal) {
        if (s.length() != goal.length()) {
            return false;
        }
        if (s.equals(goal)) {
            Set<Character> seen = new HashSet<>();
            for (char ch : s.toCharArray()) {
                if (seen.contains(ch)) {
                    return true;
                }
                seen.add(ch);
            }
            return false;
        }

        List<Integer> diffIndices = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != goal.charAt(i)) {
                diffIndices.add(i);
                if (diffIndices.size() > 2) {
                    return false;
                }
            }
        }
        if (diffIndices.size() != 2) {
            return false;
        }
        int i = diffIndices.get(0);
        int j = diffIndices.get(1);
        return s.charAt(i) == goal.charAt(j) && s.charAt(j) == goal.charAt(i);
    }

    private static int searchInsert(int[] arr, int target) {

        int high = arr.length - 1, low = 0;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return low;
    }

    private static int[] plusOne(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] != 9) {
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }

        int[] newDigits = new int[digits.length + 1];
        newDigits[0] = 1;
        return newDigits;
    }

    private static void selectionSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
    }

    public static int singleNumber(int[] nums) {
        int single = 0;
        for (int num : nums) {
            single ^= num;
        }
        return single;
    }

    private static boolean containsDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            if (set.contains(num)) {
                return true;
            }
            set.add(num);
        }
        return false;
    }

    private static int missing(int[] nums) {
        int n = nums.length;
        int expected = n * (n + 1) / 2;
        int actual = 0;
        for (int num : nums) {
            actual += num;
        }
        return expected - actual;
    }

    private static int[] isInterSection(int[] nums1, int[] nums2) {
        int obj = 0;
        ArrayList<Integer> arr = new ArrayList<>();
        Set<Integer> set = new HashSet<>();
        for (int num : nums1) {
            set.add(num);
        }
        for (int i = 0; i < nums2.length; i++) {
            obj = nums2[i];
            if (set.contains(obj) && !arr.contains(obj)) {
                arr.add(obj);
            }
        }

        return arr.stream().mapToInt(Integer::intValue).toArray();
    }

    private static int[] inter(int[] nums1, int[] nums2) {
        Set<Integer> set = new HashSet<>();
        Arrays.sort(nums2);
        for (Integer num : nums1) {
            if (binary(nums2, num)) {
                set.add(num);
            }
        }
        int i = 0;
        int[] res = new int[set.size()];
        for (int num : set) {
            res[i++] = num;
        }

        return res;
    }

    private static boolean binary(int[] nums, int target) {
        int low = 0;
        int high = nums.length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (nums[mid] == target) {
                return true;
            } else if (nums[mid] > target) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return false;
    }

    private static int linear(int[] arr, int num) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == num) {
                return i;
            }
        }
        return -1;
    }

    private static int recursive(int[] arr, int low, int high, int target) {
        if (low > high) {
            return -1;
        }
        int mid = low + (high - low) / 2;
        if (arr[mid] == target) {
            return mid;
        } else if (arr[mid] < target) {
            return recursive(arr, mid, high, target);
        } else {
            return recursive(arr, low, mid - 1, target);
        }
    }

    private static int findMax(int[] arr) {
        int count = 0, max = 0;
        for (int num : arr) {
            if (num == 1) {
                count++;
            } else {
                max = Math.max(max, count);
            }
        }

        return Math.max(max, count);


    }

    private static int[] find(int[] nums1, int[] nums2) {
        Map<Integer, Integer> nextGreaterMap = new HashMap<>();
        Stack<Integer> stack = new Stack<>();

        // Process nums2 to fill the map
        for (int num : nums2) {
            // While the stack is not empty and the current number is greater than the top of the stack...
            while (!stack.isEmpty() && stack.peek() < num) {
                nextGreaterMap.put(stack.pop(), num);
            }
            // Push the current number onto the stack
            stack.push(num);
        }

        // For any elements left in the stack, there is no greater element, so map them to -1.
        while (!stack.isEmpty()) {
            nextGreaterMap.put(stack.pop(), -1);
        }

        // Build the answer array for nums1 using the map
        int[] ans = new int[nums1.length];
        for (int i = 0; i < nums1.length; i++) {
            ans[i] = nextGreaterMap.getOrDefault(nums1[i], -1);
        }
        return ans;
    }

    private static String[] findRelative(int[] score){
        int n = score.length;
        String[] res = new String[n];
        Integer[] indices = new Integer[n];

        for (int i = 0; i < n; i++) {
            indices[i] = i;
        }

        Arrays.sort(indices,(a,b) -> score[b] - score[a]);

        for (int i = 0; i < n; i++) {
            int ind = indices[i];
            if (i == 0){
                res[ind] = "Gold Medal";
            } else if (i == 1) {
                res[ind] = "Silver";
            } else if (i == 2) {
                res[ind] = "Bronze Medal";
            }else {
                res[ind] = String.valueOf(i + 1);
            }
        }
        return res;
    }

    public static List<Integer> breakingRecords(List<Integer> scores) {
        // Write your code here
        int countMin = 0;
        int countMax = 0;
        int max = scores.get(0), min = scores.get(0);
        List<Integer> res = new ArrayList<>();
        for(int i = 1; i < scores.size();i++){
            if(scores.get(i) < min){
                countMin++;
            }else{
                if(scores.get(i) > max){
                    countMax++;
                }
            }
        }
        res.add(countMin);
        res.add(countMax);
        return res;
    }



}
