/*
1.
First, run the program to see the list of error messages.
2.
Start from debugging from the first error (at the very top) until the program is bug-free.
Make sure to use the line number in the error message to locate the bugs.
 */

import java.lang.Math;

class Fortune {

    public int generateRandom() {
        return (int)(Math.random() * 10);

    }
// Changed main: "Main" to "main"
    public static void main(String[] args) {

        Fortune fortuneCookie = new Fortune();
        int fortune = fortuneCookie.generateRandom();
//Changed "if (fortune = 0)" to: "(fortune == 0)".
        if (fortune == 0) {

            System.out.println("Flattery will go far tonight.");

        } else if (fortune == 1) {

            System.out.println("Don't behave with cold manners.");

        } else if (fortune == 2) {

            System.out.println("May you someday be carbon neutral");

        } else if (fortune == 3) {

            System.out.println("You have rice in your teeth.");

        } else if (fortune == 4) {

            System.out.println("A conclusion is simply the place where you got tired of thinking.");

        } else if (fortune == 5) {

            System.out.println("No snowflake feels responsible in an avalanche.");

        } else if (fortune == 6) {

            System.out.println("He who laughs last is laughing at you.");

        } else if (fortune == 7) {

            System.out.println("If you look back, you'll soon be going that way.");

        } else if (fortune == 8) {

            System.out.println("You will die alone and poorly dressed.");

        } else if (fortune == 9) {

            System.out.println("The fortune you seek is in another cookie.");

        }

    }

}