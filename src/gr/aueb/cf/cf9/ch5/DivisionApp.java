package gr.aueb.cf.cf9.ch5;

import java.util.Scanner;

/**
 * Division and quotient of
 */

public class DivisionApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double num1 = 0.0;
        double num2 = 0.0;
        double result = 0.0;
        double remaining = 0.0;

        System.out.println("Please enter two numbers (doubles): ");
        num1 = scanner.nextDouble();
        num2 = scanner.nextDouble();

        result = num1 / num2;            // Διαιρεση δεκαδικων ειναι δεκαδικος και η διαιρεση με το 0 δινει infinity
        remaining = num1 % num2;         // Το υπολοιπο ειναι το υπολοιπο της διαιρεσης με το ακεραιο μερος

        System.out.println("Result: " + result);
        System.out.println("Remaining: " + remaining);
    }
}
