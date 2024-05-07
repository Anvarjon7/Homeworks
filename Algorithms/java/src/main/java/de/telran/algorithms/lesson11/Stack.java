package de.telran.algorithms.lesson11;

import java.util.Arrays;

public class Stack {
    int[] items = new int[0];

    public int push(int elem) {
        int[] updatedArr = new int[this.items.length + 1];
        for (int i = 0; i < items.length; i++) {
            updatedArr[i] = items[i];
        }
        updatedArr[updatedArr.length - 1] = elem;
        items = updatedArr;
        return items.length;
    }


    public int pushValues(int... values) {
        int[] updatedArr = new int[this.items.length + values.length];
        for (int i = 0; i < items.length; i++) {
            updatedArr[i] = items[i];
        }
        for (int i = 0; i < values.length; i++) {
            updatedArr[i + items.length] = values[i];
        }
        items = updatedArr;
        return items.length;
    }

    public int pop() {
        int deletedVal = items[items.length - 1];
        items = Arrays.copyOfRange(items, 0, items.length - 1);
        return deletedVal;
    }

    public int popSecondEx() {
        if (isEmpty()) {
            throw new ArrayIndexOutOfBoundsException("Array is empty!!!");
        }
        int[] updatedArr = new int[items.length - 1];
        for (int i = 0; i < updatedArr.length; i++) {
            updatedArr[i] = items[i];
        }
        int lastElem = items[items.length - 1];
        items = updatedArr;
        return lastElem;
    }

    public int itemsLenght() {
        return items.length;
    }

    public boolean isEmpty() {
        return items.length == 0;
    }

    public boolean hasElement(int value){
        for (int i = 0; i < this.items.length; i++) {
            if (items[i] == value) {
                return true;
            }
        }
        return false;
    }

    public int findMax(){
        int max = items[0];
        for (int i = 0; i < this.items.length; i++) {
            if (items[i] > max){
                max = items[i];
            }
        }
        return max;
    }

    public int findMin(){
        int min = items[0];
        for (int i = 0; i < this.items.length; i++) {
            if (items[i] < min)
                min = items[i];
        }
        return min;
    }

    public int shift(){
        if (isEmpty()){
            throw new Error("Array is empty!!!");
        }
        int firstElem = items[0];
        items = Arrays.copyOfRange(items,1,items.length);
        return firstElem;
    }

    public int unShift(int... values){
        int[] updatedArr = new int[values.length + items.length];
        for (int i = 0; i < values.length; i++) {
            updatedArr[i] = values[i];
        }
        for (int i = 0; i < items.length; i++) {
            updatedArr[i + values.length] = items[i];
        }
        items = updatedArr;
        return items.length;
    }
}
