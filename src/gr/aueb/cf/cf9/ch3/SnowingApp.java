package gr.aueb.cf.cf9.ch3;

import java.util.Scanner;

/** The user inserts the temperature in Celsius, amd the status of
 * isRaining variable and calculates if it is snowing or not.
 *
 */

public class SnowingApp {

    public static void main(String[] args) {

        // Declaration of variables
        Scanner scanner = new Scanner(System.in);
        int temperature = 0;
        boolean isRaining = false;
        boolean isSnowing = false;

        System.out.println("Please enter if it is raining (true/false):");
        isRaining = scanner.nextBoolean();
        System.out.println("Please enter the temperature");
        temperature = scanner.nextInt();

        isSnowing = isRaining && (temperature < 0);     // Short-Circuit Operator

        System.out.println("Is it snowing: " + isSnowing);


    }
}
