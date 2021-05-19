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

        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = 0; j < numbers.length - i - 1; j++) {
                int first = numbers[j];
                int second = numbers[j + 1];
                if (first > second) {
                    numbers[j] = second;
                    numbers[j + 1] = first;
                }
            }
        }
        System.out.println("BubbleSort rendezés: " + Arrays.toString(numbers));

    }
}
