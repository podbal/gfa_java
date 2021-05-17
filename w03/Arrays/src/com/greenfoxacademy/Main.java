package com.greenfoxacademy;

public class Main {

    public static void main(String[] args) {
        //
        int length = 10;
        int[] numbers = new int[length];
        System.out.println(numbers); // [I@2503dbd3
        System.out.println("Array lenght: " + numbers.length); // Array lenght: 10
        //tomb masodik elemenek kiiratasa
        System.out.println("Tomb masodik eleme: " + numbers[1]);
        //5. elem értékadása
        numbers[4] = 234; // 0, 0, 0, 0, 234, 0, 0, 0, 0, 0
        System.out.println("Tömb 5. eleme (index 4): " + numbers[4]);

        // tömb elemeinek kiiratasa
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + ", ");

        }
        System.out.println("////////////////////");

        // másik tömb létrehozása, inicializálása
        int[] otherNumbers = {2345, 3456, 5678, 1324, 4567, 698};
        for (int j = 0; j < otherNumbers.length; j++) {
            System.out.print(otherNumbers[j] + ", ");

        }

        // string tömb bejárása iterációval
        System.out.println("////////////////////");
        String[] names = {"Bela", "János", "Éva"};
        System.out.println("Names tömb hossza: " + names.length);
        for (String name : names) {
            System.out.print(name + ", ");

        }


    }
}
