package com.greenfoxacademy;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        //System.out.printf("Hello");
        int[] numbers = {12, 545, 345345, -223412, -2, 2132, 753, 7, 8};
        System.out.println("Numbers tömb: " + Arrays.toString(numbers));
        //sorbarendezés beépített paranccsal
        //Arrays.sort(numbers); //csak kipróbálásra kellet
        //System.out.println("Tömb sorba rendezve: " + Arrays.toString(numbers));

        /* Basic BubbleSort
        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = 0; j < numbers.length - i - 1; j++) {
                int first = numbers[j];
                int second = numbers[j + 1];
                System.out.println("Iteration first: " + first + " second: " + second);
                if (first > second) {
                    numbers[j] = second;
                    numbers[j + 1] = first;
                }
            }
        }
        System.out.println("BubbleSort rendezés: " + Arrays.toString(numbers));
        */

        /* optimalizált SWAP, 1 egy változóval */
        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = 0; j < numbers.length - i - 1; j++) {
                if (numbers[j] > numbers[j + 1]) {
                    int temp = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = temp;
                }
            }
        }
        System.out.println("BubbleSort rendezés: " + Arrays.toString(numbers));

    }
}
