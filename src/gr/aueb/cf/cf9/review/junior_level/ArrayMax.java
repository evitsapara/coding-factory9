package gr.aueb.cf.cf9.review.junior_level;

/**
 * Finds the maximum value in an array.
 * Variables "a" and "m" are not "good" names.
 * The code could be a method
 * There is no documentation
 * There is no proper structure
 * There is no check for null
 * No SoC
 */
public class ArrayMax {

    public static void main(String[] args) {
        int[] a = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int m = a[0];

        for (int i = 1; i < a.length; i++) {
            if (a[i] > m) {
                m = a[i];
            }
        }
        System.out.println("Max: " + m);
    }
}
