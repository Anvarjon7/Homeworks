package de.telran.algorithms.lesson4;

public class LessonPractice {
    public static void main(String[] args) {
        int num = 8;
        int[] arr = {10, 20, 30, 40, 50, 60, 70, 80, 90};
        int result = recursiveSum(num);
        System.out.println(result);
        System.out.println(calcFibonacci(num));
        System.out.println(sum(num));
        System.out.println(recursiveFibonacci(num));
        System.out.println(binarySearch(arr,70));
    }
    public static int recursiveSum(int num){
        if (num <= 0)
            return num;
        if (num == 1){
            return num;
        }else {
            return num + recursiveSum(num - 1);
        }
    }

    public static int sum(int num){
        if (num <= 0) throw new Error("The number must be positive");
        if (num == 1) return num;
        else {
            return num * (num + 1) / 2;
        }
    }

    public static int recursiveFibonacci(int num){
        if (num <= 0) throw new Error("The number must be positive");
        if (num == 1) return 0;
        if (num == 2) return 1;
        else {
            return recursiveFibonacci(num -1) + recursiveFibonacci(num - 2);
        }
    }
    public static int calcFibonacci(int num){
        if (num <= 0) throw new Error("The number must be positive");
        int fib1 = -1;
        int fib2 = 1;
        int sum = 0;
        for (int i = 1; i <= num; i++) {
            sum = fib1 + fib2;
            fib1 = fib2;
            fib2 = sum;
        }
        return sum;
    }
    public static int binarySearch(int[] arr,int num){
        int low = 0;
        int high = arr.length -1;

        while (low <= high){
            int mid = low + (high - low) / 2;
            int midVal = arr[mid];
            if (midVal == num){
                return mid;
            } else if (midVal < num) {
                low = mid + 1;
            }else {
                high = mid - 1;
            }
        }
        throw new Error("The element not found");
    }

    public static int binaryRecursiveSearch(int[] arr, int num, int start, int end){
        if (end >= start) {
            int mid = start + (start - end) / 2;
            if (arr[mid] == num) {
                return mid;
            }
            if (num > arr[mid]) {
                return binaryRecursiveSearch(arr, num, start, mid - 1);
            } else {
                return binaryRecursiveSearch(arr, num, mid + 1, end);
            }
        }
        throw new Error("The element not found");
    }
}
