package gr.aueb.cf.cf9.ch7;

import java.util.Scanner;

/**
 * Palindrome is a sentence (String) that is read
 * start to finish in the same way.
 */
public class Palindrome {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter a word or sentence: ");
        String str = scanner.nextLine();

        if (isPalindrome2(str)) {
            System.out.println(str + " is a palindrome");
        } else {
            System.out.println(str + " is not a palindrome");
        }

    }

    public static boolean isPalindrome(String str) {
        for (int i = 0, j = str.length() - 1; i < j; i++, j--) {
            if (str.charAt(i) != str.charAt(j)) {
                return false;
            }
        }
        return true;
    }

    public static boolean isPalindrome2(String str) {
        return new StringBuilder(str).reverse().toString().equalsIgnoreCase(str);
    }
}
