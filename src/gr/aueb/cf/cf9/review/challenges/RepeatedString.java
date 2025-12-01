package gr.aueb.cf.cf9.review.challenges;

/**
 * Given a {@link String} it returns a String
 * that consists of a repeat of the original String, n times.
 */
public class RepeatedString {

    public static void main(String[] args) {
        String str = "Hello";
        int n = 3;
        String result = repeatString(str, n);
        System.out.println(result);
    }

    public static String repeatString(String str, int n) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            sb.append(str);
        }
        return sb.toString();
    }
}
