package gr.aueb.cf.cf9.ch3;

import java.util.Scanner;

/**
 *  Υπολογιζει το απολυτο ενος ακεραιου με την χρηση
 * του τριαδικου  τελεστη. Το απολυτο ενος ακεραιου ειναι θετικος
 * αριθμος. Για παραδειγμα, το απολυτο του -5 ειναι 5 και το
 * απολυτο του 5 ειναι 5.
 */
public class AbsTernary {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = 0;
        int abs = 0;

        // Input
        System.out.println("Please enter a number: ");
        num = scanner.nextInt();      // Data binding

        // Processing data
//        if (num >= 0) {
//            abs = num;
//        } else {
//            abs = -num;
//        }

        abs = (num >= 0) ? num : - num;       // expression  - Syntactic sugar
    }
}