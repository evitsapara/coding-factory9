package gr.aueb.cf.cf9.ch6;

/**
 * When we copy references, then,
 * copy gets named shallow and
 * it has side effects
 */
public class ArrayShallowCopy {

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };
        int [] arrCopy = arr;     // Shallow copy

        arrCopy[0] = 1000;
        System.out.println(arr[0]);
    }
}
