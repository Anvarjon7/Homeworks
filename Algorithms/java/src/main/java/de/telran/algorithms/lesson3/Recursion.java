package de.telran.algorithms.lesson3;

public class Recursion {
    public static void main(String[] args) {
        System.out.println(calcFibonacci(5));

    }

    public static int progression(int n) {
        if (n <= 0) throw new Error("The number must be positive");
        if (n == 1) return 1;
        return progression(n - 1);
    }

    public static int calcSum(int n) {
        if (n <= 0) throw new Error("the number should be positive");
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }

    public static int fibonacci(int n) {
        if (n <= 0) throw new Error("The number must be positive");
        if (n == 1) return 0;
        if (n == 2) return 1;
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static int calcFibonacci(int n) {
        if (n <= 0) throw new Error("The number must be positive");
        int fib1 = -1;
        int fib2 = 1;
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum = fib1 + fib2;
            fib1 = fib2;
            fib2 = sum;
        }
        return sum;
    }

    public static int binarySearch(int[] arr, int n) {
        int start = 0;
        int end = arr.length - 1;
        while (end >= start) {
            int mid = (end + start) / 2;
            if (n < arr[mid]) {
                start = mid + 1;
            } else if (n > arr[mid]) {
                start = mid - 1;
            } else return mid;
        }
        return -1;
    }

    public static int recBinarySearch(int[] arr, int n, int start, int end) {
        if (end >= start) {
            int mid = start + (start - end) / 2;
            if (arr[mid] == n) {
                return mid;
            }
            if (n > arr[mid]) {
                return recBinarySearch(arr, n, start, mid - 1);
            } else {
                return recBinarySearch(arr, n, mid + 1, end);
            }
        }
        return -1;
    }

    public static String Hanoi(int n, String A, String C, String B) {
        if (n == 1) return A + C + " ";
        return Hanoi(n - 1, A, B, C) + A + C + " " + Hanoi(n - 1, A, C, B);
    }
}

