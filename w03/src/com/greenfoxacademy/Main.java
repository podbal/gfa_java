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

        // Loops / ciklusok
        //while
        System.out.println("While loop");
        int index = 0;
        while (index <= 100) {
            System.out.print(index + ", "); //Terminal 0 => 100
            if (index == 100) {
                System.out.println("End of while loop");
            }
            ++index; //or index +=1;
        }

        //for
        System.out.println("For loop");
        for (int i = 0; i <= 100; i++) {
            System.out.print(i + ", "); //Terminal 0 => 100
            if (i == 100) {
                System.out.println("End of for loop");
            }
        }

        //do while
        System.out.println("Do while");
        index = 0;
        do {
            System.out.print(index + ", ");
            index += 1;
        } while (index <= 100);


    }
}
