package gr.aueb.cf.cf9.review.challenges;

import java.util.Scanner;

/**
 * An Armstrong number is a number that is equal
 * to the sum of the cubes of its digits.
 *
 * For example, 153 is an Armstrong number because 1^3 + 5^3 + 3^3 = 153.
 */
public class Armstrong {

    public static void main(String[] args) {
        // Create a Scanner object to read input from the user.
        Scanner scanner = new Scanner(System.in);
        int num = 0;
        int initialNum = 0;
        int numberOfDigits = 0;
        int digit = 0;
        int sumOfCubes = 0;

        // Prompt the user to enter an integer.
        System.out.println("Please insert a number:");
        num = scanner.nextInt();

        numberOfDigits = String.valueOf(num).length();

        initialNum = num;

        // Loop to extract digits, cube them, and add to the sum.
        // The loop continues as long as the number is not zero.
        while (num != 0) {
            digit = num % 10;

            // Calculate the cube of the digit and add it to the sum.
            sumOfCubes += (int) Math.pow(digit, numberOfDigits);
            // Remove the last digit from the number.
            num = num /= 10;
        }

        System.out.printf("%d%s Armstrong\n", initialNum,(sumOfCubes == initialNum) ? " is" : " is not");
        }
    }

