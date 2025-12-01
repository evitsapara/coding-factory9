package gr.aueb.cf.cf9.review.challenges;

/**
 * Array with n values from 1 to n+1
 * For example [1, 2, 3, 5]
 *
 */
public class MissingElement {

    public static void main(String[] args) {

    }

    public static int findMissingElement(int[] arr) {
        int expectedSum = 0;
        int actualSum = 0;
        int n = 0;

        n = arr.length;;
        expectedSum = (n + 1) * (n + 2) / 2;

        for (int num : arr) {
            actualSum += num;
        }
        return expectedSum - actualSum;
    }
}
