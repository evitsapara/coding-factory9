package gr.aueb.cf.cf9.ch8;

import java.util.Scanner;

/**
 * {@link java.util.InputMismatchException} happens
 * when the {@link java.util.Scanner} fails to read
 * the right type of data
 */
public class InputExceptionApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = 0;

        System.out.println("Please enter an integer: ");
        // num = scanner.nextInt();\

        while (!scanner.hasNextInt()) {
            System.out.println("Characters not acceptable, try again: ");
            scanner.nextLine();

        }
        num = scanner.nextInt();
        System.out.println("Num: " + num);
    }
}
