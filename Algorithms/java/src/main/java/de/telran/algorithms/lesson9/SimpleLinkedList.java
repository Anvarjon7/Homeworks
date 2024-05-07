package de.telran.algorithms.lesson9;


public class SimpleLinkedList {
    public static void main(String[] args) {
        int[] arr = {10, 20, 60, 50, 40, 30, 70, 80, 90};

        getIndexOfNotSortedArr(arr);

        findIndices(arr);
    }


    private static void getIndexOfNotSortedArr(int[] arr) {
        if (arr.length < 2) return;
        int index1 = -1;
        int index2 = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > arr[i + 1]) {
                index1 = i;
                System.out.print("Неотсортированные индексы от -> " + index1);
                break;
            }
        }
        for (int i = arr.length - 1; i > 0; i++) {
            if (arr[i] > arr[i - 1]) {
                index2 = i;
                System.out.println(" - до -> " + index2);
                break;
            }
        }
    }

    public static void findIndices(int[] A) {
        int leftIndex = -1, rightIndex = -1;
        int max_so_far = Integer.MIN_VALUE;
        for (int i = 0; i < A.length; i++) {
            if (max_so_far < A[i]) {
                max_so_far = A[i];
            }

            if (A[i] < max_so_far) {
                rightIndex = i;
            }
        }

        int min_so_far = Integer.MAX_VALUE;
        for (int i = A.length - 1; i >= 0; i--) {
            if (min_so_far > A[i]) {
                min_so_far = A[i];
            }

            if (A[i] > min_so_far) {
                leftIndex = i;
            }
        }
        System.out.print(leftIndex + "," + rightIndex);
    }
}

