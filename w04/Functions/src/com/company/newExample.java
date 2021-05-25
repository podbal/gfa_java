package com.company;

import java.util.Arrays;

public class newExample {
    public static void main(String[] args) {
        new newExample().run();
    }

    void run() {
        //System.out.println("Hello Monday!");
        greet("Pista2");
        greet("Krisztián");
        System.out.println(add(11, 22));
        System.out.println(add(11, 22, 33));
        System.out.println(greater(11, 22));
        showReturn(true);
        int[] array = makeArray(1, 2);
        System.out.println(Arrays.toString(array));
        System.out.println(makeNamesArray("Kata", "Bela", "Julcsa"));
        System.out.println(makeNamesArray("Kata"));
        System.out.println(makeNamesArray());
        System.out.println(makeNamesArray("Kata", "Bela", "Julcsa", "Jani"));
    }

    private void greet(String name) {
        System.out.println("Hello: " + name + "!");
    }

    //összeadás függvény
    int add(int first, int second) {
        return first + second;
    }

    //nagyobb éréték visszaadása
    int greater(int first, int second) {
        if (first > second) {
            return first;
        } //else { //else ágra itt nincs feltétlenül szükség
        return second;
        //}
    }

    //visszatérés érték nélkül: void
    void showReturn(boolean isPrint) {
        if (!isPrint) {
            return;
        }
        System.out.println("Print valami");
        System.out.println();
    }

    //tömb készítése
    int[] makeArray(int first, int second) {
        int[] array = {first, second};
        return array;
    }

    //függvények túlterhelés, add függvényt eltérő paraméterekkel már korábban is létrehoztunk
    int add(int first, int second, int third) {
        return add(first, second) + third;
    }

    //... operátor, szintaktikai cukorka: String... >ez maga egy sting array!
    String makeNamesArray(String... names) {
        String[] namesArray = names;
        String tmp = "";
        for (String name : namesArray) {
            tmp += name + " ";
        }
        return tmp;
    }
}
