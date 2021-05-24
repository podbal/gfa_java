package com.greenfoxacademy;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        //System.out.printf("Hello");
        int[] numbers = {12, 545, 345345, -223412, -2, 2132, 753, 7, 8};
        System.out.println("Numbers tömb       : " + Arrays.toString(numbers));
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

        /* optimalizált SWAP, 1 egy változóval
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
        */

        /* optimalizált SWAP, 1 egy változóval */

        int lastSwap = numbers.length; //ciklus max futása a tömb hosszával egyenlő
        do {
            int newLastSwap = 0; //eddig futott a for ciklus, itt volt az utolsó swap, nem kell ennél tovább futtatni a ciklust
            for (int i = 1; i <= lastSwap - 1; i++) { //a tömb első elemétől a tömb-1 szer fut a ciklus
                System.out.println("i " + i + " I-1: " + numbers[i - 1] + " I: "
                        + numbers[i]); //ciklusszám I-1 és I tömbelemek állapotok
                if (numbers[i - 1] > numbers[i]) { //ha i-1 nagyobb mint i akkor
                    int tmp = numbers[i - 1]; // csere/swap
                    numbers[i - 1] = numbers[i];
                    numbers[i] = tmp;
                    newLastSwap = i; //itt volt az utolsó swap, ennél többször már nem kell futnia a következő for cilkusnak
                    System.out.println("newLastSwap:" + newLastSwap); //newLastSwap állapota
                }
            }
            lastSwap = newLastSwap; //utolsó swap az i-edik futásnál, max ennyiszer kell már csak futnia a for-nak
            System.out.println("lastSwap:" + lastSwap); //lastSwap állapota
        } while (lastSwap >= 1); //amíg lastswap kisebb vagy egyenlő mint 1, tehát az utolsó swap 0 vagy 1-nél volt

        System.out.println("BubbleSort rendezés: " + Arrays.toString(numbers));
        System.out.println("Várt eredmény      : [-223412, -2, 7, 8, 12, 545, 753, 2132, 345345]");
    }
}

