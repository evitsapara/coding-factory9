package gr.aueb.cf.cf9.ch4;

import java.util.Scanner;

/**
 *  The user enters the base and power
 *  and the program calculates the base^power i.e 2^10 = 1024
 */
public class PowerApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int base = 0;
        int power = 0;
        int result = 1;

        System.out.println("Please enter two numbers, the first being the base and the second being the power: ");
        base = scanner.nextInt();
        power = scanner.nextInt();

        for (int i = 1; i <= power; i++) {
            result *= base;
        }

        // Print the results
        System.out.printf("%d ^ %d = %d\n", base, power, result);
    }
}