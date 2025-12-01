package gr.aueb.cf.cf9.review.challenges;

import java.util.Scanner;

/**
 * Given a string, this converts the letters within
 * from upper to lower case alternately.
 *
 * Example: coding -> CoDiNg
 */
public class UpperLowerCaseApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        String inputStr = scanner.nextLine();
        char ch = ' ';

        // Input data
        System.out.println("Please enter a string: ");
        inputStr = scanner.nextLine();

        // Business Logic
        for (int i = 0; i < inputStr.length(); i++) {
            ch = inputStr.charAt(i);
            if (Character.isUpperCase(ch)) {
                ch = i % 2 == 0 ? Character.toUpperCase(ch) : Character.toLowerCase(ch);
                sb.append(ch);
            }
        }

        System.out.println(sb);
    }
}

