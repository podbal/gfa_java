package com.greenfoxacademy;

import java.util.Arrays;

public class BubbleSort { //Bubble sort osztály létrehozása
    public static void main(String[] args) { //main a Java kód belépési pontja
        //System.out.printf("Hello");
        //sorbarendezés beépített paranccsal
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

        int[] numbers = {12, 545, 345345, -223412, -2, 2132, 753, 7, 8}; //egész számokat tartalmazó tomb inicializálása, literal
        System.out.println("Numbers tömb       : " + Arrays.toString(numbers)); //tömb kiírása
        //Arrays.sort(numbers); //csak kipróbálásra kellet, ezzel kiváltható de nem megérthető a Bubble sort
        /* optimalizált SWAP, 1 egy változóval */

        int lastSwap = numbers.length; //egész változó ami ciklus max futása = tömb hosszával = az utolsó csere helye
        do
        { //hátultesztelő cilus, elfut 1x majd ellenőrzi a feltételt, táncos példában ez kezdi mindíg előrről az összehasonlítást
            int newLastSwap = 0; //átmeneti egész típ. változó = itt volt az utolsó swap, max eddig kell futtatni a ciklust,
            // azért kell, hogy ne írjuk felül a latSwap változót mert annak az értékét használjuk a belső for ciklus futása közben
            for (int i = 1; i <= lastSwap - 1; i++) { //mindíg csak az utolsó csere helyéig fut a ciklus: lastSwap - 1
                //az utolsó táncosok akik már rendezettek voltak, megfordultak, rajtuk már nem futott tovább feleslegesen a sort
                // -1 a 0-tól indexelés miatt kell, i++ felfelé számláló ciklus
                // a tömb első elemétől i=1 indul, igy megspórolható egy 1 fölösleges futás, ahol a 0. elem = lenne önmagával
                System.out.println("i " + i + " I-1: " + numbers[i - 1] + " I: "
                        + numbers[i]); //ciklusszám + I-1 + I állapotai, csak a futás megértéséhez kell
                if (numbers[i - 1] > numbers[i]) { //ha (i-1) előbbi elem nagyobb mint (i) utóbbi elem akkor
                    int tmp = numbers[i - 1]; // tmp átmeneti változó segítségével jön a csere/swap tmp-be << előbbi elemet
                    numbers[i - 1] = numbers[i]; //mivel előbbi elembe << útóbbi elemet
                    numbers[i] = tmp; //előbbi elembe << tmp-t
                    newLastSwap = i; //itt volt az utolsó swap, ennél többször már nem kell futnia a következő for cilkusnak
                    System.out.println("newLastSwap:" + newLastSwap); //newLastSwap állapota
                }
            }
            lastSwap = newLastSwap; //utolsó swap az i-edik futásnál, max ennyiszer kell már csak futnia a for-nak
            System.out.println("lastSwap:" + lastSwap); //lastSwap állapota
        } while (lastSwap >= 1); //ellenőrizzük, hogy az utolsó csere helye >=1, ha már nem igaz akkor nem kell többet futnia a ciklusnak
        //táncosok példáján látható amikor az elején 4-en megfordulnak, ez itt valósul meg a kódban

        System.out.println("BubbleSort rendezés: " + Arrays.toString(numbers));
        System.out.println("Várt eredmény      : [-223412, -2, 7, 8, 12, 545, 753, 2132, 345345]");
    }
}

