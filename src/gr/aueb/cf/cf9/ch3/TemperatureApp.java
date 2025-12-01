package gr.aueb.cf.cf9.ch3;

import java.util.Scanner;

/**
 * The user inputs an integer that symbolizes
 * a temperature. The program computes if the temp
 * is < 0 then one value is true
 * otherwise it becomes false
 */
public class TemperatureApp {

    public static void main(String[] args) {

        // Declaration of variables
        Scanner scanner = new Scanner(System.in);
        int temperature = 0;
        boolean isTempBelowZero = false;

        // Enter Data
        System.out.println("Please enter a temperature: ");
        temperature = scanner.nextInt();

        // Processing Data
        isTempBelowZero = temperature < 0;

        // Print the results
        System.out.println("The Temperature is less than 0: " + isTempBelowZero);

    }
}
