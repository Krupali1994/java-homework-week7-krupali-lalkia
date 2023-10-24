package homeworkweek7;

import java.util.Scanner;

/**
 * Write a java program that tells us that Input number
 * is odd or even?  HINT: use ternary operator ?
 */
public class Programme1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number:   ");
        int number = scanner.nextInt();
        String evenODD = (number % 2 == 0) ? "Even" : "Odd";
        System.out.println(number + " is " + evenODD);
        scanner.close();

    }
}
