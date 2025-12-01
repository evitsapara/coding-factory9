package gr.aueb.cf.cf9.ch3;

import java.util.Scanner;

/**
 * Calculates the power of a number, base^power,
 * base^power = base * base * base ... * base
 * (power times)
 */
public class PowerApp {

    public static void main(String[] args) {

        // Declare and initialize variables
        Scanner scanner = new Scanner(System.in);
        int base = 0;
        int power = 0;
        int result = 1;
        int i = 1;

        // Enter data and match to variables
        System.out.println("Please enter the base and the power:");
        base = scanner.nextInt();
        power = scanner.nextInt();

        // Data - While - do
        while (i <= power) {
            result *= base;     // result = result * base
            i++;
        }

        // Print the results
        System.out.printf("%d ^ %d = %d\n", base, power, result);
    }
}
