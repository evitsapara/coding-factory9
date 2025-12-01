package gr.aueb.cf.cf9.ch3;

import java.util.Scanner;

/**
 * The user enters two values, numerator and
 * denominator, and the program calculates the
 * quotient continuously.
 *
 * If the numerator is 0 then the program stops.
 * If the denominator is 0, then the program continues.
 */
public class DivisionApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numerator = 0;
        int denominator = 0;
        int result = 0;

        while (true) {
            System.out.println("Please insert a numerator: ");
            numerator = scanner.nextInt();

            if (numerator == 0) {
                System.out.println("Numerator is 0. Quitting program...");
                break;
            }

            System.out.println("Please enter a denominator: ");
            denominator = scanner.nextInt();

            if (denominator == 0) {
                System.out.println("Cannot be divided by 0.");
                continue;
            }

            result = numerator / denominator;
            System.out.println("Result is: " + result);
        }
    }
}
