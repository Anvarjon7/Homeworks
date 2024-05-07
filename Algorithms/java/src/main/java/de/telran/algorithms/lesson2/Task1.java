package de.telran.algorithms.lesson2;

import java.util.Arrays;

public class Task1 {
    public static void main(String[] args) {

        int[] arr = {5,4,3,2,1};
//        for (int i = 0; i < arr.length - 1; i++) {
//            for (int j = 0; j < arr.length - 1; j++) {
//                if(arr[j] > arr[j + 1] ){
//                    int temp = arr[j];
//                    arr[j] = arr[j + 1];
//                    arr[j + 1] = temp;
//                }
//            }
//        }
        int index = 0;
       while (index < arr.length - 1){
            for (int j = arr.length - 2; j >= index; j--) {
                if (arr[j] > arr[j + 1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
           System.out.println(Arrays.toString(arr));
           index++;
        }
    }
}
