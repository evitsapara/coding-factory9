package gr.aueb.cf.cf9.ch8;

import java.util.Scanner;

/**
 * ({@link NumberFormatException}) happens
 * when {@link Integer#parseInt(String)} fails.
 */
public class NumberExceptionApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputStr = "";
        int num = 0;

        System.out.println("Please enter an integer: ");
       // inputStr = scanner.nextLine();
        while (!isInteger(inputStr = scanner.nextLine())) {
            System.out.println("Characters not acceptable, try again: ");
        }

        num = Integer.parseInt(inputStr);
        System.out.println("The number is: " + num);
    }

    /**
     * Checks if the given string is an integer.
     * @param s     the string to check.
     * @return      true if the string is an integer, false otherwise.
     */
    public static boolean isInteger(String s) {
        return s.matches("-?[0-9]+");
    }
}
