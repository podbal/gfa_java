package com.greenfoxacademy;

public class Main {

    public static void main(String[] args) {
        // write your code here
        System.out.println("TEST");
        // HelloWorld string kiírása a konzolra/terminál ablakba
        System.out.println("Hello, World!");
        // Egy soros comment

        /*
        Több soros
        comment blokk
        */

        //print out integer
        System.out.println(42);
        //print out floating point number
        System.out.println(3.141592);

        //boolean / logikai vizsgálat
        boolean thirsty = true;
        boolean hungry = false;

        boolean ifValue = thirsty && hungry;
        if (ifValue) {
            System.out.println("It is lunch time!");
        } else if (thirsty || hungry) {
            System.out.println("Have a snack!");
        } else {
            System.out.println("There is no food for you!");
        }

        // Ternary operator
        int number = 3;
        String msg = (number == 0) ? "The number is even!" : "The number is odd!";
        System.out.println(msg);

        // Loops / ciklusok
        //while
        System.out.println("While loop");
        int index = 0;
        while (index <= 10) {
            System.out.print(index + ", "); //Terminal 0 => 100
            if (index == 10) {
                System.out.println("End of while loop");
            }
            ++index; //or index +=1;
        }

        //for
        System.out.println("For loop");
        for (int i = 0; i <= 10; i++) {
            System.out.print(i + ", "); //Terminal 0 => 100
            if (i == 10) {
                System.out.println("End of for loop");
            }
        }

        //do while
        System.out.println("Do while");
        index = 0;
        do {
            System.out.print(index + ", ");
            index += 1;
        } while (index <= 10);
        System.out.println("End of do while loop");

        // break 5 ciklus utan
        index = 0;
        do {
            System.out.print(index + ", ");
            index += 1;
            if (index == 5) {
                System.out.println("Break after 5th loop");
                break;
            }
        } while (index <= 10);

        // continue, csak paros szamok kiiratasa
        index = 0;
        do {
            index += 1;
            if (index % 2 != 0) {
                continue;
            }
            System.out.print(index + ", ");
        } while (index < 10);


    }
}
