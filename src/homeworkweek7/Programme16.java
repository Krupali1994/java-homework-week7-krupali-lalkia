package homeworkweek7;

import java.util.Scanner;

/**
 * Write the java program to check if enter number is “POSITIVE”,
 * “NEGATIVE” or  “ZERO”
 */
public class Programme16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any Number: ");
        double number = scanner.nextDouble();
        if (number > 0) {
            System.out.println("The Entered Number is Positive");
        } else if (number < 0) {
            System.out.println("The Entered Number is Negative");
        } else {
            System.out.println("The Entered Number is Zero");
        }
        scanner.close();

    }

}
