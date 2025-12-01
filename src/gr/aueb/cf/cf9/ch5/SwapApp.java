package gr.aueb.cf.cf9.ch5;

import static java.util.Collections.swap;

/**
 * Defines the method void swap(int a, int b)
 * which swaps values a, b.
 */
public class SwapApp {

    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        System.out.printf("a = %d, b = %d\n", a, b);
        swap(a, b);

        System.out.printf("a = %d, b = %d\n", a, b);
    }

    /**
     * Swap two numbers.
     * @param a
     * @param b
     */

    public static void swap(int a, int b) {
    int temp = a;
    a = b;
    b = temp;
    }
}