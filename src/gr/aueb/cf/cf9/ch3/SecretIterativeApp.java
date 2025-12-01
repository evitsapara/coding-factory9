package gr.aueb.cf.cf9.ch3;

import java.util.Scanner;

/**
 * The user continuously enters integers
 * and tries to guess the secret number
 */
public class SecretIterativeApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int SECRET = 72;
        int num = 0;

        while (true) {
            System.out.println("Please guess the secret number: ");
            num = scanner.nextInt();

            if (num == SECRET) {
                System.out.println("You guessed the secret number!");
                break;
            } else {
                System.out.println("Try again!");
            }
        }
    }
}