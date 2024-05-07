package de.telran.algorithms.lesson11;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Stack stack = new Stack();
        System.out.println(Arrays.toString(stack.items));
        System.out.println(stack.push(2));

        Func(1,2,3,4,5);
//        System.out.println(stack.pushValues(1,2,3,4));
        System.out.println(stack.pushValues(10,20,30,30,30,40));
//        System.out.println(Arrays.toString(stack.items));
//
//        System.out.println(stack.pop());
//        System.out.println(Arrays.toString(stack.items));
//        System.out.println(stack.popSecondEx());
//        System.out.println(Arrays.toString(stack.items));
//        System.out.println(stack.popSecondEx());

        System.out.println(stack.hasElement(100));
        System.out.println(stack.findMax());
        System.out.println(stack.findMin());

        System.out.println(Arrays.toString(stack.items));
        System.out.println(stack.shift());
        System.out.println(Arrays.toString(stack.items));

        stack.unShift(2,3,4,5,6);

        System.out.println(Arrays.toString(stack.items));

    }
    public static void Func(int... args){
        System.out.println(Arrays.toString(args));
    }
}
