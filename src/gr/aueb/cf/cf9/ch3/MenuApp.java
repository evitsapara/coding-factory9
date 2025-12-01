package gr.aueb.cf.cf9.ch3;

import java.util.Scanner;

/**
 * Prints a menu until the user
 * chooses "exit".
 */

public class MenuApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice = 0;

        do {
            System.out.println("Please choose one of the below:");
            System.out.println("1. Enter an application");
            System.out.println("2. Delete an application");
            System.out.println("3. Exit");
            choice = scanner.nextInt();
        } while (choice != 3);

        System.out.println("Thanks for using the program!");
    }
}
