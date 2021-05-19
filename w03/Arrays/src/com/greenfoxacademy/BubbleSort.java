package com.greenfoxacademy;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        //System.out.printf("Hello");
        int[] numbers = {12, 545, 345345, -223412, -2, 2132, 753, 7, 8};
        System.out.println("Numbers tömb: " + Arrays.toString(numbers));
        //sorbarendezés beépített paranccsal
        Arrays.sort(numbers);
        System.out.println("Tömb sorba rendezve: " + Arrays.toString(numbers));
    }
}
