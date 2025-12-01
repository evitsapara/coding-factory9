package gr.aueb.cf.cf9.ch5;

import java.util.Scanner;

/**
 * Calculator
 */
public class CalculatorApp {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int choice = 0;
        final int EXIT = 6;
        int result = 0;

        while (true) {
            printMenu();
            choice = getOneInt();

            if (isChoiceValid(choice)) {
                System.out.println("Your choice should be between 1 - 6");
                continue;
            }

            if (choice == EXIT) {
                System.out.println("Bye!");
                break;
            }
            result = getResultOnChoice(choice);
            System.out.println("The result is: " + result);
        }
    }

    public static void printMenu() {
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        System.out.println("5. Division Remainder");
        System.out.println("6. Exit");
        System.out.println("Please enter your choice: ");
    }

    public static int getOneInt() {
        return scanner.nextInt();
    }

    public static boolean isChoiceValid(int choice) {
        return choice >= 1 && choice <= 6;
    }

    public static int getResultOnChoice(int choice) {
        int num1 = 0;
        int num2 = 0;
        int result = 0;

        System.out.println("Please enter two numbers: ");
        num1 = getOneInt();
        num2 = getOneInt();

//        switch (choice) {
//            case 1:
//                result = add(num1, num2)
//                break;
//            case 2:
//                result = sub(num1, num2);
//                break;
//            case 3:
//                result = mul(num1, num2);
//                break;
//            case 4:
//                result = div(num1, num2);
//                break;
//            case 5:
//                result = mod(num1, num2);
//                break;
//            default:
//                System.out.println("Invalid choice");
//                break;
//        }
//        return result;
//    }
        return switch (choice) {
            case 1 -> add(num1, num2);
            case 2 -> sub(num1, num2);
            case 3 -> mul(num1, num2);
            case 4 -> div(num1, num2);
            case 5 -> mod(num1, num2);
            default -> 0;
        };
    }

    public static int add(int num1, int num2) {
        return num1 + num2;
    }

    public static int sub(int num1, int num2) {
        return num1 - num2;
    }

    public static int mul(int num1, int num2) {
        return num1 * num2;
    }
    public static int div(int num1, int num2) {
        if (num2 == 0) return 0;
        return num1 / num2;
    }

    public static int mod(int num1, int num2) {
        if (num2 == 0) return 0;
        return num1 % num2;
    }
    }