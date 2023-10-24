package homeworkweek7;

import java.util.Scanner;

/**
 * Write a program that tells us input value is number or an alphabet or
 * symbol
 */
public class Programme12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a Character: ");
        char input = scanner.next().charAt(0);

        if ((input >= 'a' && input <= 'z') || (input >= 'A' && input <= 'Z')) {
            System.out.println("Input character is an Alphabet");
        } else if (input >= '0' && input <= '9') {
            System.out.println("Input character is a Number");
        } else {
            System.out.println("Input character is a Symbol");
        }
        scanner.close();
    }
}
