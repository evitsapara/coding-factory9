package gr.aueb.cf.cf9.ch5;

import java.util.Scanner;

public class PowerRecursiveApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int base = 0;
        int power = 0;
        int result = 0;

        System.out.println("Please enter the base and the exponent: ");
        base = scanner.nextInt();
        power = scanner.nextInt();

        result = powerRecursive(base, power);

        System.out.printf("%d ^ %d = %d\n", base, power, result);
    }

    public static int powerRecursive(int base, int power) {
//        if (power == 0) {
//            return 1;
//        }
//
//        return base * powerRecursive(base, power - 1);
        return power == 0 ? 1 : base * powerRecursive(base, power - 1);
    }
}
