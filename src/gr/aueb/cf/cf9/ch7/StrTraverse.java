package gr.aueb.cf.cf9.ch7;

/**
 * Traverses a String one-by-one character by character.
 * Not with an enhances for loop, but with the classic for loop.
 */
public class StrTraverse {

    public static void main(String[] args) {
        String str = "Coding Factory";

        for (int i = 0; i < str.length(); i++) {
            System.out.println(str.charAt(i) + " ");
        }
        System.out.println();

        // prints the reversed string
        for (int i = str.length() - 1; i >= 0; i--) {
            System.out.println(str.charAt(i) + " ");
        }
    }
}
