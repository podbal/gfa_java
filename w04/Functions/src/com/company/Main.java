package com.company;

public class Main {

    public static void main(String[] args) {
        //System.out.println("Hello Monday!");
        greet("Pista");
        greet("Krisztián");
        System.out.println(add(11, 22));
        System.out.println(greater(11, 22));
        showReturn(true);
    }

    private static void greet(String name) {
        System.out.println("Hello: " + name + "!");
    }

    //összeadás függvény
    static int add(int first, int second) {
        return first + second;
    }

    //nagyobb éréték visszaadása
    static int greater(int first, int second) {
        if (first > second) {
            return first;
        } //else { //else ágra itt nincs feltétlenül szükség
        return second;
        //}
    }

    //visszatérés érték nélkül: void
    static void showReturn(boolean isPrint) {
        if (!isPrint) {
            return;
        }
        System.out.println("Print valami");
    }

}
