package com.greenfoxacademy;

public class Main {

    public static void main(String[] args) {
        //
        int length = 10;
        int[] numbers = new int[length];
        System.out.println(numbers); // [I@2503dbd3
        System.out.println("Array lenght: " + numbers.length); // Array lenght: 10

        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);

        }

    }
}
