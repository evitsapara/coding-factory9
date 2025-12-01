package gr.aueb.cf.cf9.ch2;

import java.util.Scanner;

/**
 * Ο χρήστης δίνει του σε κιλά (έστω ακέραιος)
 * και το πρόγραμμα επιστρέφει τα κιλά σε γραμμάρια, όπου
 * θεωρούμε ότι 1 κιλό = 1000 γραμμάρια. Για παράδειγμα, αν δοθεί
 * 20 κιλών, το αποτέλεσμα είναι 20000 γραμμάρια
 */

public class KiloToGrams {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int weightInKilograms = 0;
        int weightInGrams = 0;
        final int KG_TO_GRAMS = 1000;

        System.out.println("Please insert the weight in kilos");
        weightInKilograms = scanner.nextInt();
        weightInGrams = weightInKilograms * KG_TO_GRAMS;

        System.out.printf("The weight of %d kilos is: %d grams", weightInKilograms, weightInGrams);
    }
}
