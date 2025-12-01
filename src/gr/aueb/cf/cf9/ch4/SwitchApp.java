package gr.aueb.cf.cf9.ch4;

import java.util.Scanner;

/**
 * We present a menu to the user
 * The user gives their choice
 * Depending on the choice, we give feedback
 * to the user
 */

public class SwitchApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice = 0;
        final int EXIT = 4;

        do {
            System.out.println();
            System.out.println("Please make a choice from the following: ");
            System.out.println("1. Single player game");
            System.out.println("2. Two-player game");
            System.out.println("3. Multiplayer game");
            System.out.println("4. Exit");
            System.out.println();
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Start Single player game");
                    break;
                case 2:
                    System.out.println("Start Two-player game");
                    break;
                case 3:
                    System.out.println("Start Multiplayer game");
                    break;
                case 4:
                    System.out.println("Exit game");
                    break;
                default:
                    System.out.println("Error in choice");
                    break;
            }
        } while (choice != EXIT);

        System.out.println("Goodbye");
    }
}
