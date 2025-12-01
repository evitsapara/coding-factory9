package gr.aueb.cf.cf9.ch7;

/**
 * Anagrams are strings that have the same characters, but in a different order.
 * For instance, "listen" and "silent" are anagrams.
 */
public class Anagrams {

    public static void main(String[] args) {

    }

    /**
     * Checks if two strings are anagrams.
     * @param str1
     * @param str2
     * @return
     */
    public static boolean isAnagram(String str1, String str2) {
        if (str1.length() != str2.length()) return false;

        int[] frequency = new int[256];         // full ascii

        for (char c: str1.toCharArray()) {
            frequency[c]++;
        }

        for (char c: str2.toCharArray()) {
            frequency[c]--;
            if (frequency[c] < 0) return false;

        }
        return true;
    }
}
