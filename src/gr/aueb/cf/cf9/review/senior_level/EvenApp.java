package gr.aueb.cf.cf9.review.senior_level;

import java.util.Scanner;

/**
 * This app calculates if a number is even or odd.
 */
public class EvenApp {

    public static void main(String[] args) {

        // Declaration and initialization of variables
        Scanner scanner = new Scanner(System.in);
        int num = 0;
        boolean result = false;

        // Data entry, Validation and Data binding
        System.out.println("Please enter a number: ");
        while (!scanner.hasNextInt()) {
            System.out.println("Characters not acceptable, try again: ");
            scanner.nextLine();
        }
        num = scanner.nextInt();

        // Business logic - Delegation
        result = isEven(num);

        // Data output
        System.out.println("The number is even: " + result);

    }

    /**
     * if a number is even.
     * @param num   the number to check
     * @return      true if the number is even false otherwise
     */
    public static boolean isEven(int num) {
        return num % 2 == 0;
    }
}
