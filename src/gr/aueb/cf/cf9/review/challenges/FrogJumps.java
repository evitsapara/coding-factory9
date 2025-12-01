package gr.aueb.cf.cf9.review.challenges;

/**
 * From point x, to go to point y
 * where every jump is j.
 *
 * Let x = 10
 * y = 55
 * jump = 25
 */
public class FrogJumps {

    public static void main(String[] args) {
        int x = 10;
        int y = 55;
        int jump = 25;
        int jumps = 0;
    }
    public static int frogJumps(int start, int end, int jump) {
        int jumps = 0;
        while (start < end) {
            start += jump;
            jumps++;
        }
        return jumps;
    }
    public static int frogJumps2(int start, int end, int jump) {
        return (int) Math.ceil((end - start) / (double) jump);
    }
}
