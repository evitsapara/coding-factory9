package gr.aueb.cf.cf9.review.senior_level;

import java.util.Scanner;

/**
 * Create a message that contains the name and age of a person.
 */
public class StrConCat {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = "";
        int age = 0;
        String message = "";

        // Input data with scanner, Validation and Data binding
        System.out.println("Please enter your name: ");
        name = scanner.nextLine();

        System.out.println("Please enter your age: ");
        while (!scanner.hasNextInt()) {
            System.out.println("Characters not acceptable, try again: ");
            scanner.nextLine();
        }
        age = scanner.nextInt();

        // Call a service method
        message = createMessage(name, age);

        // Output
        System.out.println(message);
    }

    /**
     *
     * @param name
     * @param age
     * @return
     */
    public static String createMessage(String name, int age) {
        return String.format("Hello, my name is %s and I am %d years old.", name, age);
    }
}
