package gr.aueb.cf.cf9.review.senior_level;

import java.util.Scanner;

/**
 * Calculate the maximum value of an array.
 */
public class ArrayMax {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int SIZE = 5;
        int[] numbers = new int[SIZE];
        int maxPosition = 0;
        int maxValue = 0;

        // Input data, Validation and Data binding
        System.out.println("Please enter " + SIZE + " numbers: ");
        for (int i = 0; i < numbers.length; i++) {

            // Validate input
            while (!scanner.hasNextInt()) {
                System.out.println("Characters not acceptable, try again: ");
                scanner.nextLine();
            }
            numbers[i] = scanner.nextInt();
        }

        // Delegation
        maxPosition = findMaxPosition(numbers);
        maxValue = numbers[maxPosition];

        // Output
        System.out.printf("The maximum value is %d at position %d.\n ", maxValue, (maxPosition +1));
    }

    /**
     *  Find the position of the maximum value in an array.
     * @param arr   the input array.
     * @return      the position of the maximum value in the array.
     */
    public static int findMaxPosition(int[] arr) {
            if (arr == null || arr.length == 0) return Integer.MIN_VALUE;
            int maxPosition = 0;
            int maxValue = arr[maxPosition];

            for (int i = 1; i < arr.length; i++) {
                if (arr[i] > maxValue) {
                    maxPosition = i;
                    maxValue = arr[i];
                }
            }
            return maxPosition;
    }
}
