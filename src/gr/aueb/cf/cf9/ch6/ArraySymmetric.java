package gr.aueb.cf.cf9.ch6;

/**
 * Checks if an integer array
 * is symmetric. An array is
 * symmetric if its read the same from
 * both start and finish.
 * For example, [1, 2, 3, 2, 1] is symmetric.
 */
public class ArraySymmetric {

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 2, 1 };
        boolean isSymmetric;

        isSymmetric = isArraySymmetric(arr);
        System.out.println(isSymmetric);
    }

    public static boolean isArraySymmetric(int[] arr) {
//        boolean isSymmetric = true;

        for (int i = 0, j = arr.length -1; i < j; i++, j--) {
            if (arr[i] != arr[j]) {
//                isSymmetric = false;
//                break;
                return false;
            }
        }
        // return isSymmetric;
        return true;
    }


}
